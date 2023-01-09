package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_VIGENCIA", uniqueConstraints = {@UniqueConstraint(columnNames =  "vigencia_id")})
public class vigenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer vigencia_id;

    @NotBlank
    @Size(max = 20)
    String vigencia_nombre;

    public vigenciaEntity() {
    }

    public vigenciaEntity(String vigencia_nombre) {
        this.vigencia_nombre = vigencia_nombre;
    }

    public Integer getVigencia_id() {
        return vigencia_id;
    }

    public void setVigencia_id(Integer vigencia_id) {
        this.vigencia_id = vigencia_id;
    }

    public String getVigencia_nombre() {
        return vigencia_nombre;
    }

    public void setVigencia_nombre(String vigencia_nombre) {
        this.vigencia_nombre = vigencia_nombre;
    }
}
