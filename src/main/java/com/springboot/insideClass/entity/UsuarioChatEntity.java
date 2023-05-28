package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_USUARIOCHAT")
public class UsuarioChatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "persona_run")
    private String personaRun;

    @Column(name = "perfil_id")
    private String perfilId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_id")
    private Set<ChatEntity> chats = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "grupo_chat_id")
    private GrupoChatEntity grupoChat;


    // Otros atributos del usuario


    // Constructor, getters y setters

    public void addChat(ChatEntity chat) {
        chats.add(chat);
    }

    public void removeChat(ChatEntity chat) {
        chats.remove(chat);
    }

    // Otros métodos y propiedades


    public UsuarioChatEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonaRun() {
        return personaRun;
    }

    public void setPersonaRun(String personaRun) {
        this.personaRun = personaRun;
    }

    public String getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(String perfilId) {
        this.perfilId = perfilId;
    }

    public Set<ChatEntity> getChats() {
        return chats;
    }

    public void setChats(Set<ChatEntity> chats) {
        this.chats = chats;
    }

    public GrupoChatEntity getGrupoChat() {
        return grupoChat;
    }

    public void setGrupoChat(GrupoChatEntity grupoChat) {
        this.grupoChat = grupoChat;
    }
}
