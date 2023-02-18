package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ConversationEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConversationRepository extends JpaRepository<ConversationEntity, Long> {

    List<ConversationEntity> findByUsersContaining(UsuarioEntity user);
    Optional<ConversationEntity> findById(Long id);
}