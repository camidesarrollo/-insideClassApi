package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {

    @Autowired
    AsignaturaRepository asignaturaRepository;

    public AsignaturaEntity findAsignaturaById(long asignatura_id){

        try{
            return asignaturaRepository.findAsignaturaById(asignatura_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public AsignaturaEntity findAsignaturaByName(String asignatura_nombre){

        try{
            return asignaturaRepository.findAsignaturaByName(asignatura_nombre);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }



    public List<AsignaturaEntity> findAll(){
        try{
            return asignaturaRepository.findAll();
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List<AsignaturaEntity> findAsignaturaEstablecimientoXPerfil( long establecimiento, String persona_run, long curso_id){
        try{
            return asignaturaRepository.findAsignaturaEstablecimientoXPerfil(establecimiento,persona_run, curso_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
