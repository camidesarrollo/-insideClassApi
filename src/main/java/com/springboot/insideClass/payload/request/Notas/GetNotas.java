package com.springboot.insideClass.payload.request.Notas;

public class GetNotas {
    public String run;
    public String docente_run;
    public Long id_establecimiento;
    public Long id_asignatura;
    public String fecha;

    public Long curso;


    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }

    public Long getId_establecimiento() {
        return id_establecimiento;
    }

    public void setId_establecimiento(Long id_establecimiento) {
        this.id_establecimiento = id_establecimiento;
    }

    public Long getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(Long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

}


