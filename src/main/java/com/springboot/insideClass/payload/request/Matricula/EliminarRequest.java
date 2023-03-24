package com.springboot.insideClass.payload.request.Matricula;

public class EliminarRequest {
    String curso_agno;

    String curso_nombre;
    Integer establecimiento_id;
    String rut_alumno;

    public String getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(String curso_agno) {
        this.curso_agno = curso_agno;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public Integer getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Integer establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getRut_alumno() {
        return rut_alumno;
    }

    public void setRut_alumno(String rut_alumno) {
        this.rut_alumno = rut_alumno;
    }
}