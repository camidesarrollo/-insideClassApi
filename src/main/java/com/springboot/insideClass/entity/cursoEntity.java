package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_CURSO", uniqueConstraints = {@UniqueConstraint(columnNames =  "curso_id")})
public class cursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer curso_id;

    @NotBlank
    @Size(max = 20)
    String curso_nombre;

    @NotBlank
    @Size(max = 20)
    String curso_nivel;




    public cursoEntity() {
    }

    public cursoEntity(String curso_nombre, String curso_nivel) {
        this.curso_nombre = curso_nombre;
        this.curso_nivel = curso_nivel;
    }

    public Integer getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Integer curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public String getCurso_nivel() {
        return curso_nivel;
    }

    public void setCurso_nivel(String curso_nivel) {
        this.curso_nivel = curso_nivel;
    }
}
