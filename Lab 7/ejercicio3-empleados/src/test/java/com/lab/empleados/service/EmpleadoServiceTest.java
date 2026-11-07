package com.lab.empleados.service;

import com.lab.empleados.dto.EmpleadoRequest;
import com.lab.empleados.exception.EmpleadoNotFoundException;
import com.lab.empleados.model.Estado;
import com.lab.empleados.model.Empleado;
import com.lab.empleados.repository.EmpleadoRepository;
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
class EmpleadoServiceTest {

    @Mock
    private EmpleadoRepository empleadoRepository;

    @InjectMocks
    private EmpleadoService empleadoService;

    @Test
    void crearEmpleado_debeGuardarYRetornarEmpleadoConId() {
        EmpleadoRequest request = new EmpleadoRequest(
                "Ana", "López", "ana.lopez@empresa.com", "Contabilidad", null);
        Empleado guardado = new Empleado(
                1L, "Ana", "López", "ana.lopez@empresa.com", "Contabilidad", Estado.ACTIVO);
        when(empleadoRepository.guardar(any(Empleado.class))).thenReturn(guardado);

        Empleado resultado = empleadoService.crear(request);

        assertEquals(1L, resultado.id());
        assertEquals("Ana", resultado.nombre());
        assertEquals(Estado.ACTIVO, resultado.estado());
        verify(empleadoRepository).guardar(any(Empleado.class));
    }

    @Test
    void obtenerEmpleadoExistente_debeRetornarElEmpleado() {
        Empleado existente = new Empleado(
                1L, "Ana", "López", "ana.lopez@empresa.com", "Contabilidad", Estado.ACTIVO);
        when(empleadoRepository.buscarPorId(1L)).thenReturn(Optional.of(existente));

        Empleado resultado = empleadoService.obtenerPorId(1L);

        assertEquals(existente, resultado);
    }

    @Test
    void obtenerEmpleadoInexistente_debeLanzarEmpleadoNotFoundException() {
        when(empleadoRepository.buscarPorId(99L)).thenReturn(Optional.empty());

        assertThrows(EmpleadoNotFoundException.class, () -> empleadoService.obtenerPorId(99L));
    }
}
