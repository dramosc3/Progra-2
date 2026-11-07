package com.lab.proveedores.service;

import com.lab.proveedores.dto.ProveedorRequest;
import com.lab.proveedores.exception.ProveedorNotFoundException;
import com.lab.proveedores.model.Estado;
import com.lab.proveedores.model.Proveedor;
import com.lab.proveedores.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public Proveedor crear(ProveedorRequest request) {
        Estado estado = request.estado() != null ? request.estado() : Estado.ACTIVO;
        Proveedor nuevo = new Proveedor(
                null,
                request.nombre().trim(),
                request.apellido().trim(),
                request.correo().trim(),
                request.categoria().trim(),
                estado);
        return proveedorRepository.guardar(nuevo);
    }

    public List<Proveedor> listar(String categoria) {
        if (categoria == null || categoria.isBlank()) {
            return proveedorRepository.listarTodos();
        }
        return proveedorRepository.buscarPorCategoria(categoria.trim());
    }

    public Proveedor obtenerPorId(Long id) {
        return proveedorRepository.buscarPorId(id)
                .orElseThrow(() -> new ProveedorNotFoundException(id));
    }
}
