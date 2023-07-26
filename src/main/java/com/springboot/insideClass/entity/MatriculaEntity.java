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
    AlumnoEntity alumno;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_apoderado_id", nullable = false)
    ApoderadoEntity apoderado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "matricula_curso_establecimiento_id", nullable = false)
    CursoEstablecimientoEntity cursoEstablecimiento;

    Integer curso_agno;
    
    boolean  matricula_vigencia;

    public MatriculaEntity() {
    }

    public MatriculaEntity(AlumnoEntity alumno, ApoderadoEntity apoderado, CursoEstablecimientoEntity cursoEstablecimiento, Integer curso_agno, boolean matricula_vigencia) {
        this.alumno = alumno;
        this.apoderado = apoderado;
        this.cursoEstablecimiento = cursoEstablecimiento;
        this.curso_agno = curso_agno;
        this.matricula_vigencia = matricula_vigencia;
    }

    public Long getMatricula_id() {
        return matricula_id;
    }

    public void setMatricula_id(Long matricula_id) {
        this.matricula_id = matricula_id;
    }

    public AlumnoEntity getAlumno() {
        return alumno;
    }

    public void setAlumno(AlumnoEntity alumno) {
        this.alumno = alumno;
    }

    public ApoderadoEntity getApoderado() {
        return apoderado;
    }

    public void setApoderado(ApoderadoEntity apoderado) {
        this.apoderado = apoderado;
    }

    public CursoEstablecimientoEntity getCursoEstablecimiento() {
        return cursoEstablecimiento;
    }

    public void setCursoEstablecimiento(CursoEstablecimientoEntity cursoEstablecimiento) {
        this.cursoEstablecimiento = cursoEstablecimiento;
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
