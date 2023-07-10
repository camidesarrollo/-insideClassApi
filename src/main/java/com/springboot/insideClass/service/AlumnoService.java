package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public List<AlumnoEntity> obtenerTodosLosAlumnos() {
        return alumnoRepository.findAll();
    }

    public Optional<AlumnoEntity> obtenerAlumnoPorId(Long id) {
        return alumnoRepository.findById(id);
    }

    public List<AlumnoEntity> obtenerAlumnoPorFiltro(Long alumno_id, String alumno_persona_run){
        return alumnoRepository.findByFilters(alumno_id, alumno_persona_run);
    }

    public AlumnoEntity guardarAlumno(AlumnoEntity alumno) {
        return alumnoRepository.save(alumno);
    }

    public void eliminarAlumno(Long id) {
        alumnoRepository.deleteById(id);
    }

    public static boolean validarAlumnoCrear() {

        return true;
    }

    public static boolean validarAlumnoEditar() {

        return true;
    }

    public static boolean validarAlumnoEliminar() {

        return true;
    }

}
