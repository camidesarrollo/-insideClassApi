package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.Docente_Asignatura_Curso_EstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Docente_Asignatura_Curso_EstablecimientoRepository extends JpaRepository<Docente_Asignatura_Curso_EstablecimientoEntity, Long> {

    @Query(value = "select * from t_docente_asignatura_curso_establecimiento\n" +
            "where (dace_id = :dace_id or :dace_id = -1)\n" +
            "and (dace_curso_establecimiento_id = :dace_curso_establecimiento_id or :dace_curso_establecimiento_id = -1)\n" +
            "and (dace_docente_asignatura_id = :dace_docente_asignatura_id or :dace_docente_asignatura_id = -1)\n" +
            "AND ((ISDATE(:fecha_inicio) = 1 AND (TRY_CONVERT(DATE,fecha_inicio) = TRY_CONVERT(DATETIME2, :fecha_inicio)) OR :fecha_inicio = '-1'))\n" +
            "AND ((ISDATE(:fecha_fin) = 1 AND (TRY_CONVERT(DATE,fecha_fin) = TRY_CONVERT(DATETIME2, :fecha_fin)) OR :fecha_fin = '-1'))\n" +
            "AND (year(fecha_inicio) = :anio_incio or :anio_incio = -1 ) \n" +
            "AND (year(fecha_fin) = :anio_fin or :anio_fin = -1 ) ", nativeQuery = true)
    List<Docente_Asignatura_Curso_EstablecimientoEntity> findByFilters(@Param("dace_id") Long dace_id,
                                                @Param("dace_curso_establecimiento_id") Long dace_curso_establecimiento_id,
                                                @Param("dace_docente_asignatura_id") Long dace_docente_asignatura_id,
                                               @Param("fecha_inicio") String fecha_inicio,
                                               @Param("fecha_fin") String fecha_fin,
                                               @Param("anio_incio") int anio_incio,
                                               @Param("anio_fin") int anio_fin);

    @Query(value = "select dace.* from t_docente_asignatura_curso_establecimiento dace \n" +
            "inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id \n" +
            "inner join t_curso_establecimiento ce on ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id \n" +
            "inner join t_asignatura a on  da.docente_asignatura_id_asignatura_id = a.asignatura_id \n" +
            "inner join t_docente d on da.docente_asignatura_docente_id = d.docente_id \n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id  = c.curso_id\n" +
            "inner join t_establecimiento e on  ce.curso_establecimiento_establecimiento_id  = e.establecimiento_id " +
            "where \n" +
            "(d.docente_id = :docente_id or  :docente_id = -1) and ( d.docente_persona_run = :docente_persona_run or :docente_persona_run = '-1') and \n" +
            "(a.asignatura_id = :asignatura_id or :asignatura_id = -1) and (a.asignatura_nombre = :asignatura_nombre or :asignatura_nombre = '-1') and \n" +
            "(c.curso_id = :curso_id or :curso_id = -1 ) and (c.curso_nivel = :curso_nivel or :curso_nivel = '-1') and (c.curso_nombre = :curso_nombre or :curso_nombre = '-1') and \n" +
            "(e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) and (e.establecimiento_nombre = :establecimiento_nombre or :establecimiento_nombre = '-1') AND \n" +
            "((ISDATE(:fecha_inicio) = 1 AND (TRY_CONVERT(DATE,fecha_inicio) = TRY_CONVERT(DATETIME2, :fecha_inicio)) OR :fecha_inicio = '-1')) AND \n" +
            "((ISDATE(:fecha_fin) = 1 AND (TRY_CONVERT(DATE,fecha_fin) = TRY_CONVERT(DATETIME2, :fecha_fin)) OR :fecha_fin = '-1')) AND \n" +
            "(year(fecha_inicio) = :anio_incio or :anio_incio = -1 ) AND (year(fecha_fin) = :anio_fin  or :anio_fin = -1 )  ", nativeQuery = true)
    List<Docente_Asignatura_Curso_EstablecimientoEntity> findByFiltersIndex(@Param("docente_id") Long docente_id,
                                                                       @Param("docente_persona_run") String docente_persona_run,
                                                                       @Param("asignatura_id") Long asignatura_id,
                                                                       @Param("asignatura_nombre") String asignatura_nombre,
                                                                       @Param("curso_id") Long curso_id,
                                                                       @Param("curso_nivel") String curso_nivel,
                                                                       @Param("curso_nombre") String curso_nombre,
                                                                        @Param("establecimiento_id") Long establecimiento_id,
                                                                        @Param("establecimiento_nombre") String establecimiento_nombre,
                                                                        @Param("fecha_inicio") String fecha_inicio,
                                                                        @Param("fecha_fin") String fecha_fin,
                                                                        @Param("anio_incio") int anio_incio,
                                                                        @Param("anio_fin") int anio_fin);


    @Query(value = "select dace.* from t_docente_asignatura_curso_establecimiento dace \n" +
            "inner join t_docente_asignatura da on dace.dace_docente_asignatura_id = da.docente_asignatura_id \n" +
            "inner join t_curso_establecimiento ce on ce.curso_establecimiento_id = dace.dace_curso_establecimiento_id \n" +
            "inner join t_asignatura a on  da.docente_asignatura_id_asignatura_id = a.asignatura_id \n" +
            "inner join t_docente d on da.docente_asignatura_docente_id = d.docente_id \n" +
            "inner join t_curso c on ce.curso_establecimiento_curso_id  = c.curso_id\n" +
            "inner join t_establecimiento e on  ce.curso_establecimiento_establecimiento_id  = e.establecimiento_id " +
            "where \n" +
            "(d.docente_id = :docente_id or  :docente_id = -1) and ( d.docente_persona_run = :docente_persona_run or :docente_persona_run = '-1') and \n" +
            "(a.asignatura_id = :asignatura_id or :asignatura_id = -1) and (a.asignatura_nombre = :asignatura_nombre or :asignatura_nombre = '-1') and \n" +
            "(c.curso_id = :curso_id or :curso_id = -1 ) and (c.curso_nivel = :curso_nivel or :curso_nivel = '-1') and (c.curso_nombre = :curso_nombre or :curso_nombre = '-1') and \n" +
            "(e.establecimiento_id = :establecimiento_id or :establecimiento_id = -1) and (e.establecimiento_nombre = :establecimiento_nombre or :establecimiento_nombre = '-1') AND \n" +
            "((ISDATE(:fecha_inicio) = 1 AND (TRY_CONVERT(DATE,fecha_inicio) = TRY_CONVERT(DATETIME2, :fecha_inicio)) OR :fecha_inicio = '-1')) AND \n" +
            "((ISDATE(:fecha_fin) = 1 AND (TRY_CONVERT(DATE,fecha_fin) > TRY_CONVERT(DATETIME2, :fecha_fin)) OR :fecha_fin = '-1')) AND \n" +
            "(year(fecha_inicio) = :anio_incio or :anio_incio = -1 ) AND (year(fecha_fin) = :anio_fin  or :anio_fin = -1 )  ", nativeQuery = true)
    List<Docente_Asignatura_Curso_EstablecimientoEntity> findByFiltersVigente(@Param("docente_id") Long docente_id,
                                                                            @Param("docente_persona_run") String docente_persona_run,
                                                                            @Param("asignatura_id") Long asignatura_id,
                                                                            @Param("asignatura_nombre") String asignatura_nombre,
                                                                            @Param("curso_id") Long curso_id,
                                                                            @Param("curso_nivel") String curso_nivel,
                                                                            @Param("curso_nombre") String curso_nombre,
                                                                            @Param("establecimiento_id") Long establecimiento_id,
                                                                            @Param("establecimiento_nombre") String establecimiento_nombre,
                                                                            @Param("fecha_inicio") String fecha_inicio,
                                                                            @Param("fecha_fin") String fecha_fin,
                                                                            @Param("anio_incio") int anio_incio,
                                                                            @Param("anio_fin") int anio_fin);
}
