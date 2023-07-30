package com.springboot.insideClass.payload.request.Matricula;

public class BuscarDatosMatriculaRequest {

    boolean matricula_vigencia;
    int curso_agno; Long apoderado_id;
    String apoderado_persona_run; Long alumno_id;
    String alumno_persona_run;

    Long  establecimiento_id;


    public boolean isMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }

    public int getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(int curso_agno) {
        this.curso_agno = curso_agno;
    }

    public Long getApoderado_id() {
        return apoderado_id;
    }

    public void setApoderado_id(Long apoderado_id) {
        this.apoderado_id = apoderado_id;
    }

    public String getApoderado_persona_run() {
        return apoderado_persona_run;
    }

    public void setApoderado_persona_run(String apoderado_persona_run) {
        this.apoderado_persona_run = apoderado_persona_run;
    }

    public Long getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Long alumno_id) {
        this.alumno_id = alumno_id;
    }

    public String getAlumno_persona_run() {
        return alumno_persona_run;
    }

    public void setAlumno_persona_run(String alumno_persona_run) {
        this.alumno_persona_run = alumno_persona_run;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
}
