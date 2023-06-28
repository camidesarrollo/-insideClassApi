package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import com.springboot.insideClass.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Autowired
    CursoEstablecimientoRepository cursoEstablecimientoRepository;
    public List<CursoEntity> get(){

        try{
            return cursoRepository.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public CursoEntity findCursoByName(String name){

        try{
            return cursoRepository.findCursoByName(name);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public CursoEntity findById(Long id){

        try{
            return cursoRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public CursoEstablecimientoEntity getCursoByEstablecimiento(long establecimiento, long curso, Date fecha_inicio, Date fecha_fin){
        return cursoEstablecimientoRepository.findCursoEstablecimientoByEstablecimiento(establecimiento, curso, fecha_inicio,  fecha_fin);

    }

    public List<CursoEntity> findCursoByDocenteXEstablecimiento(long establecimiento, String persona_run, long curso_id){
        try{
            return cursoRepository.findCursoByDocenteXEstablecimiento(establecimiento,persona_run, curso_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}
