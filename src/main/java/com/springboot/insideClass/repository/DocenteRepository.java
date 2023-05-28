package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoDocente(:establecimiento, :persona_run, :curso_id)")
    List<Object> getInfoDocente(@Param("establecimiento") long establecimiento, @Param("persona_run") String persona_run, @Param("curso_id") long curso_id);

    @Query(nativeQuery = true, value = "SELECT * FROM t_docente where t_docente.docente_persona_run = ? ")
    DocenteEntity findDocenteByRun(@Param("docente_persona_run") String docente_persona_run);


    @Query(nativeQuery = true, value = "SELECT * FROM t_docente where t_docente.docente_persona_run = ? ")
   List<DocenteEntity> findDocenteByIdCursoEstablecimiento(@Param("docente_persona_run") String docente_persona_run);




}
