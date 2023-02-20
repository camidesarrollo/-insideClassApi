package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class CursoEstablecimientoService {

    @Autowired
    CursoEstablecimientoRepository cursoEstablecimientoRepository;
    public CursoEstablecimientoEntity findCursoEstablecimientoByCursoAndEstablecimiento(long curso, long id_establecimiento){

        try{
            return cursoEstablecimientoRepository.findCursoEstablecimientoByCursoAndEstablecimiento(curso, id_establecimiento);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public CursoEstablecimientoEntity findById(long id){
        try{
            return cursoEstablecimientoRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }
}
