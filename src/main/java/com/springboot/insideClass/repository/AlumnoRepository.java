package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  AlumnoRepository extends JpaRepository<AlumnoEntity, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAlumno(:value)")
    List<Object> getInfoAlumno(@Param("value") String value);

    @Query(nativeQuery = true, value = "select * from t_alumno where t_alumno.alumno_persona_run = ?")
    AlumnoEntity findAlumnoByRun(@Param("alumno_persona_run") String alumno_persona_run);

}
