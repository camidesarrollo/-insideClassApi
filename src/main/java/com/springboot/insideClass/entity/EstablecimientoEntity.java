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
    DireccionEntity direccionEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establecimiento_sostenedor_id", nullable = false)
    SostenedorEntity sostenedorEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establecimiento_dependencia_id", nullable = false)
    DependenciaEntity dependenciaEntity;


    public EstablecimientoEntity() {
    }

    public EstablecimientoEntity(Long establecimiento_id, String establecimiento_nombre, Long establecimiento_codigo_area, Long establecimiento_telefono, DireccionEntity direccionEntity, SostenedorEntity sostenedorEntity, DependenciaEntity dependenciaEntity) {
        this.establecimiento_id = establecimiento_id;
        this.establecimiento_nombre = establecimiento_nombre;
        this.establecimiento_codigo_area = establecimiento_codigo_area;
        this.establecimiento_telefono = establecimiento_telefono;
        this.direccionEntity = direccionEntity;
        this.sostenedorEntity = sostenedorEntity;
        this.dependenciaEntity = dependenciaEntity;
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

    public DireccionEntity getDireccionEntity() {
        return direccionEntity;
    }

    public void setDireccionEntity(DireccionEntity direccionEntity) {
        this.direccionEntity = direccionEntity;
    }

    public SostenedorEntity getSostenedorEntity() {
        return sostenedorEntity;
    }

    public void setSostenedorEntity(SostenedorEntity sostenedorEntity) {
        this.sostenedorEntity = sostenedorEntity;
    }

    public DependenciaEntity getDependenciaEntity() {
        return dependenciaEntity;
    }

    public void setDependenciaEntity(DependenciaEntity dependenciaEntity) {
        this.dependenciaEntity = dependenciaEntity;
    }
}
