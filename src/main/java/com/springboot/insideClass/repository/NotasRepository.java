package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.NotasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotasRepository extends JpaRepository<NotasEntity, Long> {
    @Query(value = "SELECT DISTINCT \n" +
            "    pa.persona_run AS alumno_run,\n" +
            "    pa.persona_apellido_materno AS alumno_apellido_materno,\n" +
            "    pa.persona_apellido_paterno AS alumno_apellido_paterno,\n" +
            "    pa.persona_fecha_nacimiento AS alumno_fecha_nacimiento,\n" +
            "    pa.persona_nombre AS alumno_nombre,\n" +
            "    pa.persona_numero_celular AS alumno_numero_celular,\n" +
            "    pa.persona_numero_telefonico AS alumno_numero_telefonico,\n" +
            "    pa.persona_sexo AS alumno_numero_sexo,\n" +
            "    n.*, \n" +
            "    t1.persona_run AS docente_run,\n" +
            "    t1.persona_apellido_materno AS docente_apellido_materno,\n" +
            "    t1.persona_apellido_paterno AS docente_apellido_paterno,\n" +
            "    t1.persona_fecha_nacimiento AS docente_fecha_nacimiento,\n" +
            "    t1.persona_nombre AS docente_nombre,\n" +
            "    t1.persona_numero_celular AS docente_numero_celular,\n" +
            "    t1.persona_numero_telefonico AS docente_numero_telefonico,\n" +
            "    t1.persona_sexo AS docente_numero_sexo, \n" +
            "    t1.asignatura_id, \n" +
            "    t1.asignatura_nombre, \n" +
            "    c.*\n" +
            "FROM t_matricula m \n" +
            "LEFT JOIN t_dace_notas n ON m.matricula_id = n.notas_matricula_id \n" +
            "LEFT JOIN t_curso_establecimiento ce ON m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "LEFT JOIN t_curso c ON ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "LEFT JOIN t_alumno al ON m.matricula_alumno_id = al.alumno_id\n" +
            "LEFT JOIN t_persona pa ON pa.persona_run = al.alumno_persona_run    \n" +
            "LEFT JOIN (\n" +
            "    SELECT DISTINCT pd.*, ce.*, asi.*\n" +
            "    FROM t_docente d \n" +
            "    LEFT JOIN t_persona pd ON pd.persona_run = d.docente_persona_run\n" +
            "    LEFT JOIN t_docente_asignatura da ON da.docente_asignatura_docente_id = d.docente_id\n" +
            "    LEFT JOIN t_asignatura asi ON da.docente_asignatura_id_asignatura_id = asi.asignatura_id\n" +
            "    LEFT JOIN t_docente_asignatura_curso_establecimiento dace ON da.docente_asignatura_id = dace.dace_docente_asignatura_id\n" +
            "    LEFT JOIN t_curso_establecimiento ce ON ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id\n" +
            "    WHERE \n" +
            "        (ce.curso_establecimiento_establecimiento_id = :establecimiento_id OR :establecimiento_id = -1) \n" +
            "        AND (pd.persona_run = :docente_run OR :docente_run = '-1') \n" +
            "        AND (asi.asignatura_id = :asignatura_id OR :asignatura_id = -1)\n" +
            ") t1 ON t1.curso_establecimiento_curso_id = ce.curso_establecimiento_curso_id\n" +
            "WHERE \n" +
            "    (m.matricula_vigencia = :matricula_vigencia OR :matricula_vigencia = -1)\n" +
            "    AND (m.matricula_apoderado_id = :apoderado_id OR :apoderado_id = -1)\n" +
            "    AND (pa.persona_run = :alumno_run OR :alumno_run = '-1')\n" +
            "    AND (n.notas_matricula_id = :anotaciones_matricula_id OR :anotaciones_matricula_id = -1) \n" +
            "    AND (c.curso_id = :curso_id OR :curso_id = -1) \n" +
            "ORDER BY n.notas_fecha DESC\n", nativeQuery = true)
    List<Object> findByFilters(
            @Param("matricula_vigencia") boolean matricula_vigencia,
            @Param("establecimiento_id") Long establecimiento_id,
            @Param("apoderado_id") Long apoderado_id,
            @Param("alumno_run") String alumno_run,
            @Param("anotaciones_matricula_id") Long anotaciones_matricula_id,
            @Param("docente_run") String docente_run,
            @Param("asignatura_id") Long asignatura_id,
            @Param("curso_id") Long curso_id
    );
}
