package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ApoderadoEntity;
import com.springboot.insideClass.payload.response.*;
import com.springboot.insideClass.repository.ApoderadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApoderadoService {

    @Autowired
    private ApoderadoRepository apoderadoRepository;

    public ApoderadoEntity findApoderadoByRun (String run){
        try{
            return apoderadoRepository.findApoderadoByRun(run);
        }catch (Exception e){
            System.out.println(e);
        }

        return  null;
    }

    public void save(ApoderadoEntity apoderado){
        try{
            apoderadoRepository.save(apoderado);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public List<ApoderadoInfoResponse> fn_InfoApoderado(long establecimiento, Integer vigencia, String apoderado_run){

        List<ApoderadoInfoResponse> listaApoderado = new ArrayList<>();
        List<Object> listaObjetosNativos = apoderadoRepository.fn_InfoApoderado(establecimiento, vigencia, apoderado_run);
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
                    fila[11] != null ? ((BigInteger) fila[10]).toString() : "", // establ_id
                    fila[13] != null ? (String) fila[12] : "",  // establ_nombre
                    fila[14] != null ? ((BigInteger) fila[13]).toString()  : ""   // establ_numero_telefonico
            );


            ApoderadoInfoResponse apoderadoInfoResponse = new ApoderadoInfoResponse(
                    personaResponse, establecimientoResponse
            );

            listaApoderado.add(apoderadoInfoResponse);
        }
        System.out.println("obteniendo el count");
        System.out.println(listaApoderado.size());
        return listaApoderado;
    }


}
