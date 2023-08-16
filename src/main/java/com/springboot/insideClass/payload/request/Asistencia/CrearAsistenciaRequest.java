package com.springboot.insideClass.payload.request.Asistencia;

import java.util.List;

public class CrearAsistenciaRequest {

    List<Long> matricula;
    String fecha;

    public List<Long> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Long> matricula) {
        this.matricula = matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
