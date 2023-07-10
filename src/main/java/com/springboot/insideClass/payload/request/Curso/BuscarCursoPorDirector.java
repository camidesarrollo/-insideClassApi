package com.springboot.insideClass.payload.request.Curso;

public class BuscarCursoPorDirector {
    boolean vigencia;
    Long curso_establecimiento_curso_id;
    Long curso_establecimiento_establecimiento_id;
    String director_id;

    String director_persona_run;

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public Long getCurso_establecimiento_curso_id() {
        return curso_establecimiento_curso_id;
    }

    public void setCurso_establecimiento_curso_id(Long curso_establecimiento_curso_id) {
        this.curso_establecimiento_curso_id = curso_establecimiento_curso_id;
    }

    public Long getCurso_establecimiento_establecimiento_id() {
        return curso_establecimiento_establecimiento_id;
    }

    public void setCurso_establecimiento_establecimiento_id(Long curso_establecimiento_establecimiento_id) {
        this.curso_establecimiento_establecimiento_id = curso_establecimiento_establecimiento_id;
    }

    public String getDirector_id() {
        return director_id;
    }

    public void setDirector_id(String director_id) {
        this.director_id = director_id;
    }

    public String getDirector_persona_run() {
        return director_persona_run;
    }

    public void setDirector_persona_run(String director_persona_run) {
        this.director_persona_run = director_persona_run;
    }
}
