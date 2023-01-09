package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_MATRICULA", uniqueConstraints = {@UniqueConstraint(columnNames =  "matricula_id")})
public class matriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer matricula_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_alumno_id", nullable = false)
    alumnoEntity alumnoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_apoderado_id", nullable = false)
    apoderadoEntity apoderadoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_curso_establ_id", nullable = false)
    cursoEstablecimientoEntity cursoEstablecimientoEntity;

    @NotBlank
    @Size(max = 20)
    String curso_agno;

    public matriculaEntity() {
    }

    public matriculaEntity(com.springboot.insideClass.entity.alumnoEntity alumnoEntity, com.springboot.insideClass.entity.apoderadoEntity apoderadoEntity, com.springboot.insideClass.entity.cursoEstablecimientoEntity cursoEstablecimientoEntity, String curso_agno) {
        this.alumnoEntity = alumnoEntity;
        this.apoderadoEntity = apoderadoEntity;
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
        this.curso_agno = curso_agno;
    }

    public void setMatricula_id(Integer matricula_id) {
        this.matricula_id = matricula_id;
    }

    public void setAlumnoEntity(com.springboot.insideClass.entity.alumnoEntity alumnoEntity) {
        this.alumnoEntity = alumnoEntity;
    }

    public void setApoderadoEntity(com.springboot.insideClass.entity.apoderadoEntity apoderadoEntity) {
        this.apoderadoEntity = apoderadoEntity;
    }

    public void setCursoEstablecimientoEntity(com.springboot.insideClass.entity.cursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public String getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(String curso_agno) {
        this.curso_agno = curso_agno;
    }
}
