package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.GrupoChatEntity;
import com.springboot.insideClass.repository.GrupoChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoChatService {
    @Autowired
    private GrupoChatRepository grupoChatRepository;

    public GrupoChatEntity crearGrupoChat(GrupoChatEntity grupoChat) {
        return grupoChatRepository.save(grupoChat);
    }

    public void eliminarGrupoChat(Long grupoChatId) {
        grupoChatRepository.deleteById(grupoChatId);
    }

    public GrupoChatEntity editarGrupoChat(GrupoChatEntity grupoChat) {
        return grupoChatRepository.save(grupoChat);
    }
}