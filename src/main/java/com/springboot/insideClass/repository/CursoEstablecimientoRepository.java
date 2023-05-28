package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoEstablecimientoRepository extends JpaRepository<CursoEstablecimientoEntity, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM t_curso_establ " +
            "WHERE (t_curso_establ.curso_establ_curso_id = :curso_establ_curso_id or -1 = :curso_establ_curso_id ) " +
            "AND (t_curso_establ.curso_establ_establ_id = :curso_establ_establ_id or -1 = :curso_establ_establ_id) " +
            "AND t_curso_establ.vigencia = 1 " +
            "AND (t_curso_establ.curso_establ_matricula_id = :curso_establ_matricula_id OR :curso_establ_matricula_id = -1) " +
            "AND YEAR(curso_establ_fecha_fin) = :curso_establ_fecha_fin " +
            "AND YEAR(curso_establ_fecha_inicio) = :curso_establ_fecha_inicio")
    List<CursoEstablecimientoEntity> findCursoEstablecimientoByCursoAndEstablecimiento(
            @Param("curso_establ_curso_id") long curso_establ_curso_id,
            @Param("curso_establ_establ_id") long curso_establ_establ_id,
            @Param("curso_establ_matricula_id") Integer curso_establ_matricula_id,
            @Param("curso_establ_fecha_inicio") Integer curso_establ_fecha_inicio,
            @Param("curso_establ_fecha_fin") Integer curso_establ_fecha_fin);



    @Query(nativeQuery = true, value = "SELECT e.establ_id, \n" +
            "       e.establ_nombre,\n" +
            "\t   c.curso_id,\n" +
            "\t   c.curso_nombre,\n" +
            "\t   dc.docente_jefe,\n" +
            "\t   dc.docente_cuso_fecha_fin\n" +
            "FROM     t_establ e INNER JOIN\n" +
            "                  t_curso_establ ce ON e.establ_id = ce.curso_establ_establ_id LEFT JOIN\n" +
            "\t\t\t\t  t_docente_curso dc on ce.curso_establ_curso_id = dc.docente_curso_establ_id inner join \n" +
            "                  t_curso c ON ce.curso_establ_curso_id = c.curso_id where e.establ_id = ? and ce.vigencia = 1 ")
    List<Object> findCursoEstablecimientoByEstablecimiento(@Param("establecimiento") long establecimiento);


}
