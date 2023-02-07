package com.springboot.insideClass.payload.request;

import java.util.Date;
import java.util.List;

public class DocenteAsignaturaRequest {

    List<Long> asignatura_doc_asignatura_id;

    long curso_id;

    long establecimiento_id;

    Date fecha_inicio;

    Date fecha_fin;


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


    public List<Long> getAsignatura_doc_asignatura_id() {
        return asignatura_doc_asignatura_id;
    }

    public void setAsignatura_doc_asignatura_id(List<Long> asignatura_doc_asignatura_id) {
        this.asignatura_doc_asignatura_id = asignatura_doc_asignatura_id;
    }
}
