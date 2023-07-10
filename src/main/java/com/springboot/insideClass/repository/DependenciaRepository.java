package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DependenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DependenciaRepository extends JpaRepository<DependenciaEntity, Long> {
    @Query(value = "SELECT *\n" +
            "FROM t_dependencia\n" +
            "WHERE t_dependencia.dependencia_id = :dependencia_id OR :dependencia_id = -1\n" +
            "AND t_dependencia.dependencia_nombre = :dependencia_nombre OR :dependencia_nombre = '-1'", nativeQuery = true)
    List<DependenciaEntity> findByFilters(@Param("dependencia_id") Long dependencia_id, @Param("dependencia_nombre") String dependencia_nombre);
}
