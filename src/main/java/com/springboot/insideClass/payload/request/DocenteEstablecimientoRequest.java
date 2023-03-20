package com.springboot.insideClass.payload.request;

public class DocenteEstablecimientoRequest {
    private String docente_run;
    private Long establecimiento_id;

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
}
