package com.laboratorio.biblioteca.dto;

import com.laboratorio.biblioteca.model.EstadoLibro;
import com.laboratorio.biblioteca.model.Libro;

/**
 * Datos de salida que se devuelven al consultar un libro.
 */
public record LibroResponse(
        Long id,
        String titulo,
        String autor,
        String isbn,
        Integer anioPublicacion,
        EstadoLibro estado) {

    public static LibroResponse desde(Libro libro) {
        return new LibroResponse(
                libro.getId(),
                libro.getTitulo(),
                libro.getAutor(),
                libro.getIsbn(),
                libro.getAnioPublicacion(),
                libro.getEstado());
    }
}
