package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AlumnoEntity;
import com.springboot.insideClass.entity.ApoderadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long> {

    @Query(nativeQuery = true, value = "select * from t_apoderado where t_apoderado.apoderado_persona_run = ?")
    ApoderadoEntity findApoderadoByRun(@Param("apoderado_persona_run") String apoderado_persona_run);
}
