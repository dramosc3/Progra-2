package com.laboratorio.biblioteca.exception;

/**
 * Se lanza cuando la operación entra en conflicto con el estado actual (HTTP 409).
 */
public class ConflictoException extends RuntimeException {

    public ConflictoException(String mensaje) {
        super(mensaje);
    }
}
