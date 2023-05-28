package com.springboot.insideClass.payload.request.Establecimiento;

public class GetEstablecimiento {
    long establemiento;
    String run;
    long curso;
    String perfil;

    public GetEstablecimiento(long establemiento, String run, long curso, String perfil) {
        this.establemiento = establemiento;
        this.run = run;
        this.curso = curso;
        this.perfil = perfil;
    }

    public long getEstablemiento() {
        return establemiento;
    }

    public void setEstablemiento(long establemiento) {
        this.establemiento = establemiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public long getCurso() {
        return curso;
    }

    public void setCurso(long curso) {
        this.curso = curso;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
