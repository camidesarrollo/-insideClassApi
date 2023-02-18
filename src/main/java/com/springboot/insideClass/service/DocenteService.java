package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.payload.response.DocenteInfoResponse;
import com.springboot.insideClass.repository.DocenteRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.*;


@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepo;

    static Logger logger_2 = LogManager.getLogger();

    public List<DocenteInfoResponse> getInfoDocente(long establecimiento_id,String run, long curso){
        List<Object> listaObjetosNativos =  docenteRepo.getInfoDocente(establecimiento_id, run, curso);
        List<DocenteInfoResponse> listaDocente =  new ArrayList<>();

        Object[] fila;
        for (Object item : listaObjetosNativos) {
            DocenteInfoResponse docenteInfoResponse = new DocenteInfoResponse();
            fila = (Object[]) item;

            docenteInfoResponse.setPersona_run((String) fila[0]);
            docenteInfoResponse.setPersona_nombre((String) fila[1]);
            docenteInfoResponse.setPersona_apellido_paterno((String) fila[2]);
            docenteInfoResponse.setPersona_apellido_materno((String) fila[3]);
            docenteInfoResponse.setPersona_numero_celular((String) fila[4]);
            docenteInfoResponse.setPersona_numero_telefonico((String) fila[5]);
            docenteInfoResponse.setPersona_email((String) fila[6]);
            docenteInfoResponse.setAsignatura_nombre((String) fila[7]);
            docenteInfoResponse.setEstabl_id(((BigInteger) fila[8]).toString());
            docenteInfoResponse.setEstabl_nombre((String) fila[9]);
            docenteInfoResponse.setCurso_nombre((String) fila[10]);
            docenteInfoResponse.setDocente_jefe(((Boolean)fila[11]).toString());
            listaDocente.add(docenteInfoResponse);

        }
        return listaDocente;
    }

    public DocenteEntity findDocenteByRun(String run){

        try{
            return docenteRepo.findDocenteByRun(run);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public DocenteEntity findDocenteById(Long id_docente){
        try{
            return docenteRepo.findById(id_docente).get();
        }catch (Exception e){
            return null;
        }
    }

    public List<DocenteInfoResponse> findDocenteByIdCursoEstablecimiento(long establecimiento, String persona, long curso) {

        try{
            return this.getInfoDocente(establecimiento, persona, curso);
        }catch (Exception e){
            return null;
        }

    }
}


