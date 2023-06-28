package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import com.springboot.insideClass.repository.AsignaturaDocenteRepository;
import com.springboot.insideClass.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AsignaturaDocenteService {

    @Autowired
    AsignaturaDocenteRepository asignaturaDocenteRepository;
    @Autowired
    private AsignaturaRepository asignaturaRepository;

    SimpleDateFormat inputDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
    SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public List<AsignaturaDocenteEntity> findAllFilter(long asignatura_doc_asignatura_id, long asignatura_doc_docente_id, Date asignatura_doc_inicio, Date asignatura_doc_fin) {

        System.out.println("-----findAllFilter----");
        List<AsignaturaDocenteEntity> asignaturaDocenteEntityList = asignaturaDocenteRepository.findAllFilter(asignatura_doc_asignatura_id, asignatura_doc_docente_id);

        List<AsignaturaDocenteEntity> filteredEntities = new ArrayList<>();

        for (AsignaturaDocenteEntity entity : asignaturaDocenteEntityList) {
            System.out.println(entity.getAsignatura_doc_id());
            if(asignatura_doc_inicio != null || asignatura_doc_fin != null){
                Date inicio = entity.getAsignatura_doc_inicio();
                Date fin = entity.getAsignatura_doc_fin();

                System.out.println(entity.getAsignatura_doc_inicio().compareTo(asignatura_doc_inicio) +"&&"+ entity.getAsignatura_doc_fin().compareTo(asignatura_doc_fin) );

            //Si las fechas son iguales add
                if(entity.getAsignatura_doc_inicio().compareTo(asignatura_doc_inicio) > 0 && entity.getAsignatura_doc_fin().compareTo(asignatura_doc_fin) > 0){

                    System.out.println("Agregando datos");
                    filteredEntities.add(entity);
                }

            }

        }
      /*  System.out.println("filteredEntities.size()");
        System.out.println("asignaturaDocenteEntityList.size()");
        System.out.println(filteredEntities.size());
        System.out.println(asignaturaDocenteEntityList.size());
        if(filteredEntities != null || filteredEntities.size() > 0){
            return filteredEntities;
        }else{
            return asignaturaDocenteEntityList;
        }*/
        return asignaturaDocenteEntityList;

    }


    public AsignaturaDocenteEntity findAsignaturaDocenteByAsignaturaAndDocente(long asignatura_doc_asignatura_id, long asignatura_doc_docente_establ_id, Integer inicio, Integer fin){

        try{
            return asignaturaDocenteRepository.findAsignaturaDocenteByAsignaturaAndDocente(asignatura_doc_asignatura_id, asignatura_doc_docente_establ_id, inicio, fin);
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


    public AsignaturaDocenteEntity findDocenteCursoByRunAndAsignaturaAndEstablecimiento( Integer asignatura_doc_inicio,
                                                                                         Integer asignatura_doc_fin,
                                                                                       String docente_persona_run,
                                                                               long asignatura_doc_asignatura_id){
System.out.println("Imprimiend datos de asignatura docente");
System.out.println(asignatura_doc_inicio + " - " + asignatura_doc_fin + " - " + docente_persona_run + " - " +  asignatura_doc_asignatura_id);
        try{

            return asignaturaDocenteRepository.findDocenteCursoByRunAndAsignaturaAndEstablecimiento(asignatura_doc_inicio,
                    asignatura_doc_fin,docente_persona_run,
                    asignatura_doc_asignatura_id );
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}
