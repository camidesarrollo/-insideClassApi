package com.springboot.insideClass.payload.request.Asignatura;

public class BuscarAsignaturaCursoDocenteEstablecimientoRequest {

    Long asignatura_id;
    String asignatura_nombre;
    Long curso_id;
    String curso_nombre;
    Long docente_id;
    String docente_persona_run;
    Long curso_establecimiento_establecimiento_id;

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public Long getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Long docente_id) {
        this.docente_id = docente_id;
    }

    public String getDocente_persona_run() {
        return docente_persona_run;
    }

    public void setDocente_persona_run(String docente_persona_run) {
        this.docente_persona_run = docente_persona_run;
    }

    public Long getCurso_establecimiento_establecimiento_id() {
        return curso_establecimiento_establecimiento_id;
    }

    public void setCurso_establecimiento_establecimiento_id(Long curso_establecimiento_establecimiento_id) {
        this.curso_establecimiento_establecimiento_id = curso_establecimiento_establecimiento_id;
    }
}
