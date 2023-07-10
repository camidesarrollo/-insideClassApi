package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DireccionRepository extends JpaRepository<DireccionEntity, Long> {
    @Query(value = "SELECT *\n" +
            "FROM t_direccion\n" +
            "WHERE t_direccion.direccion_id = :direccion_id OR :direccion_id = -1\n" +
            "AND t_direccion.direccion_comuna_id = :direccion_comuna_id OR :direccion_comuna_id = -1\n" +
            "AND t_direccion.direccion_tipo_area = :direccion_tipo_area OR :direccion_tipo_area = -1\n" +
            "AND t_direccion.direccion_calle = :direccion_calle OR :direccion_calle = '-1'\n" +
            "AND t_direccion.direccion_info_adicional = :direccion_info_adicional OR :direccion_info_adicional = '-1'\n" +
            "AND t_direccion.direccion_geo_x = :direccion_geo_x OR :direccion_geo_x = '-1'\n" +
            "AND t_direccion.direccion_geo_y = :direccion_geo_y OR :direccion_geo_y = '-1'", nativeQuery = true)
    List<DireccionEntity> findByFilters(@Param("direccion_id") Long direccion_id, @Param("direccion_calle") String direccion_calle,
                                        @Param("direccion_info_adicional") String direccion_info_adicional,
                                        @Param("direccion_geo_x") String direccion_geo_x,
                                        @Param("direccion_geo_y") String direccion_geo_y,
                                        @Param("direccion_comuna_id")Long direccion_comuna_id,
                                        @Param("direccion_tipo_area")Long direccion_tipo_area);
}
