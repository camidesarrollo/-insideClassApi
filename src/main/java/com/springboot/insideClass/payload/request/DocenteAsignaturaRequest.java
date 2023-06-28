package com.springboot.insideClass.payload.request;

import java.util.Date;

public class DocenteAsignaturaRequest {


    long curso_id;

    long establecimiento_id;
    long docente_asignatura;
    String docente_run;

    Date fecha_inicio;

    Date fecha_fin;

    Boolean docente_jefe;

    String curso_establ_hora_inicio;

    String curso_establ_hora_fin;

    String dia;


    public long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(long curso_id) {
        this.curso_id = curso_id;
    }

    public long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public long getDocente_asignatura() {
        return docente_asignatura;
    }

    public void setDocente_asignatura(long docente_asignatura) {
        this.docente_asignatura = docente_asignatura;
    }

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
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

    public Boolean getDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(Boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }

    public String getCurso_establ_hora_inicio() {
        return curso_establ_hora_inicio;
    }

    public void setCurso_establ_hora_inicio(String curso_establ_hora_inicio) {
        this.curso_establ_hora_inicio = curso_establ_hora_inicio;
    }

    public String getCurso_establ_hora_fin() {
        return curso_establ_hora_fin;
    }

    public void setCurso_establ_hora_fin(String curso_establ_hora_fin) {
        this.curso_establ_hora_fin = curso_establ_hora_fin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
