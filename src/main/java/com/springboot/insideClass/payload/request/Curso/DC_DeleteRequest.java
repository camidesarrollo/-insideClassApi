package com.springboot.insideClass.payload.request.Curso;

public class DC_DeleteRequest {
    String curso_nombre;
    String  asignatura_nombre;
    String  establ_id;
    String persona_run;

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public String getAsignatura_nombre() {
        return asignatura_nombre;
    }

    public void setAsignatura_nombre(String asignatura_nombre) {
        this.asignatura_nombre = asignatura_nombre;
    }

    public String getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(String establ_id) {
        this.establ_id = establ_id;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }
}
