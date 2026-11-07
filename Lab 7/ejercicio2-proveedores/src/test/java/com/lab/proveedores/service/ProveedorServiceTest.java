package com.lab.proveedores.service;

import com.lab.proveedores.dto.ProveedorRequest;
import com.lab.proveedores.exception.ProveedorNotFoundException;
import com.lab.proveedores.model.Estado;
import com.lab.proveedores.model.Proveedor;
import com.lab.proveedores.repository.ProveedorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProveedorServiceTest {

    @Mock
    private ProveedorRepository proveedorRepository;

    @InjectMocks
    private ProveedorService proveedorService;

    @Test
    void crearProveedor_debeGuardarYRetornarProveedorConId() {
        ProveedorRequest request = new ProveedorRequest(
                "Ana", "López", "ana.lopez@proveedor.com", "Tecnología", null);
        Proveedor guardado = new Proveedor(
                1L, "Ana", "López", "ana.lopez@proveedor.com", "Tecnología", Estado.ACTIVO);
        when(proveedorRepository.guardar(any(Proveedor.class))).thenReturn(guardado);

        Proveedor resultado = proveedorService.crear(request);

        assertEquals(1L, resultado.id());
        assertEquals("Ana", resultado.nombre());
        assertEquals(Estado.ACTIVO, resultado.estado());
        verify(proveedorRepository).guardar(any(Proveedor.class));
    }

    @Test
    void obtenerProveedorExistente_debeRetornarElProveedor() {
        Proveedor existente = new Proveedor(
                1L, "Ana", "López", "ana.lopez@proveedor.com", "Tecnología", Estado.ACTIVO);
        when(proveedorRepository.buscarPorId(1L)).thenReturn(Optional.of(existente));

        Proveedor resultado = proveedorService.obtenerPorId(1L);

        assertEquals(existente, resultado);
    }

    @Test
    void obtenerProveedorInexistente_debeLanzarProveedorNotFoundException() {
        when(proveedorRepository.buscarPorId(99L)).thenReturn(Optional.empty());

        assertThrows(ProveedorNotFoundException.class, () -> proveedorService.obtenerPorId(99L));
    }
}
