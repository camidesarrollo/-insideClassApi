package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.swing.plaf.synth.Region;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_PROVINCIAS", uniqueConstraints = {@UniqueConstraint(columnNames =  "provincia_id")})
public class provinciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer provincia_id;

    @NotBlank
    @Size(max = 200)
    String provincia_nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "provincia_region_id", nullable = false)
    regionEntity regionEntity;



    public provinciaEntity() {
    }

    public provinciaEntity(String provincia_nombre, com.springboot.insideClass.entity.regionEntity regionEntity) {
        this.provincia_nombre = provincia_nombre;
        this.regionEntity = regionEntity;
    }

    public Integer getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(Integer provincia_id) {
        this.provincia_id = provincia_id;
    }

    public String getProvincia_nombre() {
        return provincia_nombre;
    }

    public void setProvincia_nombre(String provincia_nombre) {
        this.provincia_nombre = provincia_nombre;
    }

    public com.springboot.insideClass.entity.regionEntity getRegionEntity() {
        return regionEntity;
    }

    public void setRegionEntity(com.springboot.insideClass.entity.regionEntity regionEntity) {
        this.regionEntity = regionEntity;
    }


}
