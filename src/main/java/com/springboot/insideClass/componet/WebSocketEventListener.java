package com.springboot.insideClass.componet;

import com.springboot.insideClass.service.WebSocketEventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class WebSocketEventListener {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketEventListener.class);

    private final WebSocketEventService webSocketEventService;

    @Autowired
    public WebSocketEventListener(WebSocketEventService webSocketEventService) {
        this.webSocketEventService = webSocketEventService;
    }

    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
        webSocketEventService.handleWebSocketConnectEvent(event);
    }

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        webSocketEventService.handleWebSocketDisconnectEvent(event);
    }


}
