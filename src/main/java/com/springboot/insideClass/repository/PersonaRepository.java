package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {

    @Query(value = "SELECT p.* FROM t_persona p WHERE " +
            "(:persona_run = '-1' OR p.persona_run = :persona_run) " +
            "AND (:persona_apellido_materno  = '-1' OR p.persona_apellido_materno = :persona_apellido_materno) " +
            "AND (:persona_apellido_paterno  = '-1' OR p.persona_apellido_paterno = :persona_apellido_paterno) " +
            "AND ((ISDATE(:persona_fecha_nacimiento) = 1 and  TRY_CONVERT(DATE,p.persona_fecha_nacimiento) = TRY_CONVERT(DATE, :persona_fecha_nacimiento) OR :persona_fecha_nacimiento= '-1')) " +
            "AND (:persona_nombre  = '-1'  OR p.persona_nombre = :persona_nombre) " +
            "AND (:persona_numero_celular  = '-1'  OR p.persona_numero_celular = :persona_numero_celular) " +
            "AND (:persona_numero_telefonico = '-1'  OR p.persona_numero_telefonico = :persona_numero_telefonico) " +
            "AND (:persona_sexo = '-1'  OR p.persona_sexo = :persona_sexo)", nativeQuery = true)
    List<PersonaEntity> findByFilters(@Param("persona_run") String persona_run,
                                      @Param("persona_apellido_materno") String persona_apellido_materno,
                                      @Param("persona_apellido_paterno") String persona_apellido_paterno,
                                      @Param("persona_fecha_nacimiento") String persona_fecha_nacimiento,
                                      @Param("persona_nombre") String persona_nombre,
                                      @Param("persona_numero_celular") String persona_numero_celular,
                                      @Param("persona_numero_telefonico") String persona_numero_telefonico,
                                      @Param("persona_sexo") String persona_sexo);


    @Query(value = "select per.* from t_apoderado apo \n" +
            "inner join t_matricula m on apo.apoderado_id = m.matricula_apoderado_id\n" +
            "inner join t_alumno a on  m.matricula_alumno_id = a.alumno_id \n" +
            "inner join t_persona per on a.alumno_persona_run = per.persona_run\n " +
            "inner join t_curso_establecimiento ce on m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id " +
            "inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id " +
            "where  m.curso_agno = YEAR(CURRENT_TIMESTAMP) and apo.apoderado_persona_run = :apoderado_persona_run and m.matricula_vigencia  = :matricula_vigencia and e.establecimiento_id = :establ_id", nativeQuery = true)
    List<PersonaEntity> findAlumnosByApoderado(@Param("apoderado_persona_run") String apoderado_persona_run, @Param("matricula_vigencia") Boolean matricula_vigencia,
                                               @Param("establ_id") String establ_id);


    @Query(value = "select per.* from t_apoderado apo \n" +
            "inner join t_matricula m on apo.apoderado_id = m.matricula_apoderado_id\n" +
            "inner join t_curso_establecimiento ce on m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "inner join t_alumno a on  m.matricula_alumno_id = a.alumno_id \n" +
            "inner join t_persona per on a.alumno_persona_run = per.persona_run\n" +
        "where  m.curso_agno = YEAR(CURRENT_TIMESTAMP) and m.matricula_vigencia  =  :matricula_vigencia and (ce.curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id or :curso_establecimiento_establecimiento_id = -1) and (ce.curso_establecimiento_curso_id = :curso_establecimiento_curso_id or :curso_establecimiento_curso_id = -1)", nativeQuery = true)
    List<PersonaEntity> findAlumnosByCursoEstablecimiento(@Param("matricula_vigencia") Boolean matricula_vigencia, @Param("curso_establecimiento_establecimiento_id") Long curso_establecimiento_establecimiento_id,
                                               @Param("curso_establecimiento_curso_id") Long curso_establecimiento_curso_id);

    @Query(value = "SELECT DISTINCT\n" +
            "\tper.persona_run,\n" +
            "    per.persona_nombre + '' + per.persona_apellido_paterno + '' + per.persona_apellido_materno as persona_nombre,\n" +
            "    (SELECT TOP 1 m.contenido\n" +
            "     FROM t_mensajeria m\n" +
            "     WHERE m.persona_run = per.persona_run and m.grupo_id is null\n" +
            "     ORDER BY m.fecha_envio DESC ) AS ultimo_mensaje,\n" +
            "\t   (SELECT TOP 1 d.persona_run\n" +
            "     FROM t_mensajeria m\n" +
            "\t inner join t_destinatario d on m.mensaje_id = d.mensaje_id\n" +
            "     WHERE m.persona_run = per.persona_run and m.grupo_id is null\n" +
            "     ORDER BY m.fecha_envio DESC ) AS destinatario,\n" +
            "\t (SELECT COUNT(m.mensaje_id)\n" +
            "     FROM t_mensajeria m\n" +
            "     INNER JOIN t_destinatario d ON m.mensaje_id = d.mensaje_id\n" +
            "     WHERE \n" +
            "\t m.persona_run = per.persona_run \n" +
            "\t AND m.grupo_id IS NULL \n" +
            "\t AND d.visto = 0\n" +
            "    ) AS cantidad_mensajes_no_vistos\n" +
            "FROM t_apoderado apo \n" +
            "INNER JOIN t_matricula m ON apo.apoderado_id = m.matricula_apoderado_id\n" +
            "INNER JOIN t_persona per ON apo.apoderado_persona_run = per.persona_run\n" +
            "inner join t_alumno a on m.matricula_alumno_id = a.alumno_id\n" +
            "INNER JOIN t_curso_establecimiento ce ON m.matricula_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "INNER JOIN t_curso c ON ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "INNER JOIN t_establecimiento e ON ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "where  \n" +
            "(m.curso_agno = YEAR(CURRENT_TIMESTAMP)) and \n" +
            "(apo.apoderado_persona_run = :apoderado_persona_run or :apoderado_persona_run = '-1' ) and\n" +
            "(m.matricula_vigencia  = :matricula_vigencia or :matricula_vigencia = -1 ) and \n" +
            "(e.establecimiento_id = :establ_id  or :establ_id = -1 ) and \n" +
            "(c.curso_id = :curso_id  or :curso_id = -1)", nativeQuery = true)
    List<Object> findApoderadosByEstablecimientoCursoMensaje(@Param("apoderado_persona_run") String apoderado_persona_run, @Param("matricula_vigencia") Boolean matricula_vigencia, @Param("establ_id") Long establ_id, @Param("curso_id") Long curso_id);

    @Query(value = "Select distinct p.* from t_docente_asignatura_curso_establecimiento dace\n" +
            "inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id\n" +
            "inner join t_docente d on da.docente_asignatura_docente_id = d.docente_id\n" +
            "inner join t_curso_establecimiento ce on dace.dace_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "inner join t_persona p on d.docente_persona_run = p.persona_run  where (c.curso_id = :curso_id or :curso_id = -1) \n where dace.profesor_jefe = 1 and" +
            "and (e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) \n" +
            "and (d.docente_id = :docente_id or :docente_id = -1) \n" +
            "and (p.persona_run = :persona_run or :persona_run = '-1')", nativeQuery = true)
    List<PersonaEntity> findDocenteByEstablecimientoCurso(@Param("persona_run") String persona_run,
                                                          @Param("establecimiento_id") Long establecimiento_id,
                                                          @Param("curso_id") Long curso_id, @Param("docente_id") Long docente_id);

}
