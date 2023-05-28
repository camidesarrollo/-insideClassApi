package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.GrupoChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoChatRepository extends JpaRepository<GrupoChatEntity, Long> {
}
