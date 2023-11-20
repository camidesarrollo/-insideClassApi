package com.springboot.insideClass.payload.request.Anotaciones;

public class BuscarAnotacionesRequest {

    boolean matricula_vigencia;
    Long establecimiento_id;
    Long apoderado_id;
    String alumno_run;
    Long anotaciones_matricula_id;
    String docente_run;
    Long asignatura_id;
    Long curso_id;
    Long anotaciones_id;

    public boolean isMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public Long getApoderado_id() {
        return apoderado_id;
    }

    public void setApoderado_id(Long apoderado_id) {
        this.apoderado_id = apoderado_id;
    }

    public String getAlumno_run() {
        return alumno_run;
    }

    public void setAlumno_run(String alumno_run) {
        this.alumno_run = alumno_run;
    }

    public Long getAnotaciones_matricula_id() {
        return anotaciones_matricula_id;
    }

    public void setAnotaciones_matricula_id(Long anotaciones_matricula_id) {
        this.anotaciones_matricula_id = anotaciones_matricula_id;
    }

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }

    public Long getAnotaciones_id() {
        return anotaciones_id;
    }

    public void setAnotaciones_id(Long anotaciones_id) {
        this.anotaciones_id = anotaciones_id;
    }
}
