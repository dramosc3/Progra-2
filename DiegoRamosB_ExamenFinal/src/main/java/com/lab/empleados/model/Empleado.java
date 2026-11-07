package com.lab.empleados.model;

public record Empleado(
        Long id,
        String nombre,
        String apellido,
        String correo,
        String especialidad,
        Estado estado
) {
}
