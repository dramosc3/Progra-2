package com.laboratorio.universidad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laboratorio.universidad.dto.CursoRequest;
import com.laboratorio.universidad.dto.CursoResponse;
import com.laboratorio.universidad.exception.ConflictoException;
import com.laboratorio.universidad.exception.RecursoNoEncontradoException;
import com.laboratorio.universidad.model.Curso;
import com.laboratorio.universidad.repository.CursoRepository;

/**
 * Lógica de negocio para la gestión de cursos.
 */
@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public CursoResponse crear(CursoRequest request) {
        String codigo = normalizarCodigo(request.codigo());
        if (cursoRepository.existsByCodigo(codigo)) {
            throw new ConflictoException("Ya existe un curso con el código " + codigo);
        }
        Curso curso = new Curso(null, request.nombre().trim(), codigo, request.creditos(), request.estado());
        return CursoResponse.desde(cursoRepository.save(curso));
    }

    public List<CursoResponse> consultarTodos() {
        return cursoRepository.findAll().stream()
                .map(CursoResponse::desde)
                .toList();
    }

    public CursoResponse consultarPorCodigo(String codigo) {
        String codigoNormalizado = normalizarCodigo(codigo);
        Curso curso = cursoRepository.findByCodigo(codigoNormalizado)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe un curso con el código " + codigoNormalizado));
        return CursoResponse.desde(curso);
    }

    public CursoResponse actualizar(Long id, CursoRequest request) {
        Curso curso = buscarPorId(id);
        String codigo = normalizarCodigo(request.codigo());
        if (cursoRepository.existsByCodigoAndIdNot(codigo, id)) {
            throw new ConflictoException("Ya existe otro curso con el código " + codigo);
        }
        curso.setNombre(request.nombre().trim());
        curso.setCodigo(codigo);
        curso.setCreditos(request.creditos());
        curso.setEstado(request.estado());
        return CursoResponse.desde(cursoRepository.save(curso));
    }

    public void eliminar(Long id) {
        if (!cursoRepository.deleteById(id)) {
            throw new RecursoNoEncontradoException("No existe un curso con id " + id);
        }
    }

    private Curso buscarPorId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("No existe un curso con id " + id));
    }

    /** Los códigos se guardan en mayúsculas y sin espacios laterales (poo-101 -> POO-101). */
    private String normalizarCodigo(String codigo) {
        return codigo.trim().toUpperCase();
    }
}
