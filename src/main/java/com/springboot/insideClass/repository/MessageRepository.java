package com.springboot.insideClass.repository;

import com.springboot.insideClass.entity.ConversationEntity;
import com.springboot.insideClass.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

    List<MessageEntity> findByConversationOrderByTimestampDesc(ConversationEntity conversation);

}