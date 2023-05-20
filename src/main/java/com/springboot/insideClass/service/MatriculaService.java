package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MatriculaEntity;
import com.springboot.insideClass.payload.response.AlumnoInfoResponse;
import com.springboot.insideClass.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatriculaService {

@Autowired
    MatriculaRepository matriculaRepository;

    public List<AlumnoInfoResponse> getInfoAlumno(Long establecimiento, String persona_run,
                                                  Integer curso_id, Integer vigencia, String apoderado_run){

        List<Object> listaObjetosNativos =  matriculaRepository.fn_InfoMatricula(establecimiento,persona_run, curso_id, vigencia, apoderado_run );
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
            alumnoInfoResponse.setEstabl_nombre((String) fila[9]);
            alumnoInfoResponse.setCurso_nombre((String) fila[8]);

            listaAlumno.add(alumnoInfoResponse);

        }
        return listaAlumno;
    }

    public MatriculaEntity findEstablecimientoByAll(long curso_establecimiento, long alumno_id, Integer curso_agno){
        System.out.println("Imprimiendo variables");
        System.out.println(curso_establecimiento);
        System.out.println(alumno_id);
        System.out.println(curso_agno);
        return matriculaRepository.findEstablecimientoByAll(curso_establecimiento, alumno_id, curso_agno);
        /*try{

        }catch (Exception e){
            System.out.println(e);
        }
        */


        /*return null;*/
    }

    public void save(MatriculaEntity matricula){
        try{
            matriculaRepository.save(matricula);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public MatriculaEntity findMatriculaById(long id){
        try{
           return  matriculaRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }


    public MatriculaEntity findMatriculaByRunAndCurso(String alumno_persona_run,Integer curso_agno, Long curso_establ_establ_id){
        System.out.println(alumno_persona_run);
        System.out.println(curso_agno);
        System.out.println(curso_establ_establ_id);
        return matriculaRepository.findMatriculaByRunAndCurso(alumno_persona_run, curso_agno, curso_establ_establ_id);
    }

}

