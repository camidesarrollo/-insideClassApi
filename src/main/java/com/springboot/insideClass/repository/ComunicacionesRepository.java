package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ComunicacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComunicacionesRepository extends JpaRepository<ComunicacionesEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM fn_InfoComunicaciones(:persona_run, :curso_id , :establ_id,:fecha)")
    List<Object> fn_Comunicaciones(@Param("persona_run") String persona_run, @Param("curso_id") Long curso_id,
                                @Param("establ_id") Long establecimiento,
                                @Param("fecha") String fecha);
}
