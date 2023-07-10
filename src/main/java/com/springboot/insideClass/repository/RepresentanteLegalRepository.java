package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.RepresentanteLegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepresentanteLegalRepository extends JpaRepository<RepresentanteLegalEntity, Long> {

    @Query(value = "SELECT * FROM t_representante_legal WHERE " +
            "(:representante_legal_id = -1 OR representante_legal_id = :representante_legal_id) " +
            "AND (:representante_legal_persona_run = '-1' OR representante_legal_persona_run = :representante_legal_persona_run)",
            nativeQuery = true)
    List<RepresentanteLegalEntity> findByFilters(@Param("representante_legal_id") Long representante_legal_id,
                                                 @Param("representante_legal_persona_run") String representante_legal_persona_run);
}
