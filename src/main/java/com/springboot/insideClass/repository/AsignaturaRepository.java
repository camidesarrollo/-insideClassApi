package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Long> {
    @Query(value = "select * from t_asignatura a " +
            "where (a.asignatura_id = :asignatura_id or :asignatura_id = -1) " +
            "and (a.asignatura_nombre = :asignatura_nombre or :asignatura_nombre =  '-1')", nativeQuery = true)
    List<AsignaturaEntity> findByFilters(@Param("asignatura_id") Long asignatura_id, @Param("asignatura_nombre") String asignatura_nombre);

    @Query(value = "  SELECT asi.*\n" +
            "FROM     t_docente_asignatura_curso_establecimiento dace INNER JOIN\n" +
            "                  t_docente_asignatura da ON dace.dace_docente_asignatura_id = da.docente_asignatura_id INNER JOIN\n" +
            "                  t_asignatura asi ON da.docente_asignatura_id_asignatura_id = asi.asignatura_id INNER JOIN\n" +
            "                  t_curso_establecimiento ce ON dace.dace_curso_establecimiento_id = ce.curso_establecimiento_id INNER JOIN\n" +
            "                  t_curso c ON ce.curso_establecimiento_curso_id = c.curso_id INNER JOIN\n" +
            "                  t_docente d ON da.docente_asignatura_docente_id = d.docente_id\n" +
            "        where (asi.asignatura_id = :asignatura_id or :asignatura_id = -1) and (asi.asignatura_nombre = :asignatura_nombre or :asignatura_nombre = '-1')\n" +
            "        and (c.curso_id = :curso_id or :curso_id = -1) and (c.curso_nombre = :curso_nombre or :curso_nombre = '-1')\n" +
            "        and (d.docente_id = :docente_id or :docente_id= -1) and (d.docente_persona_run = :docente_persona_run or :docente_persona_run = '-1') " +
            "and (ce.curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id or :curso_establecimiento_establecimiento_id = -1)" +
            "and dace.fecha_fin >= GETDATE()   ", nativeQuery = true)
    List<AsignaturaEntity> findByAsignaturaCursoDocente(@Param("asignatura_id") Long asignatura_id, @Param("asignatura_nombre") String asignatura_nombre,
                                         @Param("curso_id") Long curso_id, @Param("curso_nombre") String curso_nombre,
                                         @Param("docente_id") Long docente_id, @Param("docente_persona_run") String docente_persona_run,
                                                        @Param("curso_establecimiento_establecimiento_id") Long curso_establecimiento_establecimiento_id);
}

