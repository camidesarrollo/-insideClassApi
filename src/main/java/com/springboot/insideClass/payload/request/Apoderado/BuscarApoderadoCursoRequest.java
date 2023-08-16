package com.springboot.insideClass.payload.request.Apoderado;

public class BuscarApoderadoCursoRequest {
    public String apoderado_persona_run;
    public Boolean matricula_vigencia;
    public Long establ_id;
    public Long curso_id;

    public String getApoderado_persona_run() {
        return apoderado_persona_run;
    }

    public void setApoderado_persona_run(String apoderado_persona_run) {
        this.apoderado_persona_run = apoderado_persona_run;
    }

    public Boolean getMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(Boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }

    public Long getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(Long establ_id) {
        this.establ_id = establ_id;
    }

    public Long getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Long curso_id) {
        this.curso_id = curso_id;
    }
}
