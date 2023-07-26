package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ESTABLECIMIENTO", uniqueConstraints = {@UniqueConstraint(columnNames =  "establecimiento_id")})
public class EstablecimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long establecimiento_id;

    @NotBlank
    @Size(max = 200)
    String establecimiento_nombre;

    Long establecimiento_codigo_area;

    Long establecimiento_telefono;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establecimiento_direccion_id", nullable = false)
    DireccionEntity direccion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establecimiento_sostenedor_id", nullable = false)
    SostenedorEntity sostenedor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establecimiento_dependencia_id", nullable = false)
    DependenciaEntity dependencia;


    public EstablecimientoEntity() {
    }

    public EstablecimientoEntity(String establecimiento_nombre, Long establecimiento_codigo_area, Long establecimiento_telefono, DireccionEntity direccion, SostenedorEntity sostenedor, DependenciaEntity dependencia) {
        this.establecimiento_nombre = establecimiento_nombre;
        this.establecimiento_codigo_area = establecimiento_codigo_area;
        this.establecimiento_telefono = establecimiento_telefono;
        this.direccion = direccion;
        this.sostenedor = sostenedor;
        this.dependencia = dependencia;
    }

    public Long getEstablecimiento_id() {
        return establecimiento_id;
    }

    public void setEstablecimiento_id(Long establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }

    public String getEstablecimiento_nombre() {
        return establecimiento_nombre;
    }

    public void setEstablecimiento_nombre(String establecimiento_nombre) {
        this.establecimiento_nombre = establecimiento_nombre;
    }

    public Long getEstablecimiento_codigo_area() {
        return establecimiento_codigo_area;
    }

    public void setEstablecimiento_codigo_area(Long establecimiento_codigo_area) {
        this.establecimiento_codigo_area = establecimiento_codigo_area;
    }

    public Long getEstablecimiento_telefono() {
        return establecimiento_telefono;
    }

    public void setEstablecimiento_telefono(Long establecimiento_telefono) {
        this.establecimiento_telefono = establecimiento_telefono;
    }

    public DireccionEntity getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionEntity direccion) {
        this.direccion = direccion;
    }

    public SostenedorEntity getSostenedor() {
        return sostenedor;
    }

    public void setSostenedor(SostenedorEntity sostenedor) {
        this.sostenedor = sostenedor;
    }

    public DependenciaEntity getDependencia() {
        return dependencia;
    }

    public void setDependencia(DependenciaEntity dependencia) {
        this.dependencia = dependencia;
    }
}
