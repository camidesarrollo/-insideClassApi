package com.springboot.insideClass.payload.request.Matricula;

import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequest;

public class EditarMatriculaRequest {

    private CrearPersonaRequest alumno;

    private CrearPersonaRequest apoderado;

    private long establecimiento;

    private long curso;

    private Integer agno;

    public CrearPersonaRequest getAlumno() {
        return alumno;
    }

    public void setAlumno(CrearPersonaRequest alumno) {
        this.alumno = alumno;
    }

    public CrearPersonaRequest getApoderado() {
        return apoderado;
    }

    public void setApoderado(CrearPersonaRequest apoderado) {
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
