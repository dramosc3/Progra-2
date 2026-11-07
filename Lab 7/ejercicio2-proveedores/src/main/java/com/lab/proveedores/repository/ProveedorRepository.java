package com.lab.proveedores.repository;

import com.lab.proveedores.model.Proveedor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Repositorio en memoria: almacena los proveedores en una lista.
 */
@Repository
public class ProveedorRepository {

    private final List<Proveedor> proveedores = new CopyOnWriteArrayList<>();
    private final AtomicLong secuenciaId = new AtomicLong(0);

    public Proveedor guardar(Proveedor proveedor) {
        Proveedor guardado = new Proveedor(
                secuenciaId.incrementAndGet(),
                proveedor.nombre(),
                proveedor.apellido(),
                proveedor.correo(),
                proveedor.categoria(),
                proveedor.estado());
        proveedores.add(guardado);
        return guardado;
    }

    public List<Proveedor> listarTodos() {
        return List.copyOf(proveedores);
    }

    public Optional<Proveedor> buscarPorId(Long id) {
        return proveedores.stream()
                .filter(proveedor -> proveedor.id().equals(id))
                .findFirst();
    }

    public List<Proveedor> buscarPorCategoria(String categoria) {
        return proveedores.stream()
                .filter(proveedor -> proveedor.categoria().equalsIgnoreCase(categoria))
                .toList();
    }
}
