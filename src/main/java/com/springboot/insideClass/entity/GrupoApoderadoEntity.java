package com.springboot.insideClass.entity;

import org.springframework.web.socket.WebSocketSession;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class GrupoApoderadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private int año;

    @Transient
    private Set<WebSocketSession> webSocketSessions = new HashSet<>();

    // Constructor, getters y setters

    public void agregarWebSocketSession(WebSocketSession session) {
        webSocketSessions.add(session);
    }

    public void eliminarWebSocketSession(WebSocketSession session) {
        webSocketSessions.remove(session);
    }

    public Set<WebSocketSession> getWebSocketSessions() {
        return webSocketSessions;
    }

}
