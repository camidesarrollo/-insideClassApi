package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AnotacionesEntity;
import com.springboot.insideClass.payload.response.AnotacionInfoResponse;
import com.springboot.insideClass.repository.AnotacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class AnotacionesService {

    @Autowired
    private AnotacionesRepository anotacionesRepository;

    public  List<AnotacionInfoResponse> obtenerInfoAnotaciones( String personaRun, Long cursoId, Long asignaturaId, Long establecimiento,String fecha) {
        List<AnotacionInfoResponse> listaAnotacion =  new ArrayList<>();
        try{
            System.out.println(personaRun);
            System.out.println(cursoId);
            System.out.println(asignaturaId);
            System.out.println(establecimiento);
            System.out.println(fecha);
            List<Object> listaObjetosNativos =   anotacionesRepository.fn_Anotaciones(personaRun, cursoId, asignaturaId, establecimiento,  fecha);


            Object[] fila;
            System.out.println(listaObjetosNativos.size());
            for (Object item : listaObjetosNativos) {
                AnotacionInfoResponse anotacionInfoResponse = new AnotacionInfoResponse();
                fila = (Object[]) item;
                anotacionInfoResponse.setAnotacionesId(fila[0] != null ? ((BigInteger) fila[0]).toString() : "");
                anotacionInfoResponse.setDescripcion(fila[1] != null ? (String) fila[1] : "");
                anotacionInfoResponse.setFecha(fila[2] != null ? new SimpleDateFormat("yyyy-MM-dd").format(fila[2]) : "");
                anotacionInfoResponse.setGravedad(fila[3] != null ? (String) fila[3] : "");

                anotacionInfoResponse.setAsignaturaDocenteId(fila[4] != null ? ((BigInteger) fila[4]).toString() : "");
                anotacionInfoResponse.setMatriculaId(fila[5] != null ? ((BigInteger) fila[5]).toString() : "");
                anotacionInfoResponse.setPersonaRun(fila[6] != null ? (String) fila[6] : "");
                anotacionInfoResponse.setPersonaApellidoMaterno(fila[7] != null ? (String) fila[7] : "");
                anotacionInfoResponse.setPersonaApellidoPaterno(fila[8] != null ? (String) fila[8] : "");

                anotacionInfoResponse.setCursoNombre(fila[10] != null ? (String) fila[10] : "");

                anotacionInfoResponse.setDocenteRun(fila[13] != null ? (String) fila[13] : "");
                anotacionInfoResponse.setDocenteNombre(fila[14] != null ? (String) fila[14] : "");
                anotacionInfoResponse.setDocenteApellidoPaterno(fila[15] != null ? (String) fila[15] : "");
                anotacionInfoResponse.setDocenteApellidoMaterno(fila[16] != null ? (String) fila[16] : "");
                anotacionInfoResponse.setAsignaturaId(fila[20] != null ? (String) fila[20] : "");
                anotacionInfoResponse.setAsignaturaNombre(fila[21] != null ? (String) fila[21] : "");

                listaAnotacion.add(anotacionInfoResponse);
            }

            System.out.println("obteniendo el count");
            System.out.println(listaAnotacion.stream().count());

            return listaAnotacion;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return listaAnotacion;
        }
    }

    public void save(AnotacionesEntity anotaciones){
        try{
            anotacionesRepository.save(anotaciones);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void delete(AnotacionesEntity anotaciones){
        try{
            anotacionesRepository.delete(anotaciones);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public AnotacionesEntity findById(Long id){
        try{
            return anotacionesRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;

    }

}

