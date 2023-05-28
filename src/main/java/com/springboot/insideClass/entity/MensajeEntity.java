package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_MENSAJE")
public class MensajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contenido")
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private ChatEntity chat;

    @ManyToOne
    @JoinColumn(name = "emisor_id")
    private UsuarioChatEntity emisor;

    @ManyToOne
    @JoinColumn(name = "receptor_id")
    private UsuarioChatEntity receptor;

    @ManyToOne
    @JoinColumn(name = "grupo_chat_id")
    private GrupoChatEntity grupoChat;

    // Otros atributos y propiedades

    // Constructor, getters y setters

    // Otros métodos y propiedades


    public MensajeEntity(String contenido) {
        this.contenido = contenido;
    }

    public MensajeEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ChatEntity getChat() {
        return chat;
    }

    public void setChat(ChatEntity chat) {
        this.chat = chat;
    }

    public UsuarioChatEntity getEmisor() {
        return emisor;
    }

    public void setEmisor(UsuarioChatEntity emisor) {
        this.emisor = emisor;
    }

    public UsuarioChatEntity getReceptor() {
        return receptor;
    }

    public void setReceptor(UsuarioChatEntity receptor) {
        this.receptor = receptor;
    }

    public GrupoChatEntity getGrupoChat() {
        return grupoChat;
    }

    public void setGrupoChat(GrupoChatEntity grupoChat) {
        this.grupoChat = grupoChat;
    }
}

