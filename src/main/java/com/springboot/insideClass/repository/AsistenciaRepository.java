package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaEntity, Long> {

    @Query(value = "Select m.*, p.*, a.*, e.*, c.*  from t_asistencia a \n" +
            "inner join t_matricula m on a.asistencia_matricula_id = m.matricula_id\n" +
            "inner join t_curso_establecimiento ce on ce.curso_establecimiento_id = m.matricula_curso_establecimiento_id\n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "inner join t_alumno al on m.matricula_alumno_id = al.alumno_id \n" +
            "inner join t_persona p on al.alumno_persona_run = p.persona_run\n" +
            "where (m.curso_agno = :curso_agno or :curso_agno = -1) and " +
            "(m.matricula_vigencia = :matricula_vigencia or :matricula_vigencia = -1 ) and (m.matricula_apoderado_id = -1 or -1 = -1)\n" +
            "and (al.alumno_persona_run = :alumno_persona_run or :alumno_persona_run = '-1') \n" +
            "AND (ISDATE(:fecha) = 1 AND (a.fecha = TRY_CONVERT(DATETIME2, :fecha) OR :fecha = '-1')) and\n" +
            "(YEAR(a.fecha) = :anio or :anio = -1) and \n" +
            "(e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) " +
            "and (c.curso_id = :curso_id or :curso_id = -1) ", nativeQuery = true)
    List<Object> findByFilters(@Param("curso_agno") int curso_agno,
                                                                       @Param("matricula_vigencia") boolean matricula_vigencia,
                                                                       @Param("alumno_persona_run") String alumno_persona_run,
                                                                       @Param("fecha") String fecha,
                                                                       @Param("anio") int anio,
                                                                       @Param("establecimiento_id") Long establecimiento_id,
                                                                       @Param("curso_id") Long curso_id);
}
