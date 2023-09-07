package com.springboot.insideClass.payload.request.Docente;

public class EliminarDocenteRequest {
    String  docente_run;
    Long establecimiento_id;

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
