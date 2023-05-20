package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAsistencia(:run, :establ_id,:fecha)")
    List<Object> fn_Asistencia(@Param("establ_id") Long establecimiento, @Param("run") String persona_run, @Param("fecha") String fecha);

}
