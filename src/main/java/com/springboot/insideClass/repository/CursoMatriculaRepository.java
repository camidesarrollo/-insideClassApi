package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoMatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoMatriculaRepository extends JpaRepository<CursoMatriculaEntity, Long> {
}
