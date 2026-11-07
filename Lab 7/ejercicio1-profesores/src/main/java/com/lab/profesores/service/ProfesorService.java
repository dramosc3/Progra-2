package com.lab.profesores.service;

import com.lab.profesores.dto.ProfesorRequest;
import com.lab.profesores.exception.ProfesorNotFoundException;
import com.lab.profesores.model.Estado;
import com.lab.profesores.model.Profesor;
import com.lab.profesores.repository.ProfesorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    public Profesor crear(ProfesorRequest request) {
        Estado estado = request.estado() != null ? request.estado() : Estado.ACTIVO;
        Profesor nuevo = new Profesor(
                null,
                request.nombre().trim(),
                request.apellido().trim(),
                request.correo().trim(),
                request.especialidad().trim(),
                estado);
        return profesorRepository.guardar(nuevo);
    }

    public List<Profesor> listar(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            return profesorRepository.listarTodos();
        }
        return profesorRepository.buscarPorEspecialidad(especialidad.trim());
    }

    public Profesor obtenerPorId(Long id) {
        return profesorRepository.buscarPorId(id)
                .orElseThrow(() -> new ProfesorNotFoundException(id));
    }
}
