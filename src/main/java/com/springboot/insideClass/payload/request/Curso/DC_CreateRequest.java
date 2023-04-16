package com.springboot.insideClass.payload.request.Curso;

import java.sql.Date;

public class DC_CreateRequest {
    String persona_run;
    long curso_id;
    Date fecha_inicio;
    Date fecha_fin;
    long asignatura_id;
    boolean docente_jefe;

    long establecimiento_id;

    public long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(long curso_id) {
        this.curso_id = curso_id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public boolean isDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
}
