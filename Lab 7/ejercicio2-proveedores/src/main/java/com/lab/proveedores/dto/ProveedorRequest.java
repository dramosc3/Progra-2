package com.lab.proveedores.dto;

import com.lab.proveedores.model.Estado;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ProveedorRequest(
        @NotBlank(message = "El nombre es obligatorio")
        String nombre,

        @NotBlank(message = "El apellido es obligatorio")
        String apellido,

        @NotBlank(message = "El correo es obligatorio")
        @Email(regexp = "^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$", message = "El correo no tiene un formato válido")
        String correo,

        @NotBlank(message = "La categoría es obligatoria")
        String categoria,

        Estado estado
) {
}
