package com.springboot.insideClass.payload.request.Matricula;

import com.springboot.insideClass.payload.request.Persona.PersonaRequest;

public class M_CreateRequest {
    private PersonaRequest alumno;

    private PersonaRequest apoderado;

    private long establecimiento;

    private long curso;

    private Integer agno;

    public PersonaRequest getAlumno() {
        return alumno;
    }

    public void setAlumno(PersonaRequest alumno) {
        this.alumno = alumno;
    }

    public PersonaRequest getApoderado() {
        return apoderado;
    }

    public void setApoderado(PersonaRequest apoderado) {
        this.apoderado = apoderado;
    }

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public long getCurso() {
        return curso;
    }

    public void setCurso(long curso) {
        this.curso = curso;
    }

    public Integer getAgno() {
        return agno;
    }

    public void setAgno(Integer agno) {
        this.agno = agno;
    }
}
