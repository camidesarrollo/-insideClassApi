package com.springboot.insideClass.repository;


import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DocenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoEstablecimientoRepository extends JpaRepository<CursoEstablecimientoEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_curso_establ where t_curso_establ.curso_establ_curso_id = ? and t_curso_establ.curso_establ_establ_id = ? and t_curso_establ.vigencia = 1")
    CursoEstablecimientoEntity findCursoEstablecimientoByCursoAndEstablecimiento(@Param("curso_establ_curso_id") long curso_establ_curso_id, @Param("curso_establ_establ_id") long curso_establ_establ_id);

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
