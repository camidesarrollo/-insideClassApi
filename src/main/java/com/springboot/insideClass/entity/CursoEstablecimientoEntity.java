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

    Boolean vigencia;

    public CursoEstablecimientoEntity() {
    }

    public CursoEstablecimientoEntity(Long curso_establ_id, CursoEntity cursoEntity, EstablecimientoEntity establecimientoEntity, Boolean vigencia) {
        this.curso_establ_id = curso_establ_id;
        this.cursoEntity = cursoEntity;
        this.establecimientoEntity = establecimientoEntity;
        this.vigencia = vigencia;
    }

    public Long getCurso_establ_id() {
        return curso_establ_id;
    }

    public void setCurso_establ_id(Long curso_establ_id) {
        this.curso_establ_id = curso_establ_id;
    }

    public CursoEntity getCursoEntity() {
        return cursoEntity;
    }

    public void setCursoEntity(CursoEntity cursoEntity) {
        this.cursoEntity = cursoEntity;
    }

    public EstablecimientoEntity getEstablecimientoEntity() {
        return establecimientoEntity;
    }

    public void setEstablecimientoEntity(EstablecimientoEntity establecimientoEntity) {
        this.establecimientoEntity = establecimientoEntity;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }
}
