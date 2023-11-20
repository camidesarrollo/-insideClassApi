package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.NotasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotasRepository extends JpaRepository<NotasEntity, Long> {
    @Query(value = "Select distinct pa.persona_run as alumno_run,\n" +
            "                    pa.persona_apellido_materno as alumno_apellido_materno,\n" +
            "                    pa.persona_apellido_paterno as alumno_apellido_paterno,\n" +
            "                    pa.persona_fecha_nacimiento as alumno_fecha_nacimiento,\n" +
            "                    pa.persona_nombre as alumno_nombre,\n" +
            "                    pa.persona_numero_celular as alumno_numero_celular,\n" +
            "                    pa.persona_numero_telefonico as alumno_numero_telefonico,\n" +
            "                    pa.persona_sexo as alumno_numero_sexo,\n" +
            "                    n.*, pd.persona_run as docente_run,\n" +
            "                    pd.persona_apellido_materno as docente_apellido_materno,\n" +
            "                    pd.persona_apellido_paterno as docente_apellido_paterno,\n" +
            "                    pd.persona_fecha_nacimiento as docente_fecha_nacimiento,\n" +
            "                   pd.persona_nombre as docente_nombre,\n" +
            "                    pd.persona_numero_celular as docente_numero_celular,\n" +
            "                    pd.persona_numero_telefonico as docente_numero_telefonico,\n" +
            "                    pd.persona_sexo as docente_numero_sexo, asi.*, c.*  \n" +
            "FROM t_matricula m left join t_dace_notas n on m.matricula_id = n.notas_matricula_id \n" +
            "\t\t\t  left join t_curso_establecimiento ce on m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "\t\t\t \n" +
            "\t\t\t  left join t_docente_asignatura_curso_establecimiento dace on ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id \n" +
            "\t\t\t  \n" +
            "                  left join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_docente_id\n" +
            "                    left join t_asignatura asi on da.docente_asignatura_id_asignatura_id = asi.asignatura_id\n" +
            "                   \n" +
            "                    left join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "                    left join t_docente d on da.docente_asignatura_docente_id = d.docente_id\n" +
            "                   left join t_alumno al on m.matricula_alumno_id = al.alumno_id\n" +
            "                    left join t_persona pd on pd.persona_run = d.docente_persona_run\n" +
            "                   left join t_persona pa on pa.persona_run = al.alumno_persona_run" +
            "                    WHERE\n" +
            "                   (m.matricula_vigencia = :matricula_vigencia OR :matricula_vigencia = -1)\n" +
            "                    AND (ce.curso_establecimiento_establecimiento_id = :establecimiento_id OR :establecimiento_id = -1) \n" +
            "                    AND (m.matricula_apoderado_id = :apoderado_id OR :apoderado_id = -1)\n" +
            "                    AND (pa.persona_run = :alumno_run OR :alumno_run = '-1')\n" +
            "                    AND (n.notas_matricula_id = :anotaciones_matricula_id OR :anotaciones_matricula_id = -1) \n" +
            "                    AND (pd.persona_run = :docente_run OR :docente_run = '-1')\n" +
            "                    AND (asi.asignatura_id = :asignatura_id OR :asignatura_id = -1)\n" +
            "                    AND (c.curso_id = :curso_id OR :curso_id = -1) order by n.notas_fecha desc", nativeQuery = true)
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
