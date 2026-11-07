package com.laboratorio.hotel.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Datos de entrada para crear o actualizar una reserva.
 * Las fechas se envían en formato ISO: yyyy-MM-dd.
 */
public record ReservaRequest(

        @NotBlank(message = "el nombre del cliente es obligatorio")
        @Size(max = 100, message = "el nombre del cliente no puede superar los 100 caracteres")
        String nombreCliente,

        @NotBlank(message = "la habitación es obligatoria")
        @Size(max = 20, message = "la habitación no puede superar los 20 caracteres")
        String habitacion,

        @NotNull(message = "la fecha de entrada es obligatoria")
        LocalDate fechaEntrada,

        @NotNull(message = "la fecha de salida es obligatoria")
        LocalDate fechaSalida) {
}
