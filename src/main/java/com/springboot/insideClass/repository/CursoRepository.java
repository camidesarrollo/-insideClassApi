package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
    @Query(nativeQuery = true, value = "select * from t_curso c where c.curso_nombre = ? ")
    CursoEntity findCursoByName(@Param("nombre_curso") String nombre_curso);

}


