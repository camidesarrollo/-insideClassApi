package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.payload.response.CursoResponse;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import com.springboot.insideClass.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
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

    public List<CursoResponse> getCursoByEstablecimiento(long establecimiento_id){
        List<Object> listaObjetosNativos =  cursoEstablecimientoRepository.findCursoEstablecimientoByEstablecimiento(establecimiento_id);
        List<CursoResponse> listaCursos =  new ArrayList<>();

        Object[] fila;

        for (Object item : listaObjetosNativos) {
            CursoResponse cursos = new CursoResponse();
            fila = (Object[]) item;
            cursos.setId_curso(((BigInteger) fila[2]).longValue());
            cursos.setCurso((String)fila[3]);
            cursos.setDocente_jefe(fila[4] == null ? false : (boolean) fila[4]);
            listaCursos.add(cursos);

        }
        return listaCursos;
    }
}
