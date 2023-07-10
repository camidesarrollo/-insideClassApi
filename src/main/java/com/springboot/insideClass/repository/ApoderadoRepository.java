package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ApoderadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long> {

    @Query(value = "select * from t_apoderado a where (a.apoderado_id = :apoderado_id or :apoderado_id = -1) and (a.apoderado_persona_run = :apoderado_persona_run or :apoderado_persona_run =  '-1')", nativeQuery = true)
    List<ApoderadoEntity> findByFilters(@Param("apoderado_id") Long alumno_id, @Param("apoderado_persona_run") String apoderado_persona_run);
}
