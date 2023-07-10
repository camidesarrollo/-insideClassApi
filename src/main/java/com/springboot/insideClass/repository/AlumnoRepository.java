package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long> {

    @Query(value = "select * from t_alumno a where (a.alumno_id = :alumno_id or :alumno_id = -1) and (a.alumno_persona_run = :alumno_persona_run or :alumno_persona_run = '-1')", nativeQuery = true)
    List<AlumnoEntity> findByFilters(@Param("alumno_id") Long alumno_id, @Param("alumno_persona_run") String alumno_persona_run);
}
