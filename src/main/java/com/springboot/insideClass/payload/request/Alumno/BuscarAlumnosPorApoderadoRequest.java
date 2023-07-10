package com.springboot.insideClass.payload.request.Alumno;

public class BuscarAlumnosPorApoderadoRequest {

    String apoderado_run;
    Boolean matricula_vigencia;

    String establ_id;

    public String getApoderado_run() {
        return apoderado_run;
    }

    public void setApoderado_run(String apoderado_run) {
        this.apoderado_run = apoderado_run;
    }


    public String getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(String establ_id) {
        this.establ_id = establ_id;
    }

    public Boolean getMatricula_vigencia() {
        return matricula_vigencia;
    }

    public void setMatricula_vigencia(Boolean matricula_vigencia) {
        this.matricula_vigencia = matricula_vigencia;
    }
}
