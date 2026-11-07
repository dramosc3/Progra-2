package com.laboratorio.hotel.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.laboratorio.hotel.dto.ReservaRequest;
import com.laboratorio.hotel.dto.ReservaResponse;
import com.laboratorio.hotel.service.ReservaService;

import jakarta.validation.Valid;

/**
 * Endpoints REST para administrar las reservas del hotel.
 */
@RestController
@RequestMapping("/api/v1/reservas")
public class ReservaController {

    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping
    public ResponseEntity<ReservaResponse> crear(@Valid @RequestBody ReservaRequest request) {
        ReservaResponse creada = reservaService.crear(request);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(creada.id())
                .toUri();
        return ResponseEntity.created(ubicacion).body(creada);
    }

    @GetMapping
    public List<ReservaResponse> consultarTodas() {
        return reservaService.consultarTodas();
    }

    @GetMapping("/{id}")
    public ReservaResponse consultarPorId(@PathVariable("id") Long id) {
        return reservaService.consultarPorId(id);
    }

    @PutMapping("/{id}")
    public ReservaResponse actualizar(@PathVariable("id") Long id, @Valid @RequestBody ReservaRequest request) {
        return reservaService.actualizar(id, request);
    }

    @PatchMapping("/{id}/cancelar")
    public ReservaResponse cancelar(@PathVariable("id") Long id) {
        return reservaService.cancelar(id);
    }
}
