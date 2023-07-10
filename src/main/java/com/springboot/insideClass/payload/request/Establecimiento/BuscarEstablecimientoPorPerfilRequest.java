package com.springboot.insideClass.payload.request.Establecimiento;

public class BuscarEstablecimientoPorPerfilRequest {

    Long establemiento;
    String run;
    Long curso;
    String perfil;

    public Long getEstablemiento() {
        return establemiento;
    }

    public void setEstablemiento(Long establemiento) {
        this.establemiento = establemiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
