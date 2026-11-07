package com.laboratorio.universidad.dto;

import com.laboratorio.universidad.model.Curso;
import com.laboratorio.universidad.model.EstadoCurso;

/**
 * Datos de salida que se devuelven al consultar un curso.
 */
public record CursoResponse(
        Long id,
        String nombre,
        String codigo,
        Integer creditos,
        EstadoCurso estado) {

    public static CursoResponse desde(Curso curso) {
        return new CursoResponse(
                curso.getId(),
                curso.getNombre(),
                curso.getCodigo(),
                curso.getCreditos(),
                curso.getEstado());
    }
}
