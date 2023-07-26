package com.springboot.insideClass.payload.request.DocenteAsignaturaCursoEstablecimiento;

import java.util.Date;

public class CrearRequest {

    private Long asignatura_id;
    private Long curso_id;
    private Boolean docente_jefe;
    private Long establecimiento_id;
    private Date fecha_fin;
    private Date fecha_inicio;
    private String persona_run;

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public Boolean getDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(Boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }
}
