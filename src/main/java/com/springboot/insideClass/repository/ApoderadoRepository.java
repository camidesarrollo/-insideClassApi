package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ApoderadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long> {

    @Query(nativeQuery = true, value = "select * from t_apoderado where t_apoderado.apoderado_persona_run = ?")
    ApoderadoEntity findApoderadoByRun(@Param("apoderado_persona_run") String apoderado_persona_run);

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoAlumno(:establecimiento, :vigencia, :apoderado_run )")
    List<Object> fn_InfoApoderado(@Param("establecimiento") Long establecimiento,
                                  @Param("vigencia") Integer vigencia, @Param("apoderado_run") String apoderado_run);

}
