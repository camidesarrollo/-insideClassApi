package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_TIPO_AREA", uniqueConstraints = {@UniqueConstraint(columnNames =  "tipo_area_id")})
public class tipoAreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer tipo_area_id;

    @NotBlank
    @Size(max = 100)
    String tipo_area_nombre;

    public tipoAreaEntity() {
    }

    public tipoAreaEntity(String tipo_area_nombre) {
        this.tipo_area_nombre = tipo_area_nombre;
    }

    public Integer getTipo_area_id() {
        return tipo_area_id;
    }

    public void setTipo_area_id(Integer tipo_area_id) {
        this.tipo_area_id = tipo_area_id;
    }

    public String getTipo_area_nombre() {
        return tipo_area_nombre;
    }

    public void setTipo_area_nombre(String tipo_area_nombre) {
        this.tipo_area_nombre = tipo_area_nombre;
    }
}
