package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ESTABL", uniqueConstraints = {@UniqueConstraint(columnNames =  "establ_id")})
public class EstablecimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long establ_id;

    @NotBlank
    @Size(max = 200)
    String establ_nombre;

    Long establ_cod_area;

    Long establ_numero_telefonico;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_direccion_id", nullable = false)
    DireccionEntity direccionEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_sost_id", nullable = false)
    SostenedorEntity sostenedorEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_depend_id", nullable = false)
    DependenciaEntity dependenciaEntity;


    public EstablecimientoEntity() {
    }

    public EstablecimientoEntity(String establ_nombre, Long establ_cod_area, Long establ_numero_telefonico, DireccionEntity direccionEntity, SostenedorEntity sostenedorEntity, DependenciaEntity dependenciaEntity) {
        this.establ_nombre = establ_nombre;
        this.establ_cod_area = establ_cod_area;
        this.establ_numero_telefonico = establ_numero_telefonico;
        this.direccionEntity = direccionEntity;
        this.sostenedorEntity = sostenedorEntity;
        this.dependenciaEntity = dependenciaEntity;
    }


    public Long getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(Long establ_id) {
        this.establ_id = establ_id;
    }

    public String getEstabl_nombre() {
        return establ_nombre;
    }

    public void setEstabl_nombre(String establ_nombre) {
        this.establ_nombre = establ_nombre;
    }

    public void setDireccionEntity(DireccionEntity direccionEntity) {
        this.direccionEntity = direccionEntity;
    }

    public void setSostenedorEntity(SostenedorEntity sostenedorEntity) {
        this.sostenedorEntity = sostenedorEntity;
    }


    public void setDependenciaEntity(DependenciaEntity dependenciaEntity) {
        this.dependenciaEntity = dependenciaEntity;
    }

    public Long getEstabl_cod_area() {
        return establ_cod_area;
    }

    public void setEstabl_cod_area(Long establ_cod_area) {
        this.establ_cod_area = establ_cod_area;
    }

    public Long getEstabl_numero_telefonico() {
        return establ_numero_telefonico;
    }

    public void setEstabl_numero_telefonico(Long establ_numero_telefonico) {
        this.establ_numero_telefonico = establ_numero_telefonico;
    }
}
