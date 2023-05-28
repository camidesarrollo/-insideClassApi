package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_USUARIO",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "username"),
           @UniqueConstraint(columnNames = "email")
       })
public class UsuarioEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 200)
  private String username;

  @NotBlank
  @Size(max = 200)
  @Email
  private String email;

  @NotBlank
  @Size(max = 200)
  private String password;

  @ManyToOne(optional = false)
  @JoinColumn(name = "usuario_perfil_id", nullable = false)
  PerfilEntity perfilEntity;

  @ManyToOne(optional = false)
  @JoinColumn(name = "usuario_vigencia_id", nullable = false)
  VigenciaEntity vigenciaEntity;

  @ManyToOne(optional = false)
  @JoinColumn(name = "usuario_persona_run", nullable = false)
  PersonaEntity personaEntity;

  public UsuarioEntity() {
  }

  public UsuarioEntity(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PerfilEntity getPerfilEntity() {
    return perfilEntity;
  }

  public void setPerfilEntity(PerfilEntity perfilEntity) {
    this.perfilEntity = perfilEntity;
  }

  public VigenciaEntity getVigenciaEntity() {
    return vigenciaEntity;
  }

  public void setVigenciaEntity(VigenciaEntity vigenciaEntity) {
    this.vigenciaEntity = vigenciaEntity;
  }

  public PersonaEntity getPersonaEntity() {
    return personaEntity;
  }

  public void setPersonaEntity(PersonaEntity personaEntity) {
    this.personaEntity = personaEntity;
  }

}
