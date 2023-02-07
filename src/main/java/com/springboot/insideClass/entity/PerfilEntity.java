package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_PERFIL", uniqueConstraints = {@UniqueConstraint(columnNames =  "perfil_id")})
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long perfil_id;

    @NotBlank
    @Size(max = 200)
    String perfil_nombre;

    public PerfilEntity() {

    }

    public PerfilEntity(String perfil_nombre) {
        this.perfil_nombre = perfil_nombre;
    }

    public Long getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(Long perfil_id) {
        this.perfil_id = perfil_id;
    }

    public String getPerfil_nombre() {
        return perfil_nombre;
    }

    public void setPerfil_nombre(String perfil_nombre) {
        this.perfil_nombre = perfil_nombre;
    }
}
