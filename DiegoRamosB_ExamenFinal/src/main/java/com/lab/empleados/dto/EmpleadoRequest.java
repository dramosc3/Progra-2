package com.lab.empleados.dto;

import com.lab.empleados.model.Estado;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmpleadoRequest(
        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "El apellido es obligatorio")
        String apellido,

        @NotBlank(message = "El correo es obligatorio")
        @Email(regexp = "^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$", message = "El correo no tiene un formato válido")
        String correo,

        @NotBlank(message = "La especialidad es obligatoria")
        String especialidad,

        Estado estado
) {
}
