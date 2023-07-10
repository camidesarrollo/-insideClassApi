package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoEstablecimientoRepository extends JpaRepository<CursoEstablecimientoEntity, Long> {

    @Query(value = "SELECT *\n" +
            "FROM t_curso_establecimiento\n" +
            "WHERE  (:vigencia = -1 OR vigencia = :vigencia)\n" +
            "  AND (:curso_establecimiento_curso_id =  -1 OR curso_establecimiento_curso_id = :curso_establecimiento_curso_id)\n" +
            "  AND (:curso_establecimiento_id =  -1 OR curso_establecimiento_id = :curso_establecimiento_id)\n" +
            "  AND (:curso_establecimiento_establecimiento_id  =  -1 OR curso_establecimiento_establecimiento_id = :curso_establecimiento_establecimiento_id);\n", nativeQuery = true)
    List<CursoEstablecimientoEntity> findByFilters(@Param("curso_establecimiento_id")  Long curso_establecimiento_id,
                                                   @Param("curso_establecimiento_curso_id")  Long curso_establecimiento_curso_id,
                                                   @Param("curso_establecimiento_establecimiento_id")  Long curso_establecimiento_establecimiento_id,
                                                   @Param("vigencia")  Boolean vigencia);
}
