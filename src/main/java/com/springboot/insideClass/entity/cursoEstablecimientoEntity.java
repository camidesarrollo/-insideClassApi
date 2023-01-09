package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CURSO_ESTABL", uniqueConstraints = {@UniqueConstraint(columnNames =  "curso_establ_id")})
public class cursoEstablecimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer curso_establ_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_curso_id", nullable = false)
    cursoEntity cursoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_establ_id", nullable = false)
    establecimientoEntity establecimientoEntity;

    public cursoEstablecimientoEntity() {
    }

    public cursoEstablecimientoEntity(com.springboot.insideClass.entity.cursoEntity cursoEntity, com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.cursoEntity = cursoEntity;
        this.establecimientoEntity = establecimientoEntity;
    }

    public Integer getCurso_establ_id() {
        return curso_establ_id;
    }

    public void setCurso_establ_id(Integer curso_establ_id) {
        this.curso_establ_id = curso_establ_id;
    }


    public void setCursoEntity(com.springboot.insideClass.entity.cursoEntity cursoEntity) {
        this.cursoEntity = cursoEntity;
    }


    public void setEstablecimientoEntity(com.springboot.insideClass.entity.establecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }
}
