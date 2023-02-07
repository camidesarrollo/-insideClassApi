package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.entity.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends JpaRepository<AsistenciaEntity, Long> {
}
