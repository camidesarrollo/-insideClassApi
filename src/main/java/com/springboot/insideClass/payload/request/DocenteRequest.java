package com.springboot.insideClass.payload.request;

import java.util.Date;

public class DocenteRequest {

    private PersonaRequest persona;

    private long curso;

    private long asignatura;

    private long establecimiento;

    private Date fecha_inicio;

    private Date fecha_fin;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    private String correo;

    public PersonaRequest getPersona() {
        return persona;
    }

    public void setPersona(PersonaRequest persona) {
        this.persona = persona;
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

    public long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
