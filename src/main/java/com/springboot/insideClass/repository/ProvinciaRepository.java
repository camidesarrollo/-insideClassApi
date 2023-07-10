package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ProvinciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends JpaRepository<ProvinciaEntity, Long> {
    @Query(value = "SELECT p FROM t_provincia p " +
            "WHERE (:provinciaId -1 OR p.provinciaId = :provinciaId) " +
            "AND (:provinciaNombre '-1' OR p.provinciaNombre = :provinciaNombre) " +
            "AND (:provinciaRegionId -1 OR p.provinciaRegionId = :provinciaRegionId)", nativeQuery = true)
    List<ProvinciaEntity> findByFilters(@Param("provinciaId") Long provinciaId,
                                        @Param("provinciaNombre") String provinciaNombre,
                                        @Param("provinciaRegionId") Long provinciaRegionId);
}
