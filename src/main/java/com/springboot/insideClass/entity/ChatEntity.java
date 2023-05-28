package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chat")
public class ChatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "chat_usuario",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )
    private Set<UsuarioChatEntity> usuarios = new HashSet<>();

    @OneToMany
    @JoinColumn(name = "chat_id")  // Changed from mappedBy = "chat"
    private Set<MensajeEntity> mensajes = new HashSet<>();


    public ChatEntity() {
    }

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

    public void agregarMensaje(MensajeEntity mensaje) {
        mensajes.add(mensaje);
        mensaje.setChat(this);
    }

    public void eliminarMensaje(MensajeEntity mensaje) {
        mensajes.remove(mensaje);
        mensaje.setChat(null);
    }

}
