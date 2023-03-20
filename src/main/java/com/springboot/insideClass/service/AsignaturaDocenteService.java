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
}
