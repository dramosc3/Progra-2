package com.laboratorio.biblioteca.exception;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Estructura estándar de error que devuelve la API en formato JSON.
 */
public record ErrorResponse(
        LocalDateTime timestamp,
        int status,
        String error,
        String mensaje,
        List<String> detalles) {
}
