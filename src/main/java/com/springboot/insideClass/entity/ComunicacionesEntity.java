package com.springboot.insideClass.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "T_COMUNICACIONES", uniqueConstraints = {@UniqueConstraint(columnNames =  "comunicaciones_id")})
public class ComunicacionesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long comunicaciones_id;
    Date fecha;
    String tipo;
    String descripcion;
    @ManyToOne
    @JoinColumn(name = "curso_establ_id")
    CursoEstablecimientoEntity cursoEstablecimiento;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CursoEstablecimientoEntity getCursoEstablecimiento() {
        return cursoEstablecimiento;
    }

    public void setCursoEstablecimiento(CursoEstablecimientoEntity cursoEstablecimiento) {
        this.cursoEstablecimiento = cursoEstablecimiento;
    }
}
