package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.payload.response.DocenteInfoResponse;
import com.springboot.insideClass.repository.DocenteRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepo;

    static Logger logger_2 = LogManager.getLogger();

    public List<DocenteInfoResponse> getInfoDocente(long establecimiento_id, String run, long curso) {

        List<DocenteInfoResponse> listaDocente = new ArrayList<>();

        for (Object item : docenteRepo.getInfoDocente(establecimiento_id, run, curso)) {
            DocenteInfoResponse docenteInfoResponse = new DocenteInfoResponse();
            Object[] fila = (Object[]) item;

            docenteInfoResponse.setPersona_run(fila[0] != null ? (String) fila[0] : "");
            docenteInfoResponse.setPersona_nombre(fila[1] != null ? (String) fila[1] : "");
            docenteInfoResponse.setPersona_apellido_paterno(fila[2] != null ? (String) fila[2] : "");
            docenteInfoResponse.setPersona_apellido_materno(fila[3] != null ? (String) fila[3] : "");
            docenteInfoResponse.setPersona_numero_celular(fila[4] != null ? (String) fila[4] : "");
            docenteInfoResponse.setPersona_numero_telefonico(fila[5] != null ? (String) fila[5] : "");
            docenteInfoResponse.setPersona_email(fila[6] != null ? (String) fila[6] : "");
            docenteInfoResponse.setAsignatura_nombre(fila[7] != null ? (String) fila[7] : "");
            docenteInfoResponse.setEstabl_id(fila[8] != null ? ((BigInteger) fila[8]).toString() : "");
            docenteInfoResponse.setEstabl_nombre(fila[9] != null ? (String) fila[9] : "");
            docenteInfoResponse.setCurso_nombre(fila[10] != null ? (String) fila[10] : "");
            docenteInfoResponse.setDocente_jefe(fila[11] != null ? fila[11].toString() : "false");

            listaDocente.add(docenteInfoResponse);
        }
        System.out.println("obteniendo el count");
        System.out.println(listaDocente.stream().count());
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

        /*try{

        }catch (Exception e){
            System.out.println(e);
            return null;
        }*/
        List<DocenteInfoResponse> varia = this.getInfoDocente(establecimiento, persona, curso);
        System.out.println(varia.stream().count());
        return this.getInfoDocente(establecimiento, persona, curso);
    }

    private Object getValueOrDefault(Object value, Object defaultValue) {
        return value != null ? value : defaultValue;
    }
}


