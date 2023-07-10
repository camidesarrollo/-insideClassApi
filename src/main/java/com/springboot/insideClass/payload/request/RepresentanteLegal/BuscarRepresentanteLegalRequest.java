package com.springboot.insideClass.payload.request.RepresentanteLegal;

public class BuscarRepresentanteLegalRequest {


    Long representante_legal_id;

    String representante_legal_persona_run;

    public Long getRepresentante_legal_id() {
        return representante_legal_id;
    }

    public void setRepresentante_legal_id(Long representante_legal_id) {
        this.representante_legal_id = representante_legal_id;
    }

    public String getRepresentante_legal_persona_run() {
        return representante_legal_persona_run;
    }

    public void setRepresentante_legal_persona_run(String representante_legal_persona_run) {
        this.representante_legal_persona_run = representante_legal_persona_run;
    }
}
