package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.VigenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VigenciaRepository extends JpaRepository<VigenciaEntity, Long> {

    @Query(value = "SELECT * FROM t_vigencia WHERE " +
            "(:vigencia_id = -1 OR vigencia_id = :vigencia_id) " +
            "AND (:vigencia_nombre = '-1' OR vigencia_nombre = :vigencia_nombre)",
            nativeQuery = true)
    List<VigenciaEntity> findByFilters(@Param("vigencia_id") Long vigenciaId,
                                       @Param("vigencia_nombre") String vigenciaNombre);
}
