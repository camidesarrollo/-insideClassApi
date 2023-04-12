package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepo;


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
