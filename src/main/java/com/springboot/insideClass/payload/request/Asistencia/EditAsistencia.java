package com.springboot.insideClass.payload.request.Asistencia;

import java.util.Date;

public class EditAsistencia {
    long asistencia_id;
    Date fecha;

    public long getAsistencia_id() {
        return asistencia_id;
    }

    public void setAsistencia_id(long asistencia_id) {
        this.asistencia_id = asistencia_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
