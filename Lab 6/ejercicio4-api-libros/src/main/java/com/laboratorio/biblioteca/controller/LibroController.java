package com.laboratorio.biblioteca.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.laboratorio.biblioteca.dto.LibroRequest;
import com.laboratorio.biblioteca.dto.LibroResponse;
import com.laboratorio.biblioteca.service.LibroService;

import jakarta.validation.Valid;

/**
 * Endpoints REST para administrar los libros de la biblioteca.
 */
@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @PostMapping
    public ResponseEntity<LibroResponse> registrar(@Valid @RequestBody LibroRequest request) {
        LibroResponse creado = libroService.registrar(request);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(creado.id())
                .toUri();
        return ResponseEntity.created(ubicacion).body(creado);
    }

    @GetMapping
    public List<LibroResponse> consultarTodos() {
        return libroService.consultarTodos();
    }

    @GetMapping("/titulo/{titulo}")
    public LibroResponse consultarPorTitulo(@PathVariable("titulo") String titulo) {
        return libroService.consultarPorTitulo(titulo);
    }

    @PutMapping("/{id}")
    public LibroResponse actualizar(@PathVariable("id") Long id, @Valid @RequestBody LibroRequest request) {
        return libroService.actualizar(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable("id") Long id) {
        libroService.eliminar(id);
    }
}
