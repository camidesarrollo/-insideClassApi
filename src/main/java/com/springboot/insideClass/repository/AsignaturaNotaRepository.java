package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsignaturaNotaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AsignaturaNotaRepository extends JpaRepository<AsignaturaNotaEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoNotas(:run, :docente_run, :establ_id, :asignatura, :fecha)")
    List<Object> fn_Notas( @Param("run") String persona_run, @Param("docente_run") String docente_run, @Param("establ_id") Long establecimiento,
                                @Param("asignatura") Long asignatura_id, @Param("fecha") String fecha);
}
