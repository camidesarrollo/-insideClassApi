package com.springboot.insideClass.payload.request;

public class AddDocenteRequest {

    private PersonaRequest persona;


    private DocenteCursoRequest docenteCurso;

    private String perfil;

    private long establecimiento;

    private long curso;

    private long asignatura;

    public PersonaRequest getPersona() {
        return persona;
    }

    public void setPersona(PersonaRequest persona) {
        this.persona = persona;
    }

    public DocenteCursoRequest getDocenteCurso() {
        return docenteCurso;
    }

    public void setDocenteCurso(DocenteCursoRequest docenteCurso) {
        this.docenteCurso = docenteCurso;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public long getCurso() {
        return curso;
    }

    public void setCurso(long curso) {
        this.curso = curso;
    }

    public long getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(long asignatura) {
        this.asignatura = asignatura;
    }
}
