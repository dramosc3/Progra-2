package com.laboratorio.hotel.dto;

import java.time.LocalDate;

import com.laboratorio.hotel.model.EstadoReserva;
import com.laboratorio.hotel.model.Reserva;

/**
 * Datos de salida que se devuelven al consultar una reserva.
 */
public record ReservaResponse(
        Long id,
        String nombreCliente,
        String habitacion,
        LocalDate fechaEntrada,
        LocalDate fechaSalida,
        EstadoReserva estado) {

    public static ReservaResponse desde(Reserva reserva) {
        return new ReservaResponse(
                reserva.getId(),
                reserva.getNombreCliente(),
                reserva.getHabitacion(),
                reserva.getFechaEntrada(),
                reserva.getFechaSalida(),
                reserva.getEstado());
    }
}
