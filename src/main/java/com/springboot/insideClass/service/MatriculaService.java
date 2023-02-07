package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

@Autowired
    MatriculaRepository matriculaRepository;

    public MatriculaEntity findEstablecimientoByAll(long curso_establecimiento, long alumno_id, long apoderado_id, String curso_agno){
        try{
            return matriculaRepository.findEstablecimientoByAll(curso_establecimiento, alumno_id, apoderado_id, curso_agno);
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

    public void save(MatriculaEntity matricula){
        try{
            matriculaRepository.save(matricula);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public MatriculaEntity findMatriculaById(long id){
        try{
            matriculaRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }
}

