package com.springboot.insideClass.payload.request.Matricula;

public class GetAlumnoRequest {

    Integer establecimiento;
    String persona_run;
    String curso_nombre;

    Integer agno;

    public Integer getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Integer establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public String getCurso_nombre() {
        return curso_nombre;
    }

    public void setCurso_nombre(String curso_nombre) {
        this.curso_nombre = curso_nombre;
    }

    public Integer getAgno() {
        return agno;
    }

    public void setAgno(Integer agno) {
        this.agno = agno;
    }

    public boolean isValid() {
        return establecimiento != null && persona_run != null && curso_nombre != null && agno != null
                && !persona_run.isEmpty() && !curso_nombre.isEmpty();
    }
}
