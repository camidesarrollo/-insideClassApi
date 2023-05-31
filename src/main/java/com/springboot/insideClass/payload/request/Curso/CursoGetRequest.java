package com.springboot.insideClass.payload.request.Curso;

public class CursoGetRequest {
    public long establecimiento;
    public String persona_run;
    public long curso_id;
    public long perfil_id;

    public long getEstablecimiento() {
        return establecimiento;
    }

    public long getPerfil_id() {
        return perfil_id;
    }

    public void setPerfil_id(long perfil_id) {
        this.perfil_id = perfil_id;
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
