package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AnotacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnotacionesRepository extends JpaRepository<AnotacionesEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAnotaciones(:run, :curso_id , :asignatura_id, :establ_id,:fecha)")
    List<Object> fn_Anotaciones( @Param("run") String persona_run,  @Param("curso_id") Long curso_id,  @Param("asignatura_id") Long asignatura_id,
                                 @Param("establ_id") Long establecimiento,
                                 @Param("fecha") String fecha);
}
