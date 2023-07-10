package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.SostenedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SostenedorRepository extends JpaRepository<SostenedorEntity, Long> {
/*
    @Query("SELECT * FROM T_SOSTENEDOR s WHERE " +
            "(:sostenedor_id = -1 OR s.sostenedor_id = :sostenedor_id) " +
            "AND (:sostenedor_nombre = '-1' OR s.sostenedor_nombre = :sostenedor_nombre) " +
            "AND (:sostenedor_representante_legal_id = -1 OR s.sostenedor_representante_legal_id = :sostenedor_representante_legal_id)")
    List<SostenedorEntity> findByFilters(@Param("sostenedor_id") Long sostenedor_id,
                                         @Param("sostenedor_nombre") String sostenedor_nombre,
                                         @Param("sostenedor_representante_legal_id") Long sostenedor_representante_legal_id);*/
}
