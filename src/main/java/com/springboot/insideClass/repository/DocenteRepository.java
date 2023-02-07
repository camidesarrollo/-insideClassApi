package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoDocente(:value)")
    List<Object> getInfoDocente(@Param("value") String value);

    @Query(nativeQuery = true, value = "SELECT * FROM t_docente where t_docente.docente_persona_run = ? ")
    DocenteEntity findDocenteByRun(@Param("docente_persona_run") String docente_persona_run);
}
