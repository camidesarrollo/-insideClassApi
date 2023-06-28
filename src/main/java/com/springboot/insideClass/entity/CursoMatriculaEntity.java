package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_CURSO_Matricula", uniqueConstraints = {@UniqueConstraint(columnNames =  "curso_matricula_id")})
public class CursoMatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long curso_matricula_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_id", nullable = false)
    CursoEstablecimientoEntity curso_establ_id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_establ_matricula_id", nullable = false)
    MatriculaEntity matriculaEntity;

    public CursoMatriculaEntity(CursoEstablecimientoEntity curso_establ_id, MatriculaEntity matriculaEntity) {
        this.curso_establ_id = curso_establ_id;
        this.matriculaEntity = matriculaEntity;
    }

    public Long getCurso_matricula_id() {
        return curso_matricula_id;
    }

    public void setCurso_matricula_id(Long curso_matricula_id) {
        this.curso_matricula_id = curso_matricula_id;
    }

    public CursoEstablecimientoEntity getCurso_establ_id() {
        return curso_establ_id;
    }

    public void setCurso_establ_id(CursoEstablecimientoEntity curso_establ_id) {
        this.curso_establ_id = curso_establ_id;
    }

    public MatriculaEntity getMatriculaEntity() {
        return matriculaEntity;
    }

    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }
}
