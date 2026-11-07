package com.lab.empleados.repository;

import com.lab.empleados.model.Empleado;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repositorio en memoria: almacena los empleados en una lista.
 */
@Repository
public class EmpleadoRepository {

    private final List<Empleado> empleados = new CopyOnWriteArrayList<>();
    private final AtomicLong secuenciaId = new AtomicLong(0);

    public Empleado guardar(Empleado empleado) {
        Empleado guardado = new Empleado(
                secuenciaId.incrementAndGet(),
                empleado.nombre(),
                empleado.apellido(),
                empleado.correo(),
                empleado.especialidad(),
                empleado.estado());
        empleados.add(guardado);
        return guardado;
    }

    public List<Empleado> listarTodos() {
        return List.copyOf(empleados);
    }

    public Optional<Empleado> buscarPorId(Long id) {
        return empleados.stream()
                .filter(empleado -> empleado.id().equals(id))
                .findFirst();
    }

    public List<Empleado> buscarPorEspecialidad(String especialidad) {
        return empleados.stream()
                .filter(empleado -> empleado.especialidad().equalsIgnoreCase(especialidad))
                .toList();
    }
}
