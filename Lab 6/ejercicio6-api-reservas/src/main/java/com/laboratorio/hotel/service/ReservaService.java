package com.laboratorio.hotel.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laboratorio.hotel.dto.ReservaRequest;
import com.laboratorio.hotel.dto.ReservaResponse;
import com.laboratorio.hotel.exception.ConflictoException;
import com.laboratorio.hotel.exception.RecursoNoEncontradoException;
import com.laboratorio.hotel.exception.SolicitudInvalidaException;
import com.laboratorio.hotel.model.EstadoReserva;
import com.laboratorio.hotel.model.Reserva;
import com.laboratorio.hotel.repository.ReservaRepository;

/**
 * Lógica de negocio para la gestión de reservas.
 */
@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public ReservaResponse crear(ReservaRequest request) {
        validarFechas(request.fechaEntrada(), request.fechaSalida());
        String habitacion = request.habitacion().trim();
        validarDisponibilidad(habitacion, request.fechaEntrada(), request.fechaSalida(), null);

        Reserva reserva = new Reserva(null, request.nombreCliente().trim(), habitacion,
                request.fechaEntrada(), request.fechaSalida(), EstadoReserva.CONFIRMADA);
        return ReservaResponse.desde(reservaRepository.save(reserva));
    }

    public List<ReservaResponse> consultarTodas() {
        return reservaRepository.findAll().stream()
                .map(ReservaResponse::desde)
                .toList();
    }

    public ReservaResponse consultarPorId(Long id) {
        return ReservaResponse.desde(buscarPorId(id));
    }

    public ReservaResponse actualizar(Long id, ReservaRequest request) {
        Reserva reserva = buscarPorId(id);
        if (reserva.getEstado() == EstadoReserva.CANCELADA) {
            throw new ConflictoException("No se puede actualizar una reserva cancelada");
        }
        validarFechas(request.fechaEntrada(), request.fechaSalida());
        String habitacion = request.habitacion().trim();
        validarDisponibilidad(habitacion, request.fechaEntrada(), request.fechaSalida(), id);

        reserva.setNombreCliente(request.nombreCliente().trim());
        reserva.setHabitacion(habitacion);
        reserva.setFechaEntrada(request.fechaEntrada());
        reserva.setFechaSalida(request.fechaSalida());
        return ReservaResponse.desde(reservaRepository.save(reserva));
    }

    public ReservaResponse cancelar(Long id) {
        Reserva reserva = buscarPorId(id);
        if (reserva.getEstado() == EstadoReserva.CANCELADA) {
            throw new ConflictoException("La reserva con id " + id + " ya está cancelada");
        }
        reserva.setEstado(EstadoReserva.CANCELADA);
        return ReservaResponse.desde(reservaRepository.save(reserva));
    }

    private Reserva buscarPorId(Long id) {
        return reservaRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe una reserva con id " + id));
    }

    private void validarFechas(LocalDate fechaEntrada, LocalDate fechaSalida) {
        if (!fechaSalida.isAfter(fechaEntrada)) {
            throw new SolicitudInvalidaException("La fecha de salida debe ser posterior a la fecha de entrada");
        }
    }

    /**
     * Una habitación no puede tener dos reservas confirmadas cuyas fechas se traslapen.
     * El día de salida queda libre para una nueva entrada.
     */
    private void validarDisponibilidad(String habitacion, LocalDate entrada, LocalDate salida, Long idExcluido) {
        boolean ocupada = reservaRepository.findByHabitacion(habitacion).stream()
                .filter(existente -> existente.getEstado() == EstadoReserva.CONFIRMADA)
                .filter(existente -> !existente.getId().equals(idExcluido))
                .anyMatch(existente -> entrada.isBefore(existente.getFechaSalida())
                        && existente.getFechaEntrada().isBefore(salida));
        if (ocupada) {
            throw new ConflictoException("La habitación " + habitacion + " ya está reservada en esas fechas");
        }
    }
}
