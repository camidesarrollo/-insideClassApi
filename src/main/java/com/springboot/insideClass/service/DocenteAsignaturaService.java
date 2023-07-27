package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import com.springboot.insideClass.repository.DocenteAsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteAsignaturaService {

    @Autowired
    private DocenteAsignaturaRepository docenteAsignaturaRepository;

    public List<DocenteAsignaturaEntity> obtenerTodosLosDocenteAsignatura() {
        return docenteAsignaturaRepository.findAll();
    }

    public Optional<DocenteAsignaturaEntity> obtenerDocenteAsignaturaPorId(Long id) {
        return docenteAsignaturaRepository.findById(id);
    }

    public List<DocenteAsignaturaEntity> obtenerDocenteAsignaturaPorFiltro(Long asignatura_id, String asignatura_nombre, Long docente_id, String docente_persona_run) {
        System.out.println(asignatura_id);
        System.out.println(asignatura_nombre);
        System.out.println(docente_id);
        System.out.println(docente_persona_run);
        return docenteAsignaturaRepository.findByFilters(asignatura_id, asignatura_nombre, docente_id, docente_persona_run);
    }

    public DocenteAsignaturaEntity guardarDocenteAsignatura(DocenteAsignaturaEntity docente) {
        return docenteAsignaturaRepository.save(docente);
    }

    public void eliminarDocenteAsignatura(Long id) {
        docenteAsignaturaRepository.deleteById(id);
    }
}
