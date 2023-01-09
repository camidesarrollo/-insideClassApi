package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ASIGNATURA_NOTA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_nota_id")})
public class asignaturaNotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer asignatura_nota_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asignatura_nota_matricula_id", nullable = false)
    matriculaEntity matriculaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " asignatura_nota_asignatura_doc_id", nullable = false)
    asignaturaDocenteEntity asignaturaDocenteEntity;

    @NotBlank
    @Size(max = 20)
    String asignatura_nota_nota;

    public asignaturaNotaEntity() {
    }

    public asignaturaNotaEntity(com.springboot.insideClass.entity.matriculaEntity matriculaEntity, com.springboot.insideClass.entity.asignaturaDocenteEntity asignaturaDocenteEntity, String asignatura_nota_nota) {
        this.matriculaEntity = matriculaEntity;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
        this.asignatura_nota_nota = asignatura_nota_nota;
    }

    public Integer getAsignatura_nota_id() {
        return asignatura_nota_id;
    }

    public void setAsignatura_nota_id(Integer asignatura_nota_id) {
        this.asignatura_nota_id = asignatura_nota_id;
    }


    public void setMatriculaEntity(com.springboot.insideClass.entity.matriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public void setAsignaturaDocenteEntity(com.springboot.insideClass.entity.asignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public String getAsignatura_nota_nota() {
        return asignatura_nota_nota;
    }

    public void setAsignatura_nota_nota(String asignatura_nota_nota) {
        this.asignatura_nota_nota = asignatura_nota_nota;
    }
}
