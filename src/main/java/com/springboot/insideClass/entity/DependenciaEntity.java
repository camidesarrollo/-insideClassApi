package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_DEPENDENCIA", uniqueConstraints = {@UniqueConstraint(columnNames =  "dependencia_id")})
public class DependenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long dependencia_id;

    @NotBlank
    @Size(max = 200)
    String dependencia_nombre;

    public DependenciaEntity() {
    }

    public DependenciaEntity(String dependencia_nombre) {
        this.dependencia_nombre = dependencia_nombre;
    }

    public Long getDependecia_id() {
        return dependencia_id;
    }

    public void setDependecia_id(Long dependecia_id) {
        this.dependencia_id = dependecia_id;
    }

    public String getNombre_dependencia() {
        return dependencia_nombre;
    }

    public void setNombre_dependencia(String nombre_dependencia) {
        this.dependencia_nombre = nombre_dependencia;
    }
}
