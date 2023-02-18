package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteCursoEntity;
import com.springboot.insideClass.payload.response.CursoResponse;
import com.springboot.insideClass.payload.response.DocenteInfoResponse;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import com.springboot.insideClass.repository.DocenteCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DocenteCursoService {

    @Autowired
    DocenteCursoRepository docenteCursoRepository;
    @Autowired
    private CursoEstablecimientoRepository cursoEstablecimientoRepository;

    public DocenteCursoEntity findDocenteCursoByRunAndEstablecimientoByFecha(long docente_id, long id_establecimiento, Date fecha_inicio, Date fecha_fin){

        try{
            return docenteCursoRepository.findDocenteCursoByRunAndEstablecimientoByFecha(docente_id, id_establecimiento, fecha_inicio, fecha_fin);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public void save(DocenteCursoEntity docenteCurso) {

        try{
            docenteCursoRepository.save(docenteCurso);
        }catch (Exception e){

        }
    }




}
