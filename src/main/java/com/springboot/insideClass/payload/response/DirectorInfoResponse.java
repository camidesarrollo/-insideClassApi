package com.springboot.insideClass.payload.response;

public class DirectorInfoResponse {

    public PersonaResponse persona;
    public EstablecimientoResponse establecimientoResponse;
    public DireccionResponse direccionResponse;

    public PersonaResponse getPersona() {
        return persona;
    }

    public DirectorInfoResponse(PersonaResponse persona, EstablecimientoResponse establecimientoResponse, DireccionResponse direccionResponse) {
        this.persona = persona;
        this.establecimientoResponse = establecimientoResponse;
        this.direccionResponse = direccionResponse;
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

    public DireccionResponse getDireccionResponse() {
        return direccionResponse;
    }

    public void setDireccionResponse(DireccionResponse direccionResponse) {
        this.direccionResponse = direccionResponse;
    }
}
