package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoMatriculaEntity;
import com.springboot.insideClass.repository.CursoMatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoMatriculaService {

    private final CursoMatriculaRepository cursoMatriculaRepository;

    @Autowired
    public CursoMatriculaService(CursoMatriculaRepository cursoMatriculaRepository) {
        this.cursoMatriculaRepository = cursoMatriculaRepository;
    }

    public List<CursoMatriculaEntity> obtenerTodosLosCursosMatricula() {
        return cursoMatriculaRepository.findAll();
    }

    public Optional<CursoMatriculaEntity> obtenerCursoMatriculaPorId(Long id) {
        return cursoMatriculaRepository.findById(id);
    }

    public CursoMatriculaEntity guardarCursoMatricula(CursoMatriculaEntity cursoMatriculaEntity) {
        return cursoMatriculaRepository.save(cursoMatriculaEntity);
    }

    public void eliminarCursoMatriculaPorId(Long id) {
        cursoMatriculaRepository.deleteById(id);
    }

}
