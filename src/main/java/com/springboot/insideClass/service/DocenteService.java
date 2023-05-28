package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteEntity;
import com.springboot.insideClass.payload.response.*;
import com.springboot.insideClass.repository.DocenteRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


@Service
public class DocenteService {
    @Autowired
    DocenteRepository docenteRepo;

    static Logger logger_2 = LogManager.getLogger();

    public List<DocenteInfoResponse> getInfoDocente(long establecimiento_id, String run, long curso) {
        List<DocenteInfoResponse> listaDocente = new ArrayList<>();
        System.out.println("obteniendo el valor que entra en la funcion getInfoDocente");
        System.out.println(establecimiento_id);
        System.out.println(run);
        System.out.println(curso);
        List<Object> listaObjetosNativos = docenteRepo.getInfoDocente(establecimiento_id, run, curso);
        Object[] fila;

        for (Object item : listaObjetosNativos) {
            fila = (Object[]) item;
            System.out.println("Estamos iterando la lista");

            System.out.println(fila[1] != null ? (String) fila[1] : "");
            PersonaResponse personaResponse = new PersonaResponse(
                    fila[1] != null ? (String) fila[1] : "",  // persona_nombre
                    fila[2] != null ? (String) fila[2] : "",  // persona_apellido_paterno
                    fila[3] != null ? (String) fila[3] : "",  // persona_apellido_materno
                    fila[6] != null ? (Date) fila[6] : null, // persona_fecha_nacimiento
                    fila[7] != null ? (Character) fila[7] : 'I', // persona_sexo
                    fila[5] != null ? (String) fila[5] : "",  // email
                    fila[4] != null ? (String) fila[4] : "",  // persona_numero_celular
                    fila[0] != null ? (String) fila[0] : ""   // persona_run
            );
            EstablecimientoResponse establecimientoResponse = new EstablecimientoResponse(
                    fila[11] != null ? ((BigInteger) fila[11]).toString() : "", // establ_id
                    fila[13] != null ? (String) fila[13] : "",  // establ_nombre
                    fila[14] != null ? ((BigInteger) fila[14]).toString()  : ""   // establ_numero_telefonico
            );
            DireccionResponse direccionResponse = new DireccionResponse();
            CursoResponse cursoResponse = new CursoResponse(
                   "",   // curso_nivel
                    fila[18] != null ? ((BigInteger) fila[16]).toString() : "",  // curso_id
                     false // docente_jefe
            );
            AsignaturaResponse asignaturaResponse = new AsignaturaResponse(
                    fila[10] != null ? (String) fila[10] : "",  // asignatura_nombre
                    fila[9] != null ? ((BigInteger) fila[9]).toString()  : ""    // asignatura_id
            );

            DocenteInfoResponse docenteInfoResponse = new DocenteInfoResponse(
                    personaResponse, establecimientoResponse, direccionResponse, asignaturaResponse,
                    cursoResponse, fila[8] != null ? (String) fila[8] : "",  // persona_fecha_nacimiento
                    fila[21] != null ? fila[21].toString() : "false"   // docente_jefe
            );

            listaDocente.add(docenteInfoResponse);
        }
        System.out.println("obteniendo el count");
        System.out.println(listaDocente.size());
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

        return this.getInfoDocente(establecimiento, persona, curso);
    }

    private Object getValueOrDefault(Object value, Object defaultValue) {
        return value != null ? value : defaultValue;
    }
}


