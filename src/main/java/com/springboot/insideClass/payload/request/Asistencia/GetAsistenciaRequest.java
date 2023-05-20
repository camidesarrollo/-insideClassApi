package com.springboot.insideClass.payload.request.Asistencia;

import java.util.Date;

public class GetAsistenciaRequest {

    private Long establecimiento_id;
    private String run_alumno;
    private Date fecha;

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getRun_alumno() {
        return run_alumno;
    }

    public void setRun_alumno(String run_alumno) {
        this.run_alumno = run_alumno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
