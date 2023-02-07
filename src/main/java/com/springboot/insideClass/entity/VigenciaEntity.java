package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_VIGENCIA", uniqueConstraints = {@UniqueConstraint(columnNames =  "vigencia_id")})
public class VigenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long vigencia_id;

    @NotBlank
    @Size(max = 200)
    String vigencia_nombre;

    public VigenciaEntity() {
    }

    public VigenciaEntity(String vigencia_nombre) {
        this.vigencia_nombre = vigencia_nombre;
    }

    public Long getVigencia_id() {
        return vigencia_id;
    }

    public void setVigencia_id(Long vigencia_id) {
        this.vigencia_id = vigencia_id;
    }

    public String getVigencia_nombre() {
        return vigencia_nombre;
    }

    public void setVigencia_nombre(String vigencia_nombre) {
        this.vigencia_nombre = vigencia_nombre;
    }
}
