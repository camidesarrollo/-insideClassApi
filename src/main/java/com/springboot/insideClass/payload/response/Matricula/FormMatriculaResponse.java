package com.springboot.insideClass.payload.response.Matricula;

import com.springboot.insideClass.payload.response.Persona.FormPersonaResponse;

public class FormMatriculaResponse {
    FormPersonaResponse alumno;
    FormPersonaResponse apoderado;

    public FormPersonaResponse getAlumno() {
        return alumno;
    }

    public void setAlumno(FormPersonaResponse alumno) {
        this.alumno = alumno;
    }

    public FormPersonaResponse getApoderado() {
        return apoderado;
    }

    public void setApoderado(FormPersonaResponse apoderado) {
        this.apoderado = apoderado;
    }
}
