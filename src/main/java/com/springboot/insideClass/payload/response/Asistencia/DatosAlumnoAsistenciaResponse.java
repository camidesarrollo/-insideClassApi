package com.springboot.insideClass.payload.response.Asistencia;

import java.util.Date;

public class DatosAlumnoAsistenciaResponse {
    private Long matriculaId;
    private int cursoAgno;
    private boolean matriculaVigencia;
    private Long matriculaAlumnoId;
    private Long matriculaApoderadoId;
    private Long matriculaCursoEstablecimientoId;
    private Long alumnoId;
    private int alumnoPersonaRun;
    private Long asistenciaId;
    private Date fecha;
    private Long asistenciaMatriculaId;
    private Long establecimientoId;
    private String establecimientoCodigoArea;
    private String establecimientoNombre;
    private String establecimientoTelefono;
    private Long establecimientoDependenciaId;
    private Long establecimientoDireccionId;
    private Long establecimientoSostenedorId;
    private Long cursoId;
    private int cursoNivel;
    private String cursoNombre;

    // Constructor

    public Long getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(Long matriculaId) {
        this.matriculaId = matriculaId;
    }

    public int getCursoAgno() {
        return cursoAgno;
    }

    public void setCursoAgno(int cursoAgno) {
        this.cursoAgno = cursoAgno;
    }

    public boolean isMatriculaVigencia() {
        return matriculaVigencia;
    }

    public void setMatriculaVigencia(boolean matriculaVigencia) {
        this.matriculaVigencia = matriculaVigencia;
    }

    public Long getMatriculaAlumnoId() {
        return matriculaAlumnoId;
    }

    public void setMatriculaAlumnoId(Long matriculaAlumnoId) {
        this.matriculaAlumnoId = matriculaAlumnoId;
    }

    public Long getMatriculaApoderadoId() {
        return matriculaApoderadoId;
    }

    public void setMatriculaApoderadoId(Long matriculaApoderadoId) {
        this.matriculaApoderadoId = matriculaApoderadoId;
    }

    public Long getMatriculaCursoEstablecimientoId() {
        return matriculaCursoEstablecimientoId;
    }

    public void setMatriculaCursoEstablecimientoId(Long matriculaCursoEstablecimientoId) {
        this.matriculaCursoEstablecimientoId = matriculaCursoEstablecimientoId;
    }

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getAlumnoPersonaRun() {
        return alumnoPersonaRun;
    }

    public void setAlumnoPersonaRun(int alumnoPersonaRun) {
        this.alumnoPersonaRun = alumnoPersonaRun;
    }

    public Long getAsistenciaId() {
        return asistenciaId;
    }

    public void setAsistenciaId(Long asistenciaId) {
        this.asistenciaId = asistenciaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getAsistenciaMatriculaId() {
        return asistenciaMatriculaId;
    }

    public void setAsistenciaMatriculaId(Long asistenciaMatriculaId) {
        this.asistenciaMatriculaId = asistenciaMatriculaId;
    }

    public Long getEstablecimientoId() {
        return establecimientoId;
    }

    public void setEstablecimientoId(Long establecimientoId) {
        this.establecimientoId = establecimientoId;
    }

    public String getEstablecimientoCodigoArea() {
        return establecimientoCodigoArea;
    }

    public void setEstablecimientoCodigoArea(String establecimientoCodigoArea) {
        this.establecimientoCodigoArea = establecimientoCodigoArea;
    }

    public String getEstablecimientoNombre() {
        return establecimientoNombre;
    }

    public void setEstablecimientoNombre(String establecimientoNombre) {
        this.establecimientoNombre = establecimientoNombre;
    }

    public String getEstablecimientoTelefono() {
        return establecimientoTelefono;
    }

    public void setEstablecimientoTelefono(String establecimientoTelefono) {
        this.establecimientoTelefono = establecimientoTelefono;
    }

    public Long getEstablecimientoDependenciaId() {
        return establecimientoDependenciaId;
    }

    public void setEstablecimientoDependenciaId(Long establecimientoDependenciaId) {
        this.establecimientoDependenciaId = establecimientoDependenciaId;
    }

    public Long getEstablecimientoDireccionId() {
        return establecimientoDireccionId;
    }

    public void setEstablecimientoDireccionId(Long establecimientoDireccionId) {
        this.establecimientoDireccionId = establecimientoDireccionId;
    }

    public Long getEstablecimientoSostenedorId() {
        return establecimientoSostenedorId;
    }

    public void setEstablecimientoSostenedorId(Long establecimientoSostenedorId) {
        this.establecimientoSostenedorId = establecimientoSostenedorId;
    }

    public Long getCursoId() {
        return cursoId;
    }

    public void setCursoId(Long cursoId) {
        this.cursoId = cursoId;
    }

    public int getCursoNivel() {
        return cursoNivel;
    }

    public void setCursoNivel(int cursoNivel) {
        this.cursoNivel = cursoNivel;
    }

    public String getCursoNombre() {
        return cursoNombre;
    }

    public void setCursoNombre(String cursoNombre) {
        this.cursoNombre = cursoNombre;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "matriculaId=" + matriculaId +
                ", cursoAgno=" + cursoAgno +
                ", matriculaVigencia=" + matriculaVigencia +
                ", matriculaAlumnoId=" + matriculaAlumnoId +
                ", matriculaApoderadoId=" + matriculaApoderadoId +
                ", matriculaCursoEstablecimientoId=" + matriculaCursoEstablecimientoId +
                ", alumnoId=" + alumnoId +
                ", alumnoPersonaRun=" + alumnoPersonaRun +
                ", asistenciaId=" + asistenciaId +
                ", fecha=" + fecha +
                ", asistenciaMatriculaId=" + asistenciaMatriculaId +
                ", establecimientoId=" + establecimientoId +
                ", establecimientoCodigoArea='" + establecimientoCodigoArea + '\'' +
                ", establecimientoNombre='" + establecimientoNombre + '\'' +
                ", establecimientoTelefono='" + establecimientoTelefono + '\'' +
                ", establecimientoDependenciaId=" + establecimientoDependenciaId +
                ", establecimientoDireccionId=" + establecimientoDireccionId +
                ", establecimientoSostenedorId=" + establecimientoSostenedorId +
                ", cursoId=" + cursoId +
                ", cursoNivel=" + cursoNivel +
                ", cursoNombre='" + cursoNombre + '\'' +
                '}';
    }
}
