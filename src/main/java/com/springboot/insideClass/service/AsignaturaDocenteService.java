package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import com.springboot.insideClass.repository.AsignaturaDocenteRepository;
import com.springboot.insideClass.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaDocenteService {

    @Autowired
    AsignaturaDocenteRepository asignaturaDocenteRepository;
    @Autowired
    private AsignaturaRepository asignaturaRepository;


    public AsignaturaDocenteEntity findAsignaturaDocenteByAsignaturaAndDocente(long asignatura_doc_asignatura_id, long asignatura_doc_docente_establ_id){

        try{
            return asignaturaDocenteRepository.findAsignaturaDocenteByAsignaturaAndDocente(asignatura_doc_asignatura_id, asignatura_doc_docente_establ_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public void save(AsignaturaDocenteEntity asignaturaDocente) {
        try{
            asignaturaDocenteRepository.save(asignaturaDocente);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public List<AsignaturaDocenteEntity> findDocenteCursoByRunAndEstablecimiento(long id_establecimiento, String docente_run){

        try{
            return asignaturaDocenteRepository.findDocenteCursoByRunAndEstablecimiento(id_establecimiento,docente_run);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public AsignaturaDocenteEntity findDocenteCursoByCursoAsignatura( long curso_id, long docente_curso_docente_id, long asignatura_doc_asignatura_id){

        try{
            return asignaturaDocenteRepository.findDocenteCursoByCursoAsignatura(curso_id,docente_curso_docente_id,asignatura_doc_asignatura_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


    public AsignaturaDocenteEntity findDocenteCursoByRunAndAsignaturaAndEstablecimiento(String docente_persona_run, long asignatura_id, long curso_id,  Integer docente_cuso_fecha_fin){

        try{
            System.out.println(docente_persona_run);
            System.out.println(asignatura_id);
            System.out.println(curso_id);
            System.out.println(docente_cuso_fecha_fin);
            return asignaturaDocenteRepository.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(docente_persona_run,asignatura_id,curso_id,docente_cuso_fecha_fin);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
