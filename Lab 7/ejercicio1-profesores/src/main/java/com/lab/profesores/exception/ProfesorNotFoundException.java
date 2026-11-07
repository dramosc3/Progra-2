package com.lab.profesores.exception;

public class ProfesorNotFoundException extends RuntimeException {

    public ProfesorNotFoundException(Long id) {
        super("No se encontró el profesor con id " + id);
    }
}
