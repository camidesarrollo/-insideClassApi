package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_ASIG_NOTA_ESTABLCURSO", uniqueConstraints = {@UniqueConstraint(columnNames =  "AsigNotaEstablCurso_ID")})
public class AsigNotaEstablCursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long AsigNotaEstablCurso_ID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asig_nota_establecurso_curso_id", nullable = false) //Curso - establecimiento - matricula
    CursoEstablecimientoEntity cursoEstablecimientoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asig_nota_establecurso_docente_asignatura_id", nullable = false) // docente - asignatura
    AsignaturaDocenteEntity asignaturaDocenteEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "asig_nota_establecurso_asignatura_nota", nullable = false) // la nota
    AsignaturaNotaEntity asignaturaNota;


    public AsigNotaEstablCursoEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity, AsignaturaDocenteEntity asignaturaDocenteEntity, AsignaturaNotaEntity asignaturaNota) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
        this.asignaturaNota = asignaturaNota;
    }

    public Long getAsigNotaEstablCurso_ID() {
        return AsigNotaEstablCurso_ID;
    }

    public void setAsigNotaEstablCurso_ID(Long asigNotaEstablCurso_ID) {
        AsigNotaEstablCurso_ID = asigNotaEstablCurso_ID;
    }

    public CursoEstablecimientoEntity getCursoEstablecimientoEntity() {
        return cursoEstablecimientoEntity;
    }

    public void setCursoEstablecimientoEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public AsignaturaDocenteEntity getAsignaturaDocenteEntity() {
        return asignaturaDocenteEntity;
    }

    public void setAsignaturaDocenteEntity(AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public AsignaturaNotaEntity getAsignaturaNota() {
        return asignaturaNota;
    }

    public void setAsignaturaNota(AsignaturaNotaEntity asignaturaNota) {
        this.asignaturaNota = asignaturaNota;
    }
}
