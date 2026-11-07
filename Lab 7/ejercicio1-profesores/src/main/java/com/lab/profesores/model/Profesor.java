package com.lab.profesores.model;

public record Profesor(
        Long id,
        String nombre,
        String apellido,
        String correo,
        String especialidad,
        Estado estado
) {
}
