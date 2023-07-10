package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {

    @Query(value = "SELECT p.* FROM t_perfil p WHERE " +
            "(:perfil_id = -1 OR p.perfil_id = :perfil_id) " +
            "AND (:perfil_nombre = '-1' OR p.perfil_nombre = :perfil_nombre)", nativeQuery = true)
    List<PerfilEntity> findByFilters(@Param("perfil_id") Long perfil_id,
                                     @Param("perfil_nombre") String perfil_nombre);
}
