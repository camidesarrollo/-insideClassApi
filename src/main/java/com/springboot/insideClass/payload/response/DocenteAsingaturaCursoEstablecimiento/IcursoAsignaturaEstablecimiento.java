package com.springboot.insideClass.payload.response.DocenteAsingaturaCursoEstablecimiento;

import com.springboot.insideClass.entity.AsignaturaEntity;
import com.springboot.insideClass.entity.CursoEntity;
import com.springboot.insideClass.entity.EstablecimientoEntity;

public class IcursoAsignaturaEstablecimiento {

    CursoEntity curso;

    AsignaturaEntity asignatura;

    EstablecimientoEntity establecimiento;

    public IcursoAsignaturaEstablecimiento(CursoEntity curso, AsignaturaEntity asignatura, EstablecimientoEntity establecimiento) {
        this.curso = curso;
        this.asignatura = asignatura;
        this.establecimiento = establecimiento;
    }

    public CursoEntity getCurso() {
        return curso;
    }

    public void setCurso(CursoEntity curso) {
        this.curso = curso;
    }

    public AsignaturaEntity getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(AsignaturaEntity asignatura) {
        this.asignatura = asignatura;
    }

    public EstablecimientoEntity getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(EstablecimientoEntity establecimiento) {
        this.establecimiento = establecimiento;
    }
}
