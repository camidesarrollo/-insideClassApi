package com.springboot.insideClass.componet;
import com.springboot.insideClass.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.net.URI;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ChatWebSocketHandler extends TextWebSocketHandler {

    private final Map<Long, Set<WebSocketSession>> groupSessions = new ConcurrentHashMap<>();
    private final ChatService chatService;

    @Autowired
    public ChatWebSocketHandler(ChatService chatService) {
        this.chatService = chatService;
    }

    // Maneja la conexión establecida con el cliente
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        Long groupId = obtenerIdGrupoDesdeUri(session.getUri());
        if (groupId != null) {
            groupSessions.computeIfAbsent(groupId, k -> new HashSet<>()).add(session);
        }
    }

    // Maneja el mensaje recibido del cliente
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Long groupId = obtenerIdGrupoDesdeUri(session.getUri());
        if (groupId != null) {
            chatService.enviarMensaje(groupId, message.getPayload());
        }
    }

    // Maneja la desconexión del cliente
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        Long groupId = obtenerIdGrupoDesdeUri(session.getUri());
        if (groupId != null) {
            Set<WebSocketSession> sessions = groupSessions.get(groupId);
            if (sessions != null) {
                sessions.remove(session);
                if (sessions.isEmpty()) {
                    groupSessions.remove(groupId);
                }
            }
        }
    }

    // Método de utilidad para extraer el ID del grupo de la URI del WebSocket
    private Long obtenerIdGrupoDesdeUri(URI uri) {
        String path = uri.getPath();
        if (path != null) {
            String[] parts = path.split("/");
            if (parts.length >= 3) {
                try {
                    return Long.parseLong(parts[2]);
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return null;
    }

    // Método de utilidad para extraer el ID del usuario de la URI del WebSocket
    private String obtenerIdUsuarioDesdeUri(URI uri) {
        String path = uri.getPath();
        if (path != null) {
            String[] parts = path.split("/");
            if (parts.length >= 4) {
                return parts[3];
            }
        }
        return null;
    }
}
