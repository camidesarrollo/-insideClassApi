package com.springboot.insideClass.payload.request.Comunicacion;

public class GetRequest {
    Long id_establecimiento;
    Long id_curos;
    String fecha;
    String run;

    public Long getId_establecimiento() {
        return id_establecimiento;
    }

    public void setId_establecimiento(Long id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    public Long getId_curos() {
        return id_curos;
    }

    public void setId_curos(Long id_curos) {
        this.id_curos = id_curos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
}
