package com.springboot.insideClass.payload.request.Anotacion;


import java.util.Date;

public class CreateAnotacion {

    private String run;

    private Long establecimiento;

    private Long asignatura;

    private String run_docente;

    private Date fecha;

    private String descripcion;

    private String gravedad;

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Long getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Long asignatura) {
        this.asignatura = asignatura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getRun_docente() {
        return run_docente;
    }

    public void setRun_docente(String run_docente) {
        this.run_docente = run_docente;
    }
}
