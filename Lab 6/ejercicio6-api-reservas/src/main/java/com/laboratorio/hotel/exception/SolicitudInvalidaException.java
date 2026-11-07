package com.laboratorio.hotel.exception;

/**
 * Se lanza cuando los datos incumplen una regla de negocio (HTTP 400).
 */
public class SolicitudInvalidaException extends RuntimeException {

    public SolicitudInvalidaException(String mensaje) {
        super(mensaje);
    }
}
