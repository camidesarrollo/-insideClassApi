package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.MensajeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<MensajeEntity, Long> {
    // Métodos de consulta si es necesario
}