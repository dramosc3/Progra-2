package com.laboratorio.universidad.dto;

import com.laboratorio.universidad.model.EstadoCurso;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Datos de entrada para crear o actualizar un curso.
 */
public record CursoRequest(

        @NotBlank(message = "el nombre es obligatorio")
        @Size(max = 120, message = "el nombre no puede superar los 120 caracteres")
        String nombre,

        @NotBlank(message = "el código es obligatorio")
        @Pattern(regexp = "^[A-Za-z0-9-]{1,20}$",
                message = "el código solo admite letras, números y guiones (máximo 20 caracteres)")
        String codigo,

        @NotNull(message = "los créditos son obligatorios")
        @Min(value = 1, message = "los créditos deben ser mayores o iguales a 1")
        @Max(value = 10, message = "los créditos deben ser menores o iguales a 10")
        Integer creditos,

        @NotNull(message = "el estado es obligatorio (ACTIVO o INACTIVO)")
        EstadoCurso estado) {
}
