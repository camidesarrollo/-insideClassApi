package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ChatEntity;
import com.springboot.insideClass.entity.MensajeEntity;
import com.springboot.insideClass.entity.UsuarioChatEntity;
import com.springboot.insideClass.repository.ChatRepository;
import com.springboot.insideClass.repository.MensajeRepository;
import com.springboot.insideClass.repository.UsuarioChatReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import javax.transaction.Transactional;

@Service
public class ChatService {
    private final ChatRepository chatRepository;
    private final MensajeRepository mensajeRepository;

    private final UsuarioChatReporsitory usuarioChatReporsitory;

    @Autowired
    public ChatService(ChatRepository chatRepository, MensajeRepository mensajeRepository, UsuarioChatReporsitory usuarioChatReporsitory) {
        this.chatRepository = chatRepository;
        this.mensajeRepository = mensajeRepository;
        this.usuarioChatReporsitory = usuarioChatReporsitory;
    }

    @Transactional
    public void enviarMensaje(Long chatId, String mensaje) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            UsuarioDetailsImpl userDetails = (UsuarioDetailsImpl) authentication.getPrincipal();
            Long senderId = userDetails.getId(); // Obtener el ID del usuario autenticado

            ChatEntity chat = chatRepository.findById(chatId).orElse(null);
            if (chat == null) {
                // El chat no existe, crearlo
                chat = new ChatEntity();
                chat.setId(chatId);
                chatRepository.save(chat);
            }

            UsuarioChatEntity usuarioChat = usuarioChatReporsitory.findById(senderId).orElse(null);
            if (usuarioChat != null) {
                MensajeEntity mensajeEntity = new MensajeEntity(mensaje);
                chat.getMensajes().add(mensajeEntity);
                mensajeEntity.setChat(chat);
                mensajeEntity.setEmisor(usuarioChat);
                mensajeRepository.save(mensajeEntity);
                chatRepository.save(chat);
            } else {
                // Manejo de caso cuando no se encuentra el usuario
                throw new NotFoundException("No se encontró el usuario");
            }
        } else {
            // Manejo de caso cuando no hay usuario autenticado
            throw new NotFoundException("Usuario no autenticado");
        }
    }


}