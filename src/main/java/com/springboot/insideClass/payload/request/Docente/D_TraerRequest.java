package com.springboot.insideClass.payload.request.Docente;

public class D_TraerRequest {
    private long curso;
    private long establecimiento;
    private String docente_run;

    public long getCurso() {
        return curso;
    }

    public void setCurso(long curso) {
        this.curso = curso;
    }

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }
}
