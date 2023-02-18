package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ConversationEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.repository.ConversationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConversationService {
    private final ConversationRepository conversationRepository;

    public ConversationService(ConversationRepository conversationRepository) {
        this.conversationRepository = conversationRepository;
    }

    public ConversationEntity createConversation(ConversationEntity conversation) {
        return conversationRepository.save(conversation);
    }

    public List<ConversationEntity> getConversationsForUser(UsuarioEntity user) {
        return conversationRepository.findByUsersContaining(user);
    }

    public void addUserToConversation(UsuarioEntity user, ConversationEntity conversation) {
        conversation.getUsers().add(user);
        conversationRepository.save(conversation);
    }

    public Optional<ConversationEntity> getConversationById(Long id) {
        return conversationRepository.findById(id);
    }
}
