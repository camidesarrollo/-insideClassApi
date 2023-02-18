package com.springboot.insideClass.entity;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "conversations")
public class ConversationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

 /*   @ManyToMany(mappedBy = "conversations")
    private List<User> users;
*/
 @ManyToMany()
 private List<UsuarioEntity> users;

 @OneToMany(mappedBy = "conversation", cascade = CascadeType.ALL, orphanRemoval = true)

 private List<MessageEntity> messages = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UsuarioEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsuarioEntity> users) {
        this.users = users;
    }

    public List<MessageEntity> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageEntity> messages) {
        this.messages = messages;
    }

    public ConversationEntity() {
    }

    public ConversationEntity(String name, List<UsuarioEntity> users, List<MessageEntity> messages) {
        this.name = name;
        this.users = users;
        this.messages = messages;
    }
// getters and setters
}
