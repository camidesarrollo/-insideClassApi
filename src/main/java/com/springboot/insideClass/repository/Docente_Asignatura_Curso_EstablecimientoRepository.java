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
}
