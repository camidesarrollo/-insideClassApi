package com.springboot.insideClass.payload.request.Notas;

import java.util.Date;

public class CreateNotas {

    private String run;

    private Long establecimiento;

    private Long asignatura;

    private String docente_run;

    private String nota;

    private String posicion_nota;

    private Date fecha;

    public CreateNotas() {
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Long getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(Long establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Long getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Long asignatura) {
        this.asignatura = asignatura;
    }

    public String getDocente_run() {
        return docente_run;
    }

    public void setDocente_run(String docente_run) {
        this.docente_run = docente_run;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getPosicion_nota() {
        return posicion_nota;
    }

    public void setPosicion_nota(String posicion_nota) {
        this.posicion_nota = posicion_nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean IsValid() {

        if (run == null || run.isEmpty()) {
            return false;
        }

        if (establecimiento == null || establecimiento <= 0) {
            return false;
        }

        if (asignatura == null || asignatura <= 0) {
            return false;
        }

        if (docente_run == null || docente_run.isEmpty()) {
            return false;
        }

        if (nota == null || nota.isEmpty()) {
            return false;
        }

        if (posicion_nota == null || posicion_nota.isEmpty()) {
            return false;
        }

        if (fecha == null) {
            return false;
        }

        return true;
    }
}
