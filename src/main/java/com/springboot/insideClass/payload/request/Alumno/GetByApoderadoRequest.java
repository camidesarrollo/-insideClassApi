package com.springboot.insideClass.payload.request.Alumno;

public class GetByApoderadoRequest {

    String apoderado_run;

    Long establecimiento_id;

    public String getApoderado_run() {
        return apoderado_run;
    }

    public void setApoderado_run(String apoderado_run) {
        this.apoderado_run = apoderado_run;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
}
