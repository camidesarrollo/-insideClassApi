package com.springboot.insideClass.entity;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "T_USUARIO", uniqueConstraints = {@UniqueConstraint(columnNames =  "usuario_id")})
public class usuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer usuario_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_persona_rut", nullable = false)
    private personaEntity personaEntity;

    @NotBlank
    @Size(max = 20)
    String usuario_nickName;

    @NotBlank
    @Size(max = 20)
    String usuario_password;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_vigencia_id", nullable = false)
    vigenciaEntity vigenciaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "usuario_perfil_id", nullable = false)
    perfilEntity perfilEntity;
    
    public usuarioEntity() {
    }

    public usuarioEntity(com.springboot.insideClass.entity.personaEntity personaEntity,String usuario_nickName, String usuario_password, com.springboot.insideClass.entity.vigenciaEntity vigenciaEntity, com.springboot.insideClass.entity.perfilEntity perfilEntity) {
        this.personaEntity = personaEntity;
        this.usuario_nickName = usuario_nickName;
        this.usuario_password = usuario_password;
        this.vigenciaEntity = vigenciaEntity;
        this.perfilEntity = perfilEntity;
    }


    public void setPerfilEntity(com.springboot.insideClass.entity.perfilEntity perfilEntity) {
        this.perfilEntity = perfilEntity;
    }

    public String getUsuario_nickName() {
        return usuario_nickName;
    }

    public void setUsuario_nickName(String usuario_nickName) {
        this.usuario_nickName = usuario_nickName;
    }

    public String getUsuario_password() {
        return usuario_password;
    }

    public void setUsuario_password(String usuario_password) {
        this.usuario_password = usuario_password;
    }

    public void setPersona(personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setVigenciaEntity(com.springboot.insideClass.entity.vigenciaEntity vigenciaEntity) {
        this.vigenciaEntity = vigenciaEntity;
    }

    public void setPersonaEntity(com.springboot.insideClass.entity.personaEntity personaEntity) {
        this.personaEntity = personaEntity;
    }
}
