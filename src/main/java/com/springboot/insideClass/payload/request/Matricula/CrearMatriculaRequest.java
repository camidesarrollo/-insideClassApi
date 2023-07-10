package com.springboot.insideClass.payload.request.Matricula;

import com.springboot.insideClass.payload.request.Persona.CrearPersonaRequest;

public class CrearMatriculaRequest {
    private CrearPersonaRequest alumno;

    private CrearPersonaRequest apoderado;

    private long establecimiento;

    private long curso;

    private Integer agno;

    private String correo;

    public CrearMatriculaRequest(CrearPersonaRequest alumno, CrearPersonaRequest apoderado, long establecimiento, long curso, Integer agno, String correo) {
        this.alumno = alumno;
        this.apoderado = apoderado;
        this.establecimiento = establecimiento;
        this.curso = curso;
        this.agno = agno;
        this.correo = correo;
    }

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
