package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_DEPEND", uniqueConstraints = {@UniqueConstraint(columnNames =  "depend_id")})
public class DependenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long depend_id;

    @NotBlank
    @Size(max = 200)
    String depend_nombre;

    public DependenciaEntity() {
    }

    public DependenciaEntity(String depend_nombre) {
        this.depend_nombre = depend_nombre;
    }

    public Long getDependecia_id() {
        return depend_id;
    }

    public void setDependecia_id(Long dependecia_id) {
        this.depend_id = dependecia_id;
    }

    public String getNombre_dependencia() {
        return depend_nombre;
    }

    public void setNombre_dependencia(String nombre_dependencia) {
        this.depend_nombre = nombre_dependencia;
    }
}
