package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DestinatarioEntity;
import com.springboot.insideClass.repository.DestinatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DestinatarioService {

    @Autowired
    private DestinatarioRepository destinatarioRepository;

    public DestinatarioEntity saveDestinatario(DestinatarioEntity destinatario) {
        return destinatarioRepository.save(destinatario);
    }

    public List<DestinatarioEntity> getAllDestinatarios() {
        return destinatarioRepository.findAll();
    }

    public Optional<DestinatarioEntity> getDestinatarioById(Long id) {
        return destinatarioRepository.findById(id);
    }

    public void deleteDestinatarioById(Long id) {
        destinatarioRepository.deleteById(id);
    }

}
