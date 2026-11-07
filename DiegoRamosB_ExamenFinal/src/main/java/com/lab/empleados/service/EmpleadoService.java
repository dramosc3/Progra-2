package com.lab.empleados.service;

import com.lab.empleados.dto.EmpleadoRequest;
import com.lab.empleados.exception.EmpleadoNotFoundException;
import com.lab.empleados.model.Estado;
import com.lab.empleados.model.Empleado;
import com.lab.empleados.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Empleado crear(EmpleadoRequest request) {
        Estado estado = request.estado() != null ? request.estado() : Estado.ACTIVO;
        Empleado nuevo = new Empleado(
                null,
                request.nombre().trim(),
                request.apellido().trim(),
                request.correo().trim(),
                request.especialidad().trim(),
                estado);
        return empleadoRepository.guardar(nuevo);
    }

    public List<Empleado> listar(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            return empleadoRepository.listarTodos();
        }
        return empleadoRepository.buscarPorEspecialidad(especialidad.trim());
    }

    public Empleado obtenerPorId(Long id) {
        return empleadoRepository.buscarPorId(id)
                .orElseThrow(() -> new EmpleadoNotFoundException(id));
    }
}
