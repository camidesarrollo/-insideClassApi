package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DocenteAsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteAsignaturaRepository extends JpaRepository<DocenteAsignaturaEntity, Long> {

    @Query(value = "select * from t_docente_asignatura da\n" +
            "inner join t_docente d on da.docente_asignatura_docente_id = d.docente_id\n" +
            "inner join t_asignatura a on a.asignatura_id =da.docente_asignatura_id_asignatura_id\n" +
            "where (:docente_id = -1 OR d.docente_id = :docente_id) \n" +
            "AND (:docente_persona_run = '-1' OR d.docente_persona_run = :docente_persona_run)\n" +
            "AND (a.asignatura_id = :asignatura_id or :asignatura_id = -1) \n" +
            "AND (a.asignatura_nombre = :asignatura_nombre or :asignatura_nombre =  '-1')\n", nativeQuery = true)
    List<DocenteAsignaturaEntity> findByFilters(@Param("asignatura_id") Long asignatura_id,
                                         @Param("asignatura_nombre") String asignatura_nombre,
                                         @Param("docente_id") Long docente_id,
                                         @Param("docente_persona_run") String docente_persona_run);
}
