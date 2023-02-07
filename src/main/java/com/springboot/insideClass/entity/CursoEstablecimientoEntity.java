package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CURSO_ESTABL", uniqueConstraints = {@UniqueConstraint(columnNames =  "curso_establ_id")})
public class CursoEstablecimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long curso_establ_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_curso_id", nullable = false)
    CursoEntity cursoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_establ_id", nullable = false)
    EstablecimientoEntity establecimientoEntity;

    public CursoEstablecimientoEntity() {
    }

    public CursoEstablecimientoEntity(CursoEntity cursoEntity, EstablecimientoEntity establecimientoEntity) {
        this.cursoEntity = cursoEntity;
        this.establecimientoEntity = establecimientoEntity;
    }

    public Long getCurso_establ_id() {
        return curso_establ_id;
    }

    public void setCurso_establ_id(Long curso_establ_id) {
        this.curso_establ_id = curso_establ_id;
    }


    public void setCursoEntity(CursoEntity cursoEntity) {
        this.cursoEntity = cursoEntity;
    }


    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
