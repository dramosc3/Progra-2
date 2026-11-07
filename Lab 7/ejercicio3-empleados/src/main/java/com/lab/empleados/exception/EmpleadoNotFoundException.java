package com.lab.empleados.exception;

public class EmpleadoNotFoundException extends RuntimeException {

    public EmpleadoNotFoundException(Long id) {
        super("No se encontró el empleado con id " + id);
    }
}
