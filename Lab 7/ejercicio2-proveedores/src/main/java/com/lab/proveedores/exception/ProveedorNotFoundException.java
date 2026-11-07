package com.lab.proveedores.exception;

public class ProveedorNotFoundException extends RuntimeException {

    public ProveedorNotFoundException(Long id) {
        super("No se encontró el proveedor con id " + id);
    }
}
