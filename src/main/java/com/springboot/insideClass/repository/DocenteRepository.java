package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<DocenteEntity, Long> {

    @Query(value = "SELECT d.* FROM t_docente d WHERE (:docente_id = -1 OR d.docente_id = :docente_id) " +
            "AND (:docente_persona_run = '-1' OR d.docente_persona_run = :docente_persona_run)", nativeQuery = true)
    List<DocenteEntity> findByFilters(@Param("docente_id") Long docente_id, @Param("docente_persona_run") String docente_persona_run);

    @Query(value = "SELECT distinct d.*, e.*, c.*, p.*\n" +
            "FROM  t_docente d inner join t_docente_asignatura da on d.docente_id = da.docente_asignatura_docente_id\n" +
            "inner join t_asignatura a on da.docente_asignatura_id_asignatura_id = a.asignatura_id\n" +
            "inner join t_docente_asignatura_curso_establecimiento dace on da.docente_asignatura_id =  dace.dace_docente_asignatura_id \n" +
            "inner join t_curso_establecimiento ce on dace.dace_curso_establecimiento_id = ce.curso_establecimiento_id\n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id = c.curso_id\n" +
            "inner join t_establecimiento e on ce.curso_establecimiento_establecimiento_id = e.establecimiento_id\n" +
            "inner join t_persona p on p.persona_run = d.docente_persona_run\n" +
            "WHERE (:docente_run = '-1' OR d.docente_persona_run = :docente_run) and (:curso = '-1' OR c.curso_id = :curso) and (:establecimiento = '-1' OR e.establecimiento_id = :establecimiento)\n" +
            "and TRY_CONVERT(DATE,dace.fecha_fin) >= TRY_CONVERT(DATE,GETDATE()) and d.vigencia = :vigencia", nativeQuery = true)
    List<Object> infoDocente(@Param("docente_run") String docente_run, @Param("curso") Long curso, @Param("establecimiento") Long establecimiento, @Param("vigencia") Boolean vigencia);

}
