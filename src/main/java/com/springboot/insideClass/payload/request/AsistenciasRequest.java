package com.springboot.insideClass.payload.request;

import java.util.Date;
import java.util.List;

public class AsistenciasRequest {

    List<Long> matricula;
    Date fecha;

    public List<Long> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Long> matricula) {
        this.matricula = matricula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
