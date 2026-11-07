package com.lab.empleados.controller;

import com.lab.empleados.dto.EmpleadoRequest;
import com.lab.empleados.model.Empleado;
import com.lab.empleados.service.EmpleadoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PostMapping
    public ResponseEntity<Empleado> crear(@Valid @RequestBody EmpleadoRequest request) {
        Empleado creado = empleadoService.crear(request);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(creado.id())
                .toUri();
        return ResponseEntity.created(ubicacion).body(creado); // 201 CREATED
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> listar(@RequestParam(required = false) String especialidad) {
        return ResponseEntity.ok(empleadoService.listar(especialidad)); // 200 OK
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(empleadoService.obtenerPorId(id)); // 200 OK o 404
    }
}
