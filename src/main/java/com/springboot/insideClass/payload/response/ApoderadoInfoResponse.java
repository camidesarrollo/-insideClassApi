package com.springboot.insideClass.payload.response;

public class ApoderadoInfoResponse {
    public PersonaResponse persona;
    public EstablecimientoResponse establecimientoResponse;

    public ApoderadoInfoResponse(PersonaResponse persona, EstablecimientoResponse establecimientoResponse) {
        this.persona = persona;
        this.establecimientoResponse = establecimientoResponse;
    }

    public PersonaResponse getPersona() {
        return persona;
    }

    public void setPersona(PersonaResponse persona) {
        this.persona = persona;
    }

    public EstablecimientoResponse getEstablecimientoResponse() {
        return establecimientoResponse;
    }

    public void setEstablecimientoResponse(EstablecimientoResponse establecimientoResponse) {
        this.establecimientoResponse = establecimientoResponse;
    }
}
