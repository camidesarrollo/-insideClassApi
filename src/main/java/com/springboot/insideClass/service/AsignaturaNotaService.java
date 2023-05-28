package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AsignaturaNotaEntity;
import com.springboot.insideClass.payload.request.Notas.GetNotas;
import com.springboot.insideClass.payload.response.NotasInfoRequest;
import com.springboot.insideClass.repository.AsignaturaNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Service
public class AsignaturaNotaService {
    @Autowired
    AsignaturaNotaRepository asignaturaNotaRepository;


    public AsignaturaNotaEntity findById(Long id) {
        try {
            return asignaturaNotaRepository.findById(id).get();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }
    public  List<AsignaturaNotaEntity> findLast() {
        try {
            return asignaturaNotaRepository.findLast();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void delete(AsignaturaNotaEntity asignaturaNota) {
        try {
            asignaturaNotaRepository.delete(asignaturaNota);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void save(AsignaturaNotaEntity asignaturaNota) {
        try {
            asignaturaNotaRepository.save(asignaturaNota);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<NotasInfoRequest> obtenerInfoNotas( String personaRun, String docente_run,  Long asignaturaId, Long establecimiento,String fecha, Long cursoId) {
        System.out.println("Entramos al metodo");
        List<NotasInfoRequest> listanotas =  new ArrayList<>();
        List<Object> listaObjetosNativos =   asignaturaNotaRepository.fn_Notas(personaRun,docente_run,establecimiento,asignaturaId, fecha,cursoId );
        Object[] fila;
        System.out.println(listaObjetosNativos.size());
        for (Object item : listaObjetosNativos) {
            NotasInfoRequest notasInfoRequest = new NotasInfoRequest();
            fila = (Object[]) item;

            // Establecer los valores de cada campo con los datos de la fila correspondiente
            notasInfoRequest.setEstablId(fila[0] != null ? ((BigInteger) fila[0]).toString() : "");
            notasInfoRequest.setEstablNombre(fila[2] != null ? (String) fila[2] : "");
            notasInfoRequest.setEstablDependId(fila[4] != null ? ((BigInteger) fila[4]).toString() : "");
            notasInfoRequest.setEstablDireccionId(fila[5] != null ? ((BigInteger) fila[5]).toString() : "");
            notasInfoRequest.setEstablSostId(fila[6] != null ? ((BigInteger) fila[6]).toString() : "");

            notasInfoRequest.setAsignaturaNotaId(fila[7] != null ? ((BigInteger) fila[7]).toString() : "");
            notasInfoRequest.setAsignaturaNotaNota(fila[8] != null ? (String) fila[8] : "");
            notasInfoRequest.setAsignaturaNotaPosicion(fila[9] != null ? (String) fila[9] : "");


            notasInfoRequest.setAsignaturaNotaAsignaturaDocId(fila[10] != null ? ((BigInteger) fila[10]).toString() : "");
            notasInfoRequest.setAsignaturaNotaMatriculaId(fila[11] != null ? ((BigInteger) fila[11]).toString() : "");
            notasInfoRequest.setAsignaturaId(fila[12] != null ? ((BigInteger) fila[12]).toString() : "");
            notasInfoRequest.setAsignaturaNombre(fila[13] != null ? (String) fila[13] : "");
            notasInfoRequest.setAlumnoId(fila[14] != null ? ((BigInteger) fila[14]).toString() : "");
            notasInfoRequest.setPersonaRun(fila[15] != null ? (String) fila[15] : "");
            notasInfoRequest.setPersonaNombre(fila[16] != null ? (String) fila[16] : "");
            notasInfoRequest.setPersonaApellidoPaterno(fila[17] != null ? (String) fila[16] : "");
            notasInfoRequest.setPersonaApellidoMaterno(fila[18] != null ? (String) fila[18] : "");
            notasInfoRequest.setDocenteId(fila[19] != null ? ((BigInteger) fila[19]).toString() : "");
            notasInfoRequest.setDocenteRun(fila[20] != null ? (String) fila[20] : "");
            notasInfoRequest.setDocenteNombre(fila[21] != null ? (String) fila[21] : "");
            notasInfoRequest.setDocenteApellidoPaterno(fila[22] != null ? (String) fila[22] : "");
            notasInfoRequest.setDocenteApellidoMaterno(fila[23] != null ? (String) fila[23] : "");

            listanotas.add(notasInfoRequest);
        }

        System.out.println("obteniendo el count");
        System.out.println(listanotas.stream().count());

        return listanotas;

        /*try{


        }catch (Exception e){
            System.out.println(e.fillInStackTrace().getMessage());
            return listanotas;
        }*/
    }

    public boolean IsValid(GetNotas getNotas) {
        if (getNotas.getRun() == null || getNotas.getRun() .isEmpty()) {
            return false;
        }

        if (getNotas.getDocente_run() == null || getNotas.getDocente_run().isEmpty()) {
            return false;
        }

        if (getNotas.getId_establecimiento() == null || getNotas.getId_establecimiento()  == 0) {
            return false;
        }

        if (getNotas.getId_asignatura() == null || getNotas.getId_asignatura() == 0) {
            return false;
        }

        if (getNotas.getFecha() == null || getNotas.getFecha().isEmpty()) {
            return false;
        }

        if (getNotas.getCurso() == null || getNotas.getCurso() == 0) {
            return false;
        }

        return true;
    }




}
