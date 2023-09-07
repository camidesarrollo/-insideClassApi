package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.DestinatarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinatarioRepository extends JpaRepository<DestinatarioEntity, Long> {
}
