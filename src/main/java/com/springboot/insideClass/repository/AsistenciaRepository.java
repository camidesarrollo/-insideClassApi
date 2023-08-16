package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaEntity, Long> {

    @Query(value = "SELECT\n" +
            "  m.*,\n" +
            "  p.*,\n" +
            "  a.*,\n" +
            "  e.*,\n" +
            "  c.*,\n" +
            "  CASE\n" +
            "    WHEN a.asistencia_id IS NULL THEN NULL\n" +
            "    ELSE 1\n" +
            "  END AS asistencia_presente\n" +
            "FROM\n" +
            "  t_matricula m\n" +
            "LEFT JOIN\n" +
            "  t_asistencia a ON a.asistencia_matricula_id = m.matricula_id and (ISDATE(:fecha) = 1 and TRY_CONVERT(DATE,a.fecha) = TRY_CONVERT(DATE,:fecha) OR :fecha = '-1')\n" +
            "LEFT JOIN\n" +
            "  t_curso_establecimiento ce ON ce.curso_establecimiento_id = m.matricula_curso_establecimiento_id\n" +
            "LEFT JOIN\n" +
            "  t_curso c ON ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "LEFT JOIN\n" +
            "  t_establecimiento e ON ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "LEFT JOIN\n" +
            "  t_alumno al ON m.matricula_alumno_id = al.alumno_id\n" +
            "LEFT JOIN\n" +
            "  t_persona p ON al.alumno_persona_run = p.persona_run\n" +
            "where (m.curso_agno = :curso_agno or :curso_agno = -1) \n" +
            "and (m.matricula_vigencia = :matricula_vigencia or :matricula_vigencia = -1 ) \n" +
            "and (m.matricula_apoderado_id = -1 or -1 = -1)\n" +
            "and (al.alumno_persona_run = :alumno_persona_run or :alumno_persona_run = '-1') \n" +
            "and ((YEAR(a.fecha) = :anio  or  a.fecha is null) or :anio = -1) and \n" +
            "(e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) and (c.curso_id = :curso_id or :curso_id = -1) ", nativeQuery = true)
    List<Object> findByFilters(@Param("curso_agno") int curso_agno,
                                                                       @Param("matricula_vigencia") boolean matricula_vigencia,
                                                                       @Param("alumno_persona_run") String alumno_persona_run,
                                                                       @Param("fecha") String fecha,
                                                                       @Param("anio") int anio,
                                                                       @Param("establecimiento_id") Long establecimiento_id,
                                                                       @Param("curso_id") Long curso_id);

    @Query(value = "SELECT\n" +
            "        a.*\n" +
            "        FROM\n" +
            "        t_matricula m\n" +
            "        inner JOIN\n" +
            "        t_asistencia a ON a.asistencia_matricula_id = m.matricula_id\n" +
            "        and (ISDATE(:fecha) = 1 and TRY_CONVERT(DATE,a.fecha) = TRY_CONVERT(DATE,:fecha) OR :fecha = '-1')   where (m.matricula_id = :matricula_id or :matricula_id = -1) ", nativeQuery = true)
    List<AsistenciaEntity> findByMatricuala(@Param("matricula_id") long matricula_id,
                               @Param("fecha") String fecha);
}

