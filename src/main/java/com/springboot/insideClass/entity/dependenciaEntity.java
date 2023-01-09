package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_DEPEND", uniqueConstraints = {@UniqueConstraint(columnNames =  "depend_id")})
public class dependenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer depend_id;

    @NotBlank
    @Size(max = 200)
    String depend_nombre;

    public dependenciaEntity() {
    }

    public dependenciaEntity(String depend_nombre) {
        this.depend_nombre = depend_nombre;
    }

    public Integer getDependecia_id() {
        return depend_id;
    }

    public void setDependecia_id(Integer dependecia_id) {
        this.depend_id = dependecia_id;
    }

    public String getNombre_dependencia() {
        return depend_nombre;
    }

    public void setNombre_dependencia(String nombre_dependencia) {
        this.depend_nombre = nombre_dependencia;
    }
}
