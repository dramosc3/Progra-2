package com.laboratorio.biblioteca.dto;

import com.laboratorio.biblioteca.model.EstadoLibro;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Datos de entrada para registrar o actualizar un libro.
 */
public record LibroRequest(

        @NotBlank(message = "el título es obligatorio")
        @Size(max = 150, message = "el título no puede superar los 150 caracteres")
        String titulo,

        @NotBlank(message = "el autor es obligatorio")
        @Size(max = 100, message = "el autor no puede superar los 100 caracteres")
        String autor,

        @NotBlank(message = "el ISBN es obligatorio")
        @Pattern(regexp = "^(?:\\d[- ]?){9}[\\dXx]$|^(?:\\d[- ]?){12}\\d$",
                message = "el ISBN debe tener 10 o 13 dígitos (se permiten guiones)")
        String isbn,

        @NotNull(message = "el año de publicación es obligatorio")
        @Min(value = 1000, message = "el año de publicación debe ser mayor o igual a 1000")
        @Max(value = 2100, message = "el año de publicación debe ser menor o igual a 2100")
        Integer anioPublicacion,

        @NotNull(message = "el estado es obligatorio (DISPONIBLE, PRESTADO o EN_REPARACION)")
        EstadoLibro estado) {
}
