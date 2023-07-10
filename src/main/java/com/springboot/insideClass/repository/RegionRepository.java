package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<RegionEntity, Long> {
    @Query(value = "SELECT r FROM t_region r " +
            "WHERE (:regionId -1 OR r.regionId = :regionId) " +
            "AND (:regionAbreviatura '-1' OR r.regionAbreviatura = :regionAbreviatura) " +
            "AND (:regionCapital '-1' OR r.regionCapital = :regionCapital) " +
            "AND (:regionNombre '-1' OR r.regionNombre = :regionNombre)", nativeQuery = true)
    List<RegionEntity> findByFilters(@Param("regionId") Long regionId,
                                     @Param("regionAbreviatura") String regionAbreviatura,
                                     @Param("regionCapital") String regionCapital,
                                     @Param("regionNombre") String regionNombre);
}
