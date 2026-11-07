package com.lab.proveedores.model;

public record Proveedor(
        Long id,
        String nombre,
        String apellido,
        String correo,
        String categoria,
        Estado estado
) {
}
