package com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento;

import java.util.Date;

public class EliminarDocenteAsignaturaCursoEstablecimientoRequest {

    String run_docente;

    Long establecimiento_id;

    Long curso_id;

    Long asignatura_id;

    Date fecha_inicio;

    Date fecha_fin;

    public String getRun_docente() {
        return run_docente;
    }

    public void setRun_docente(String run_docente) {
        this.run_docente = run_docente;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
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
}
