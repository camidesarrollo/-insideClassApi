package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ASIGNATURA_NOTA", uniqueConstraints = {@UniqueConstraint(columnNames =  "asignatura_nota_id")})
public class AsignaturaNotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long asignatura_nota_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asignatura_nota_matricula_id", nullable = false)
    MatriculaEntity matriculaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = " asignatura_nota_asignatura_doc_id", nullable = false)
    AsignaturaDocenteEntity asignaturaDocenteEntity;

    @NotBlank
    @Size(max = 200)
    String asignatura_nota_nota;

    public AsignaturaNotaEntity() {
    }

    public AsignaturaNotaEntity(MatriculaEntity matriculaEntity, AsignaturaDocenteEntity asignaturaDocenteEntity, String asignatura_nota_nota) {
        this.matriculaEntity = matriculaEntity;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
        this.asignatura_nota_nota = asignatura_nota_nota;
    }

    public Long getAsignatura_nota_id() {
        return asignatura_nota_id;
    }

    public void setAsignatura_nota_id(Long asignatura_nota_id) {
        this.asignatura_nota_id = asignatura_nota_id;
    }


    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }

    public void setAsignaturaDocenteEntity(AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public String getAsignatura_nota_nota() {
        return asignatura_nota_nota;
    }

    public void setAsignatura_nota_nota(String asignatura_nota_nota) {
        this.asignatura_nota_nota = asignatura_nota_nota;
    }
}
