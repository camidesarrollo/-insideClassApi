package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_PERFIL", uniqueConstraints = {@UniqueConstraint(columnNames =  "perfil_id")})
public class perfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer perfil_id;

    @NotBlank
    @Size(max = 20)
    String perfil_nombre;

    public perfilEntity() {

    }

    public perfilEntity(String perfil_nombre) {
        this.perfil_nombre = perfil_nombre;
    }

    public Integer getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(Integer perfil_id) {
        this.perfil_id = perfil_id;
    }

    public String getPerfil_nombre() {
        return perfil_nombre;
    }

    public void setPerfil_nombre(String perfil_nombre) {
        this.perfil_nombre = perfil_nombre;
    }
}
