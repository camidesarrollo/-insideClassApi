package com.springboot.insideClass.payload.request.Notas;

import java.util.Date;

public class EditarNotasRequest {

    Long dace_notas_id;

    Date notas_fecha;

    int notas_posicion;

    double nota;

    double promedio;

    public Long getDace_notas_id() {
        return dace_notas_id;
    }

    public void setDace_notas_id(Long dace_notas_id) {
        this.dace_notas_id = dace_notas_id;
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

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
