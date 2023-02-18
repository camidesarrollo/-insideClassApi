package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ConversationEntity;
import com.springboot.insideClass.entity.MessageEntity;
import com.springboot.insideClass.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageEntity createMessage(MessageEntity message) {
        return messageRepository.save(message);
    }

    public List<MessageEntity> getMessagesForConversation(ConversationEntity conversation) {
        return messageRepository.findByConversationOrderByTimestampDesc(conversation);
    }
}
