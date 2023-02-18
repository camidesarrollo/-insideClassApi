package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.payload.response.AlumnoInfoResponse;
import com.springboot.insideClass.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepo;
    public List<AlumnoInfoResponse> getInfoAlumno(String establecimiento_id){

        List<Object> listaObjetosNativos =  alumnoRepo.getInfoAlumno(establecimiento_id);
        List<AlumnoInfoResponse> listaAlumno =  new ArrayList<>();

        Object[] fila;
        for (Object item : listaObjetosNativos) {
            AlumnoInfoResponse alumnoInfoResponse = new AlumnoInfoResponse();
            fila = (Object[]) item;
            alumnoInfoResponse.setAlumno_rut((String) fila[0]);
            alumnoInfoResponse.setAlumno_nombre((String) fila[1]);
            alumnoInfoResponse.setAlumno_apellido_paterno((String) fila[2]);
            alumnoInfoResponse.setAlumno_apellido_materno((String) fila[3]);
            alumnoInfoResponse.setApoderado_run((String) fila[4]);
            alumnoInfoResponse.setApoderado_nombre((String) fila[5]);
            alumnoInfoResponse.setApoderado_apellido_paterno((String) fila[6]);
            alumnoInfoResponse.setApoderado_apellido_materno((String) fila[7]);
            alumnoInfoResponse.setEstabl_nombre((String) fila[8]);
            alumnoInfoResponse.setCurso_nombre((String) fila[9]);

            listaAlumno.add(alumnoInfoResponse);

        }
        return listaAlumno;
    }

    public AlumnoEntity findAlumnoByRun(String run){

        try{
            return alumnoRepo.findAlumnoByRun(run);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public AlumnoEntity findAlumnoById(long id){
        try{
            return  alumnoRepo.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

    public void save(AlumnoEntity alumno){
        try{
            alumnoRepo.save(alumno);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
