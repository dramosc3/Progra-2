package com.lab.proveedores.exception;

import java.time.LocalDateTime;
import java.util.List;

public record ApiError(
        int status,
        String error,
        String mensaje,
        List<String> detalles,
        LocalDateTime fecha
) {
    public static ApiError of(int status, String error, String mensaje, List<String> detalles) {
        return new ApiError(status, error, mensaje, detalles, LocalDateTime.now());
    }
}
