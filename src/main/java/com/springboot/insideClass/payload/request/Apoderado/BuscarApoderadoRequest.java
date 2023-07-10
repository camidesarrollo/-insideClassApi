package com.springboot.insideClass.payload.request.Apoderado;

public class BuscarApoderadoRequest {
    Long id;
    String apoderado_persona_run;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApoderado_persona_run() {
        return apoderado_persona_run;
    }

    public void setApoderado_persona_run(String apoderado_persona_run) {
        this.apoderado_persona_run = apoderado_persona_run;
    }
}
