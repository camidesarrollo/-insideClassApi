package com.springboot.insideClass.payload.response;

public class DocenteInfoResponse {

    public PersonaResponse persona;

    public EstablecimientoResponse establecimientoResponse;

    public DireccionResponse direccionResponse;

    public AsignaturaResponse asignaturaResponse;

    public CursoResponse cursoResponse;

    public String persona_email;


    public String docente_jefe;

    public DocenteInfoResponse(PersonaResponse persona, EstablecimientoResponse establecimientoResponse, DireccionResponse direccionResponse, AsignaturaResponse asignaturaResponse, CursoResponse cursoResponse, String persona_email, String docente_jefe) {
        this.persona = persona;
        this.establecimientoResponse = establecimientoResponse;
        this.direccionResponse = direccionResponse;
        this.asignaturaResponse = asignaturaResponse;
        this.cursoResponse = cursoResponse;
        this.persona_email = persona_email;
        this.docente_jefe = docente_jefe;
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

    public DireccionResponse getDireccionResponse() {
        return direccionResponse;
    }

    public void setDireccionResponse(DireccionResponse direccionResponse) {
        this.direccionResponse = direccionResponse;
    }

    public AsignaturaResponse getAsignaturaResponse() {
        return asignaturaResponse;
    }

    public void setAsignaturaResponse(AsignaturaResponse asignaturaResponse) {
        this.asignaturaResponse = asignaturaResponse;
    }

    public String getPersona_email() {
        return persona_email;
    }

    public void setPersona_email(String persona_email) {
        this.persona_email = persona_email;
    }

    public String getDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(String docente_jefe) {
        this.docente_jefe = docente_jefe;
    }

    public CursoResponse getCursoResponse() {
        return cursoResponse;
    }

    public void setCursoResponse(CursoResponse cursoResponse) {
        this.cursoResponse = cursoResponse;
    }
}
