package com.springboot.insideClass.payload.request.Docente;

public class BuscarDocenteRequest {

    Long docente_id;


    String docente_persona_run;

    public Long getDocente_id() {
        return docente_id;
    }

    public void setDocente_id(Long docente_id) {
        this.docente_id = docente_id;
    }

    public String getDocente_persona_run() {
        return docente_persona_run;
    }

    public void setDocente_persona_run(String docente_persona_run) {
        this.docente_persona_run = docente_persona_run;
    }
}
