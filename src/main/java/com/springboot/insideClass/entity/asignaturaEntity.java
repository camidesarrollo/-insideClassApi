package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ASIGNATURA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_id")})
public class asignaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer asignatura_id;

    @NotBlank
    @Size(max = 200)
    String asignatura_nombre;

    public asignaturaEntity() {
    }

    public asignaturaEntity(Integer asignatura_id, String asignatura_nombre) {
        this.asignatura_id = asignatura_id;
        this.asignatura_nombre = asignatura_nombre;
    }

    public Integer getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Integer asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }
}
