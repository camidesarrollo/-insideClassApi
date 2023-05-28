package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MensajeEntity;
import com.springboot.insideClass.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;


    public MensajeEntity guardarMensaje(MensajeEntity mensaje) {
        return mensajeRepository.save(mensaje);
    }

    public void eliminarMensaje(Long mensajeId) {
        mensajeRepository.deleteById(mensajeId);
    }

    public MensajeEntity editarMensaje(MensajeEntity mensaje) {
        return mensajeRepository.save(mensaje);
    }
}
