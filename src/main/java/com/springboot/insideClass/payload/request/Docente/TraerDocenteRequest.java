package com.springboot.insideClass.payload.request.Docente;

public class TraerDocenteRequest {
    String docente_run;
    Long curso;
    Long establecimiento;

    Boolean vigencia;

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

    public Long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }
}
