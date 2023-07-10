package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AsignaturaService {

    @Autowired
    AsignaturaRepository asignaturaRepository;

    public List<AsignaturaEntity> obtenerTodosLasAsignaturas() {
        return asignaturaRepository.findAll();
    }

    public Optional<AsignaturaEntity> obtenerAsignaturaPorId(Long id) {
        return asignaturaRepository.findById(id);
    }

    public List<AsignaturaEntity> obtenerAsignaturaPorFiltro(Long asignatura_id, String asignatura_nombre){
        return asignaturaRepository.findByFilters(asignatura_id, asignatura_nombre);
    }

    public AsignaturaEntity guardarAsignatura(AsignaturaEntity asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public void eliminarAsignatura(Long id) {
        asignaturaRepository.deleteById(id);
    }

    public List<AsignaturaEntity> findByAsignaturaCursoDocente(Long asignatura_id, String asignatura_nombre,
                                                            Long curso_id,String curso_nombre,
                                                            Long docente_id, String docente_persona_run, Long curso_establecimiento_establecimiento_id){
        return asignaturaRepository.findByAsignaturaCursoDocente(asignatura_id, asignatura_nombre, curso_id, curso_nombre, docente_id,docente_persona_run, curso_establecimiento_establecimiento_id );
    }

}
