package com.lab.profesores.repository;

import com.lab.profesores.model.Profesor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repositorio en memoria: almacena los profesores en una lista.
 */
@Repository
public class ProfesorRepository {

    private final List<Profesor> profesores = new CopyOnWriteArrayList<>();
    private final AtomicLong secuenciaId = new AtomicLong(0);

    public Profesor guardar(Profesor profesor) {
        Profesor guardado = new Profesor(
                secuenciaId.incrementAndGet(),
                profesor.nombre(),
                profesor.apellido(),
                profesor.correo(),
                profesor.especialidad(),
                profesor.estado());
        profesores.add(guardado);
        return guardado;
    }

    public List<Profesor> listarTodos() {
        return List.copyOf(profesores);
    }

    public Optional<Profesor> buscarPorId(Long id) {
        return profesores.stream()
                .filter(profesor -> profesor.id().equals(id))
                .findFirst();
    }

    public List<Profesor> buscarPorEspecialidad(String especialidad) {
        return profesores.stream()
                .filter(profesor -> profesor.especialidad().equalsIgnoreCase(especialidad))
                .toList();
    }
}
