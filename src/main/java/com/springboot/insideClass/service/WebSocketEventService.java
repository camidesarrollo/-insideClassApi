package com.springboot.insideClass.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Service
public class WebSocketEventService {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketEventService.class);

    private final SimpMessageSendingOperations messagingTemplate;

    @Autowired
    public WebSocketEventService(SimpMessageSendingOperations messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void handleWebSocketConnectEvent(SessionConnectedEvent event) {
        logger.info("Nuevo usuario conectado");
    }

    public void handleWebSocketDisconnectEvent(SessionDisconnectEvent event) {
        logger.info("Usuario desconectado");
    }
}