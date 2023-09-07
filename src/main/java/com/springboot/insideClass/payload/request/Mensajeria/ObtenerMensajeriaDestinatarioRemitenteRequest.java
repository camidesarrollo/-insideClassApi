package com.springboot.insideClass.payload.request.Mensajeria;

public class ObtenerMensajeriaDestinatarioRemitenteRequest {
    String d_persona_run;
    String r_persona_run;

    public String getD_persona_run() {
        return d_persona_run;
    }

    public void setD_persona_run(String d_persona_run) {
        this.d_persona_run = d_persona_run;
    }

    public String getR_persona_run() {
        return r_persona_run;
    }

    public void setR_persona_run(String r_persona_run) {
        this.r_persona_run = r_persona_run;
    }
}
