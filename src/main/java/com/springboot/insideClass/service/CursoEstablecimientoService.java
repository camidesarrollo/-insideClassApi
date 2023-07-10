package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoEstablecimientoService {
    @Autowired
    CursoEstablecimientoRepository cursoEstablecimientoRepository;

    public List<CursoEstablecimientoEntity> obtenerTodosLosCursosEstablecimiento() {
        return cursoEstablecimientoRepository.findAll();
    }

    public Optional<CursoEstablecimientoEntity> obtenerCursosEstablecimientoPorId(Long id) {
        return cursoEstablecimientoRepository.findById(id);
    }

    public List<CursoEstablecimientoEntity> obtenerCursosEstablecimientoPorFiltro(Long curso_establecimiento_id, Long curso_establecimiento_curso_id, Long curso_establecimiento_establecimiento_id,Boolean vigencia){


        return cursoEstablecimientoRepository.findByFilters(curso_establecimiento_id, curso_establecimiento_curso_id, curso_establecimiento_establecimiento_id, vigencia);
    }

    public CursoEstablecimientoEntity guardarCursosEstablecimiento(CursoEstablecimientoEntity cursoEstablecimiento) {
        return cursoEstablecimientoRepository.save(cursoEstablecimiento);
    }

    public void eliminarCursosEstablecimiento(Long id) {
        cursoEstablecimientoRepository.deleteById(id);
    }

}
