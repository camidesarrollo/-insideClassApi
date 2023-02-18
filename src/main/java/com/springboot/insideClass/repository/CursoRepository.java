package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Long> {
}
