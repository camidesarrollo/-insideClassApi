package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.UsuarioChatEntity;
import com.springboot.insideClass.repository.UsuarioChatReporsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioChatService {
    @Autowired
    private UsuarioChatReporsitory usuarioChatRepository;

    public UsuarioChatEntity crearUsuarioChat(UsuarioChatEntity usuarioChat) {
        return usuarioChatRepository.save(usuarioChat);
    }

    public void eliminarUsuarioChat(Long usuarioChatId) {
        usuarioChatRepository.deleteById(usuarioChatId);
    }

    public UsuarioChatEntity editarUsuarioChat(UsuarioChatEntity usuarioChat) {
        return usuarioChatRepository.save(usuarioChat);
    }
}