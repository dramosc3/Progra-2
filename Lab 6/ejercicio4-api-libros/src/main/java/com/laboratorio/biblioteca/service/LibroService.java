package com.laboratorio.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laboratorio.biblioteca.dto.LibroRequest;
import com.laboratorio.biblioteca.dto.LibroResponse;
import com.laboratorio.biblioteca.exception.ConflictoException;
import com.laboratorio.biblioteca.exception.RecursoNoEncontradoException;
import com.laboratorio.biblioteca.model.Libro;
import com.laboratorio.biblioteca.repository.LibroRepository;

/**
 * Lógica de negocio para la gestión de libros.
 */
@Service
public class LibroService {

    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public LibroResponse registrar(LibroRequest request) {
        String isbn = normalizarIsbn(request.isbn());
        if (libroRepository.existsByIsbn(isbn)) {
            throw new ConflictoException("Ya existe un libro registrado con el ISBN " + isbn);
        }
        Libro libro = new Libro(null, request.titulo().trim(), request.autor().trim(), isbn,
                request.anioPublicacion(), request.estado());
        return LibroResponse.desde(libroRepository.save(libro));
    }

    public List<LibroResponse> consultarTodos() {
        return libroRepository.findAll().stream()
                .map(LibroResponse::desde)
                .toList();
    }

    public LibroResponse consultarPorTitulo(String titulo) {
        Libro libro = libroRepository.findByTitulo(titulo.trim())
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe un libro con el título '" + titulo + "'"));
        return LibroResponse.desde(libro);
    }

    public LibroResponse actualizar(Long id, LibroRequest request) {
        Libro libro = buscarPorId(id);
        String isbn = normalizarIsbn(request.isbn());
        if (libroRepository.existsByIsbnAndIdNot(isbn, id)) {
            throw new ConflictoException("Ya existe otro libro registrado con el ISBN " + isbn);
        }
        libro.setTitulo(request.titulo().trim());
        libro.setAutor(request.autor().trim());
        libro.setIsbn(isbn);
        libro.setAnioPublicacion(request.anioPublicacion());
        libro.setEstado(request.estado());
        return LibroResponse.desde(libroRepository.save(libro));
    }

    public void eliminar(Long id) {
        if (!libroRepository.deleteById(id)) {
            throw new RecursoNoEncontradoException("No existe un libro con id " + id);
        }
    }

    private Libro buscarPorId(Long id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe un libro con id " + id));
    }

    /** Guarda el ISBN sin guiones ni espacios para poder detectar duplicados. */
    private String normalizarIsbn(String isbn) {
        return isbn.replaceAll("[- ]", "").toUpperCase();
    }
}
