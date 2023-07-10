package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {

    @Query(value = "select * from t_curso c where (c.comuna_id = :comuna_id or :comuna_id = -1) and (c.curso_nombre = :curso_nombre or :curso_nombre is null) and (c.curso_nivel = :curso_nivel or :curso_nivel is null) ", nativeQuery = true)
    List<CursoEntity> findByFilters(@Param("comuna_id") Long curso_id, @Param("curso_nombre") String curso_nombre, @Param("curso_nivel") String curso_nivel);

    @Query(value = "Select  c.* from t_curso c inner join t_curso_establecimiento ce on c.curso_id = ce.curso_establecimiento_curso_id\n" +
            "inner join t_docente_asignatura_curso_establecimiento dace on ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id\n" +
            "inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id\n" +
            "where (da.docente_asignatura_docente_id = :docente_asignatura_docente_id or :docente_asignatura_docente_id = -1) " +
            "and (da.docente_asignatura_id_asignatura_id = :docente_asignatura_id_asignatura_id or :docente_asignatura_id_asignatura_id = -1) \n" +
            "AND ((ISDATE(:fecha_fin) = 1 AND (TRY_CONVERT(date,dace.fecha_fin) >= TRY_CONVERT(date, :fecha_fin)) OR :fecha_fin = '-1'))\n" +
            "AND (:vigencia = '-1' OR ce.vigencia = :vigencia) " +
            "AND (:curso_establecimiento_curso_id =  -1 OR ce.curso_establecimiento_curso_id = :curso_establecimiento_curso_id)\n" +
            "AND (:curso_establecimiento_establecimiento_id  =  -1 OR ce.curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id)", nativeQuery = true)
    List<CursoEntity> findByDocente(@Param("docente_asignatura_docente_id") Long docente_asignatura_docente_id,
                                    @Param("docente_asignatura_id_asignatura_id") Long docente_asignatura_id_asignatura_id,
                                    @Param("fecha_fin") String fecha_fin,
                                    @Param("vigencia") boolean vigencia,
                                    @Param("curso_establecimiento_curso_id") Long curso_establecimiento_curso_id,
                                    @Param("curso_establecimiento_establecimiento_id") Long curso_establecimiento_establecimiento_id);

    @Query(value = "Select c.* from t_curso c inner join t_curso_establecimiento ce on c.curso_id = ce.curso_establecimiento_curso_id\n" +
            "            inner join t_matricula m on ce.curso_establecimiento_id = m.matricula_curso_establecimiento_id AND (:vigencia = -1 OR ce.vigencia = :vigencia)\n" +
            "AND (:curso_establecimiento_curso_id =  -1 OR ce.curso_establecimiento_curso_id = :curso_establecimiento_curso_id)\n" +
            "AND (:curso_establecimiento_establecimiento_id  =  -1 OR ce.curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id)\n" +
            "AND (:vigenciaMatricula = '-1' OR m.matricula_vigencia = :vigenciaMatricula)\n" +
            "AND (:curso_agno =  '-1' OR m.curso_agno = :curso_agno)\n" +
            "AND (:matricula_apoderado_id =  '-1' OR m.matricula_apoderado_id = :matricula_apoderado_id)\n" +
            "AND (:matricula_alumno_id =  '-1' OR m.matricula_alumno_id = :matricula_alumno_id)", nativeQuery = true)
    List<CursoEntity> findByApoderado(@Param("vigencia") boolean vigencia,
                                    @Param("curso_establecimiento_curso_id") Long curso_establecimiento_curso_id,
                                    @Param("curso_establecimiento_establecimiento_id") Long curso_establecimiento_establecimiento_id,
                                    @Param("vigenciaMatricula") boolean vigenciaMatricula,
                                      @Param("curso_agno") Long curso_agno,
                                      @Param("matricula_apoderado_id") Long matricula_apoderado_id,
                                      @Param("matricula_alumno_id") Long matricula_alumno_id
                                    );

    @Query(value = "Select c.* from t_curso c inner join t_curso_establecimiento ce on c.curso_id = ce.curso_establecimiento_curso_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "inner join t_director d on e.establecimiento_id =  d.director_establecimiento_id\n" +
            "AND (:vigencia = '-1' OR ce.vigencia = :vigencia) " +
            "AND (:curso_establecimiento_curso_id =  '-1' OR ce.curso_establecimiento_curso_id = :curso_establecimiento_curso_id)\n" +
            "AND (:curso_establecimiento_establecimiento_id  =  '-1' OR ce.curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id)\n" +
            "AND (:director_id = -1 OR d.director_id = :director_id) AND (:director_persona_run = '-1' OR d.director_persona_run = :director_persona_run)", nativeQuery = true)
    List<CursoEntity> findByDirector(@Param("vigencia") boolean vigencia,
                                      @Param("curso_establecimiento_curso_id") Long curso_establecimiento_curso_id,
                                      @Param("curso_establecimiento_establecimiento_id") Long curso_establecimiento_establecimiento_id,
                                      @Param("director_id") String director_id,
                                     @Param("director_persona_run") String director_persona_run
    );



}
