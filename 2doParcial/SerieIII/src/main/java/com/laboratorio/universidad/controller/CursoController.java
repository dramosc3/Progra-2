package com.laboratorio.universidad.controller;

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

import com.laboratorio.universidad.dto.CursoRequest;
import com.laboratorio.universidad.dto.CursoResponse;
import com.laboratorio.universidad.service.CursoService;

import jakarta.validation.Valid;

/**
 * Endpoints REST para administrar los cursos universitarios.
 */
@RestController
@RequestMapping("/api/v1/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public ResponseEntity<CursoResponse> crear(@Valid @RequestBody CursoRequest request) {
        CursoResponse creado = cursoService.crear(request);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(creado.id())
                .toUri();
        return ResponseEntity.created(ubicacion).body(creado);
    }

    @GetMapping
    public List<CursoResponse> consultarTodos() {
        return cursoService.consultarTodos();
    }

    @GetMapping("/codigo/{codigo}")
    public CursoResponse consultarPorCodigo(@PathVariable("codigo") String codigo) {
        return cursoService.consultarPorCodigo(codigo);
    }

    @PutMapping("/{id}")
    public CursoResponse actualizar(@PathVariable("id") Long id, @Valid @RequestBody CursoRequest request) {
        return cursoService.actualizar(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable("id") Long id) {
        cursoService.eliminar(id);
    }
}
