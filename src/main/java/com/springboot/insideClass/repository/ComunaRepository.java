package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ComunaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComunaRepository extends JpaRepository<ComunaEntity, Long> {

    @Query(value = "select * from t_comuna c where (c.comuna_id = :comuna_id or :comuna_id = -1) and (c.comuna_nombre = :comuna_nombre or :comuna_nombre = '-1') and (c.comuna_provincia_id = :comuna_provincia_id or :comuna_provincia_id = -1) and (c.comuna_deprov_id = :comuna_deprov_id or :comuna_deprov_id = -1)", nativeQuery = true)
    List<ComunaEntity> findByFilters(@Param("comuna_id") Long comuna_id, @Param("comuna_nombre") String comuna_nombre, @Param("comuna_provincia_id") Long comuna_provincia_id, @Param("comuna_deprov_id") Long comuna_deprov_id);
}
