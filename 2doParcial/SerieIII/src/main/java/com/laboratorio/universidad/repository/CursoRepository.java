package com.laboratorio.universidad.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.laboratorio.universidad.model.Curso;

/**
 * Repositorio en memoria: los datos viven en una lista y se pierden al detener la aplicación.
 */
@Repository
public class CursoRepository {

    private final List<Curso> cursos = new ArrayList<>();
    private final AtomicLong secuencia = new AtomicLong(0);

    public synchronized List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    public synchronized Optional<Curso> findById(Long id) {
        return cursos.stream()
                .filter(curso -> curso.getId().equals(id))
                .findFirst();
    }

    public synchronized Optional<Curso> findByCodigo(String codigo) {
        return cursos.stream()
                .filter(curso -> curso.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public synchronized boolean existsByCodigo(String codigo) {
        return cursos.stream().anyMatch(curso -> curso.getCodigo().equalsIgnoreCase(codigo));
    }

    public synchronized boolean existsByCodigoAndIdNot(String codigo, Long id) {
        return cursos.stream()
                .anyMatch(curso -> curso.getCodigo().equalsIgnoreCase(codigo) && !curso.getId().equals(id));
    }

    /**
     * Inserta el curso (asignándole un id nuevo) o reemplaza el existente si ya tiene id.
     */
    public synchronized Curso save(Curso curso) {
        if (curso.getId() == null) {
            curso.setId(secuencia.incrementAndGet());
            cursos.add(curso);
        } else {
            for (int i = 0; i < cursos.size(); i++) {
                if (cursos.get(i).getId().equals(curso.getId())) {
                    cursos.set(i, curso);
                    break;
                }
            }
        }
        return curso;
    }

    public synchronized boolean deleteById(Long id) {
        return cursos.removeIf(curso -> curso.getId().equals(id));
    }
}
