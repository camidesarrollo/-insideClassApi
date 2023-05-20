package com.springboot.insideClass.entity;

import com.springboot.insideClass.repository.GrupoApoderadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

@Controller
public class ChatController {
    @Autowired
    private GrupoApoderadoRepository grupoApoderadoRepository;

    @MessageMapping("/chat/{grupoId}/mensaje")
    public void enviarMensaje(@DestinationVariable Long grupoId, MensajeEntity mensaje) {
        GrupoApoderadoEntity grupo = grupoApoderadoRepository.findById(grupoId)
                .orElseThrow(() -> new IllegalArgumentException("Grupo no encontrado"));

        // Envía el mensaje a todas las sesiones WebSocket del grupo
        for (WebSocketSession session : grupo.getWebSocketSessions()) {
            try {
                session.sendMessage(new TextMessage(mensaje.getContenido()));
            } catch (IOException e) {
                // Manejar excepción en caso de error al enviar el mensaje
                e.printStackTrace();
            }
        }
    }
}
