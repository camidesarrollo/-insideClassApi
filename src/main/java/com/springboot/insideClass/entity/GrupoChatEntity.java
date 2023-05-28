package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "grupo_chat")
public class GrupoChatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "grupo_chat_id")  // Changed from mappedBy = "grupoChat"
    private Set<MensajeEntity> mensajes = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "grupo_usuario",
            joinColumns = @JoinColumn(name = "grupo_chat_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private Set<UsuarioChatEntity> usuarios = new HashSet<>();

    // Rest of the code...

    // Constructor, getters and setters

    public void addUsuario(UsuarioChatEntity usuario) {
        usuarios.add(usuario);
        usuario.setGrupoChat(this);
    }

    public void removeUsuario(UsuarioChatEntity usuario) {
        usuarios.remove(usuario);
        usuario.setGrupoChat(null);
    }

    // Other methods and properties

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<UsuarioChatEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<UsuarioChatEntity> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<MensajeEntity> getMensajes() {
        return mensajes;
    }

    public void setMensajes(Set<MensajeEntity> mensajes) {
        this.mensajes = mensajes;
    }
}
