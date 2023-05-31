package com.springboot.insideClass.payload.request.Asignatura;

public class AsignaturaRequest {

    public long establecimiento;
    public String persona_run;
    public long curso_id;

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(long curso_id) {
        this.curso_id = curso_id;
    }
}
