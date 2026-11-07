package com.laboratorio.biblioteca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.laboratorio.biblioteca.model.Libro;

/**
 * Repositorio en memoria: los datos viven en una lista y se pierden al detener la aplicación.
 */
@Repository
public class LibroRepository {

    private final List<Libro> libros = new ArrayList<>();
    private final AtomicLong secuencia = new AtomicLong(0);

    public synchronized List<Libro> findAll() {
        return new ArrayList<>(libros);
    }

    public synchronized Optional<Libro> findById(Long id) {
        return libros.stream()
                .filter(libro -> libro.getId().equals(id))
                .findFirst();
    }

    public synchronized Optional<Libro> findByTitulo(String titulo) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
    }

    public synchronized boolean existsByIsbn(String isbn) {
        return libros.stream().anyMatch(libro -> libro.getIsbn().equals(isbn));
    }

    public synchronized boolean existsByIsbnAndIdNot(String isbn, Long id) {
        return libros.stream()
                .anyMatch(libro -> libro.getIsbn().equals(isbn) && !libro.getId().equals(id));
    }

    /**
     * Inserta el libro (asignándole un id nuevo) o reemplaza el existente si ya tiene id.
     */
    public synchronized Libro save(Libro libro) {
        if (libro.getId() == null) {
            libro.setId(secuencia.incrementAndGet());
            libros.add(libro);
        } else {
            for (int i = 0; i < libros.size(); i++) {
                if (libros.get(i).getId().equals(libro.getId())) {
                    libros.set(i, libro);
                    break;
                }
            }
        }
        return libro;
    }

    public synchronized boolean deleteById(Long id) {
        return libros.removeIf(libro -> libro.getId().equals(id));
    }
}
