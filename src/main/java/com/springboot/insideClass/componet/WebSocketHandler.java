package com.springboot.insideClass.componet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class WebSocketHandler extends TextWebSocketHandler {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketHandler(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void enviarMensaje(String destinatarioId, String contenido) {
        messagingTemplate.convertAndSendToUser(
                destinatarioId.toString(), // Convertir el ID a String y usarlo como destinatario
                "/queue/messages",
                contenido
        );
    }
}
