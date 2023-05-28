package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.UsuarioChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioChatReporsitory extends JpaRepository<UsuarioChatEntity, Long> {
}
