package com.springboot.insideClass.payload.request.Asistencia;

public class BuscarAsistenciaRequest {

    int curso_agno; boolean matricula_vigencia;
    String alumno_persona_run; String fecha;
    int anio; Long establecimiento_id;
    Long curso_id;

    public int getCurso_agno() {
        return curso_agno;
    }

    public void setCurso_agno(int curso_agno) {
        this.curso_agno = curso_agno;
    }

    public boolean isMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }

    public String getAlumno_persona_run() {
        return alumno_persona_run;
    }

    public void setAlumno_persona_run(String alumno_persona_run) {
        this.alumno_persona_run = alumno_persona_run;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }
}
