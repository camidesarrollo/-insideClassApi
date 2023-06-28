package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CursoEstablecimientoRepository extends JpaRepository<CursoEstablecimientoEntity, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM t_curso_establ " +
            "WHERE (t_curso_establ.curso_establ_curso_id = :curso_establ_curso_id or -1 = :curso_establ_curso_id ) " +
            "AND (t_curso_establ.curso_establ_establ_id = :curso_establ_establ_id or -1 = :curso_establ_establ_id) " +
            "AND t_curso_establ.vigencia = 1 " +
            "AND YEAR(curso_establ_fecha_fin) = :curso_establ_fecha_fin ")
    List<CursoEstablecimientoEntity> findCursoEstablecimientoByCursoAndEstablecimiento(
            @Param("curso_establ_curso_id") long curso_establ_curso_id,
            @Param("curso_establ_establ_id") long curso_establ_establ_id,
            @Param("curso_establ_fecha_fin") Integer curso_establ_fecha_fin);



    @Query(nativeQuery = true, value = "Select * from t_curso_establ ce " +
            "where ce.curso_establ_curso_id = :curso and ce.curso_establ_establ_id = :establecimiento " +
            "and ce.curso_establ_fecha_inicio = :fecha_inicio and ce.curso_establ_fecha_fin = :fecha_fin ")
    CursoEstablecimientoEntity findCursoEstablecimientoByEstablecimiento(@Param("establecimiento") long establecimiento, @Param("curso") long curso, @Param("fecha_inicio") Date fecha_inicio,@Param("fecha_fin") Date fecha_fin);

    @Query(nativeQuery = true, value = "SELECT *  " +
            "FROM [insideClass].[dbo].[t_curso_establ] "+
            "WHERE\n" +
            "    (curso_establ_id = :curso_establ_id OR :curso_establ_id = -1)\n" +
            "    AND (curso_establ_fecha_fin = :curso_establ_fecha_fin OR :curso_establ_fecha_fin IS NULL)\n" +
            "    AND (curso_establ_fecha_inicio = :curso_establ_fecha_inicio OR :curso_establ_fecha_inicio IS NULL)\n" +
            "    AND (dia = :dia OR :dia IS NULL)\n" +
            "    AND (hora_fin = :hora_fin OR :hora_fin IS NULL)\n" +
            "    AND (hora_inicio = :hora_inicio OR :hora_inicio IS NULL)\n" +
            "    AND (vigencia = :vigencia OR :vigencia IS NULL)\n" +
            "    AND (curso_establ_curso_id = :curso_establ_curso_id OR :curso_establ_curso_id = -1)\n" +
            "    AND (curso_establ_establ_id = :curso_establ_establ_id OR :curso_establ_establ_id = -1) ")
    List<CursoEstablecimientoEntity> findAllFilter(@Param("curso_establ_id") long curso_establ_id,
                                                   @Param("curso_establ_fecha_fin") Date curso_establ_fecha_fin,
                                                   @Param("curso_establ_fecha_inicio") Date curso_establ_fecha_inicio,
                                                   @Param("dia") String dia,
                                                   @Param("hora_fin") String hora_fin,
                                                   @Param("hora_inicio") String hora_inicio,
                                                   @Param("vigencia") Boolean vigencia,
                                                   @Param("curso_establ_curso_id") long curso_establ_curso_id,
                                                   @Param("curso_establ_establ_id") long curso_establ_establ_id);




}


