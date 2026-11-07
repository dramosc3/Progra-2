package com.lab.profesores.service;

import com.lab.profesores.dto.ProfesorRequest;
import com.lab.profesores.exception.ProfesorNotFoundException;
import com.lab.profesores.model.Estado;
import com.lab.profesores.model.Profesor;
import com.lab.profesores.repository.ProfesorRepository;
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
class ProfesorServiceTest {

    @Mock
    private ProfesorRepository profesorRepository;

    @InjectMocks
    private ProfesorService profesorService;

    @Test
    void crearProfesor_debeGuardarYRetornarProfesorConId() {
        ProfesorRequest request = new ProfesorRequest(
                "Ana", "López", "ana.lopez@universidad.edu", "Matemática", null);
        Profesor guardado = new Profesor(
                1L, "Ana", "López", "ana.lopez@universidad.edu", "Matemática", Estado.ACTIVO);
        when(profesorRepository.guardar(any(Profesor.class))).thenReturn(guardado);

        Profesor resultado = profesorService.crear(request);

        assertEquals(1L, resultado.id());
        assertEquals("Ana", resultado.nombre());
        assertEquals(Estado.ACTIVO, resultado.estado());
        verify(profesorRepository).guardar(any(Profesor.class));
    }

    @Test
    void obtenerProfesorExistente_debeRetornarElProfesor() {
        Profesor existente = new Profesor(
                1L, "Ana", "López", "ana.lopez@universidad.edu", "Matemática", Estado.ACTIVO);
        when(profesorRepository.buscarPorId(1L)).thenReturn(Optional.of(existente));

        Profesor resultado = profesorService.obtenerPorId(1L);

        assertEquals(existente, resultado);
    }

    @Test
    void obtenerProfesorInexistente_debeLanzarProfesorNotFoundException() {
        when(profesorRepository.buscarPorId(99L)).thenReturn(Optional.empty());

        assertThrows(ProfesorNotFoundException.class, () -> profesorService.obtenerPorId(99L));
    }
}
