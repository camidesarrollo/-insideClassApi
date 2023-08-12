package com.springboot.insideClass.payload.request.Notas;

import java.util.Date;

public class CrearNotasRequest {


    private String run;

    private Long establecimiento;

    private Long asignatura;

    private String run_docente;

    private Date notas_fecha;

    private int notas_posicion;

    private double nota;

    private double promedio;

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

    public String getRun_docente() {
        return run_docente;
    }

    public void setRun_docente(String run_docente) {
        this.run_docente = run_docente;
    }

    public Date getNotas_fecha() {
        return notas_fecha;
    }

    public void setNotas_fecha(Date notas_fecha) {
        this.notas_fecha = notas_fecha;
    }

    public int getNotas_posicion() {
        return notas_posicion;
    }

    public void setNotas_posicion(int notas_posicion) {
        this.notas_posicion = notas_posicion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
