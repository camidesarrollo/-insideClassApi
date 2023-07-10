package com.springboot.insideClass.payload.request.Alumno;

public class BuscarAlumnoRequest {
    Long id;
    String alumno_persona_run;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlumno_persona_run() {
        return alumno_persona_run;
    }

    public void setAlumno_persona_run(String alumno_persona_run) {
        this.alumno_persona_run = alumno_persona_run;
    }
}
