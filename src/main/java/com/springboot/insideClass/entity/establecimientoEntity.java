package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_ESTABL", uniqueConstraints = {@UniqueConstraint(columnNames =  "establ_id")})
public class establecimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer establ_id;

    @NotBlank
    @Size(max = 200)
    String establ_nombre;

    Integer establ_cod_area;

    Integer establ_numero_telefonico;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_direccion_id", nullable = false)
    direccionEntity direccionEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_sost_id", nullable = false)
    sostenedorEntity sostenedorEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "establ_depend_id", nullable = false)
    dependenciaEntity dependenciaEntity;


    public establecimientoEntity() {
    }

    public establecimientoEntity(String establ_nombre, Integer establ_cod_area, Integer establ_numero_telefonico, com.springboot.insideClass.entity.direccionEntity direccionEntity, com.springboot.insideClass.entity.sostenedorEntity sostenedorEntity, com.springboot.insideClass.entity.dependenciaEntity dependenciaEntity) {
        this.establ_nombre = establ_nombre;
        this.establ_cod_area = establ_cod_area;
        this.establ_numero_telefonico = establ_numero_telefonico;
        this.direccionEntity = direccionEntity;
        this.sostenedorEntity = sostenedorEntity;
        this.dependenciaEntity = dependenciaEntity;
    }


    public Integer getEstabl_id() {
        return establ_id;
    }

    public void setEstabl_id(Integer establ_id) {
        this.establ_id = establ_id;
    }

    public String getEstabl_nombre() {
        return establ_nombre;
    }

    public void setEstabl_nombre(String establ_nombre) {
        this.establ_nombre = establ_nombre;
    }

    public void setDireccionEntity(com.springboot.insideClass.entity.direccionEntity direccionEntity) {
        this.direccionEntity = direccionEntity;
    }

    public void setSostenedorEntity(com.springboot.insideClass.entity.sostenedorEntity sostenedorEntity) {
        this.sostenedorEntity = sostenedorEntity;
    }


    public void setDependenciaEntity(com.springboot.insideClass.entity.dependenciaEntity dependenciaEntity) {
        this.dependenciaEntity = dependenciaEntity;
    }

    public Integer getEstabl_cod_area() {
        return establ_cod_area;
    }

    public void setEstabl_cod_area(Integer establ_cod_area) {
        this.establ_cod_area = establ_cod_area;
    }

    public Integer getEstabl_numero_telefonico() {
        return establ_numero_telefonico;
    }

    public void setEstabl_numero_telefonico(Integer establ_numero_telefonico) {
        this.establ_numero_telefonico = establ_numero_telefonico;
    }
}
