package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.TipoAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoAreaRepository extends JpaRepository<TipoAreaEntity, Long> {

    @Query(value = "SELECT * FROM t_tipo_area WHERE " +
            "(:tipo_area_id = -1 OR tipo_area_id = :tipo_area_id) " +
            "AND (:tipo_area_nombre = '-1' OR tipo_area_nombre = :tipo_area_nombre)", nativeQuery = true)
    List<TipoAreaEntity> findByFilters(@Param("tipo_area_id") Long tipo_area_id,
                                       @Param("tipo_area_nombre") String tipo_area_nombre);
}
