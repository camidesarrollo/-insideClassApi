package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsistenciaEntity;
import com.springboot.insideClass.payload.response.AsistenciaInfoResponse;
import com.springboot.insideClass.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Service
public class AsistenciaService {


    @Autowired
    private AsistenciaRepository asistenciaRepository;

    public void save(AsistenciaEntity asistencia){
        try{

            asistenciaRepository.save(asistencia);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public AsistenciaEntity findById(long id){
        try{
            return asistenciaRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

    public void delete(AsistenciaEntity asistencia){
        try{
            asistenciaRepository.delete(asistencia);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public List<AsistenciaInfoResponse> obtenerInfoAsistencia(Long establecimiento, String personaRun, String fecha) {
        List<AsistenciaInfoResponse> listaAsistencia = new ArrayList<>();
        try {
            List<Object> listaObjetosNativos = asistenciaRepository.fn_Asistencia(establecimiento, personaRun, fecha);

            Object[] fila;
            for (Object item : listaObjetosNativos) {
                AsistenciaInfoResponse asistenciaInfoResponse = new AsistenciaInfoResponse();
                fila = (Object[]) item;
                asistenciaInfoResponse.setAsistencia_id(fila[0] != null ? ((BigInteger) fila[0]).toString() : "");
                asistenciaInfoResponse.setFecha(fila[1] != null ? fila[1].toString() : "");
                asistenciaInfoResponse.setAsistencia_matricula_id(fila[2] != null ? ((BigInteger) fila[2]).toString() : "");
                asistenciaInfoResponse.setAlumno_id(fila[3] != null ? ((BigInteger) fila[3]).toString() : "");
                asistenciaInfoResponse.setAlumno_persona_run(fila[4] != null ? fila[4].toString() : "");
                asistenciaInfoResponse.setEstabl_id(fila[5] != null ? ((BigInteger) fila[5]).toString() : "");
                asistenciaInfoResponse.setEstabl_cod_area(fila[6] != null ? fila[6].toString() : "");
                asistenciaInfoResponse.setEstabl_nombre(fila[7] != null ? fila[7].toString() : "");
                asistenciaInfoResponse.setEstabl_numero_telefonico(fila[8] != null ? fila[8].toString() : "");
                asistenciaInfoResponse.setEstabl_depend_id(fila[9] != null ? ((BigInteger) fila[9]).toString() : "");
                asistenciaInfoResponse.setEstabl_direccion_id(fila[10] != null ? ((BigInteger) fila[10]).toString() : "");
                asistenciaInfoResponse.setEstabl_sost_id(fila[11] != null ? ((BigInteger) fila[11]).toString() : "");

                listaAsistencia.add(asistenciaInfoResponse);
            }

            System.out.println("obteniendo el count");
            System.out.println(listaAsistencia.stream().count());

            return listaAsistencia;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return listaAsistencia;
        }
    }
}
