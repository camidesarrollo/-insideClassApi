package com.springboot.insideClass.payload.request.Comunicacion;

import java.util.Date;

public class CreateComunicacionesRequest {

    private Long establecimiento;

    private Long curso;

    private String run_docente;

    private Date fecha;

    private String descripcion;

    private String tipo;

    public Long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

    public String getRun_docente() {
        return run_docente;
    }

    public void setRun_docente(String run_docente) {
        this.run_docente = run_docente;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
