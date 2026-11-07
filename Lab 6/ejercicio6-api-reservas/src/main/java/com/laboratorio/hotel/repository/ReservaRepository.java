package com.laboratorio.hotel.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.laboratorio.hotel.model.Reserva;

/**
 * Repositorio en memoria: los datos viven en una lista y se pierden al detener la aplicación.
 */
@Repository
public class ReservaRepository {

    private final List<Reserva> reservas = new ArrayList<>();
    private final AtomicLong secuencia = new AtomicLong(0);

    public synchronized List<Reserva> findAll() {
        return new ArrayList<>(reservas);
    }

    public synchronized Optional<Reserva> findById(Long id) {
        return reservas.stream()
                .filter(reserva -> reserva.getId().equals(id))
                .findFirst();
    }

    public synchronized List<Reserva> findByHabitacion(String habitacion) {
        return reservas.stream()
                .filter(reserva -> reserva.getHabitacion().equalsIgnoreCase(habitacion))
                .toList();
    }

    /**
     * Inserta la reserva (asignándole un id nuevo) o reemplaza la existente si ya tiene id.
     */
    public synchronized Reserva save(Reserva reserva) {
        if (reserva.getId() == null) {
            reserva.setId(secuencia.incrementAndGet());
            reservas.add(reserva);
        } else {
            for (int i = 0; i < reservas.size(); i++) {
                if (reservas.get(i).getId().equals(reserva.getId())) {
                    reservas.set(i, reserva);
                    break;
                }
            }
        }
        return reserva;
    }
}
