package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsignaturaDocenteEntity;
import com.springboot.insideClass.entity.AsignaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<AsignaturaEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_asignatura where t_asignatura.asignatura_id = ?")
    AsignaturaEntity findAsignaturaById(@Param("asignatura_id") long asignatura_id);

    @Query(nativeQuery = true, value = "select * from t_asignatura where t_asignatura.asignatura_nombre = ?")
    AsignaturaEntity findAsignaturaByName(@Param("asignatura_nombre") String asignatura_nombre);

}
