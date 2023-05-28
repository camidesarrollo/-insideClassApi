package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_MATRICULA", uniqueConstraints = {@UniqueConstraint(columnNames =  "matricula_id")})
public class MatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long matricula_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_alumno_id", nullable = false)
    AlumnoEntity alumnoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_apoderado_id", nullable = false)
    ApoderadoEntity apoderadoEntity;


    Integer curso_agno;
    
    boolean  matricula_vigencia;

    public MatriculaEntity() {
    }


    public MatriculaEntity(AlumnoEntity alumnoEntity, ApoderadoEntity apoderadoEntity, Integer curso_agno, boolean matricula_vigencia) {
        this.alumnoEntity = alumnoEntity;
        this.apoderadoEntity = apoderadoEntity;
        this.curso_agno = curso_agno;
        this.matricula_vigencia = matricula_vigencia;
    }

    public Long getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(Long matricula_id) {
        this.matricula_id = matricula_id;
    }

    public AlumnoEntity getAlumnoEntity() {
        return alumnoEntity;
    }

    public void setAlumnoEntity(AlumnoEntity alumnoEntity) {
        this.alumnoEntity = alumnoEntity;
    }

    public ApoderadoEntity getApoderadoEntity() {
        return apoderadoEntity;
    }

    public void setApoderadoEntity(ApoderadoEntity apoderadoEntity) {
        this.apoderadoEntity = apoderadoEntity;
    }


    public Integer getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(Integer curso_agno) {
        this.curso_agno = curso_agno;
    }

    public boolean isMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }


}
