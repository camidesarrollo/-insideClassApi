package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.payload.response.CursoResponse;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import com.springboot.insideClass.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<CursoResponse> getCursoByEstablecimiento(long establecimiento_id){
        List<Object> listaObjetosNativos =  cursoEstablecimientoRepository.findCursoEstablecimientoByEstablecimiento(establecimiento_id);
        List<CursoResponse> listaCursos =  new ArrayList<>();

        Object[] fila;

        for (Object item : listaObjetosNativos) {

            fila = (Object[]) item;
            CursoResponse cursos = new CursoResponse((String)fila[2], (String)fila[3], fila[4] == null ? false : (boolean) fila[4]);
            listaCursos.add(cursos);

        }
        return listaCursos;
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
