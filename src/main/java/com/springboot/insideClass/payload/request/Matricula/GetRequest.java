package com.springboot.insideClass.payload.request.Matricula;

public class GetRequest {
   Long establecimiento;
    String persona_run;
    Integer curso_id;

    Integer vigencia;

    public Long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getPersona_run() {
        return persona_run;
    }

    public void setPersona_run(String persona_run) {
        this.persona_run = persona_run;
    }

    public Integer getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Integer curso_id) {
        this.curso_id = curso_id;
    }

    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    public boolean isValid() {
        return establecimiento != null && persona_run != null && curso_id != null && vigencia != null
                && !persona_run.isEmpty();
    }
}
