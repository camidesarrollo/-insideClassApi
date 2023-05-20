package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MensajeEntity;
import com.springboot.insideClass.entity.UsuarioEntity;
import com.springboot.insideClass.repository.MensajeRepository;
import com.springboot.insideClass.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final UsuarioRepository usuarioRepository;
    private final MensajeRepository mensajeRepository;

    @Autowired
    public ChatService(UsuarioRepository usuarioRepository, MensajeRepository mensajeRepository) {
        this.usuarioRepository = usuarioRepository;
        this.mensajeRepository = mensajeRepository;
    }

    public void obtenerMensajesPorUsuarios(Long remitenteId, Long destinatarioId) {
        // Implementa la lógica para obtener los mensajes entre dos usuarios
        // utilizando el remitenteId y el destinatarioId
        // Puedes utilizar el método del repositorio correspondiente
        /*return mensajeRepository.findByRemitenteIdAndDestinatarioId(remitenteId, destinatarioId);*/

    }

    public void enviarMensaje(Long remitenteId, Long destinatarioId, String contenido) {
        // Implementa la lógica para enviar un mensaje
        // Crea las instancias de Usuario remitente y Usuario destinatario
        // según los remitenteId y destinatarioId proporcionados
        // Crea una nueva instancia de Mensaje con el contenido y las referencias
        // al remitente y destinatario correspondientes
        // Guarda el mensaje utilizando el repositorio correspondiente
        // Puedes agregar más validaciones o lógica según tus necesidades
        UsuarioEntity remitente = usuarioRepository.findById(remitenteId)
                .orElseThrow(() -> new RuntimeException("No se encontró el remitente con el ID proporcionado"));
        UsuarioEntity destinatario = usuarioRepository.findById(destinatarioId)
                .orElseThrow(() -> new RuntimeException("No se encontró el destinatario con el ID proporcionado"));

        MensajeEntity mensaje = new MensajeEntity();
        mensaje.setContenido(contenido);
        /*mensaje.setRemitente(remitente);
        mensaje.setDestinatario(destinatario);*/

        mensajeRepository.save(mensaje);
    }
}