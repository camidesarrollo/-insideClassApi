package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_PROVINCIAS", uniqueConstraints = {@UniqueConstraint(columnNames =  "provincia_id")})
public class ProvinciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long provincia_id;

    @NotBlank
    @Size(max = 200)
    String provincia_nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "provincia_region_id", nullable = false)
    RegionEntity regionEntity;



    public ProvinciaEntity() {
    }

    public ProvinciaEntity(String provincia_nombre, RegionEntity regionEntity) {
        this.provincia_nombre = provincia_nombre;
        this.regionEntity = regionEntity;
    }

    public Long getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(Long provincia_id) {
        this.provincia_id = provincia_id;
    }

    public String getProvincia_nombre() {
        return provincia_nombre;
    }

    public void setProvincia_nombre(String provincia_nombre) {
        this.provincia_nombre = provincia_nombre;
    }

    public RegionEntity getRegionEntity() {
        return regionEntity;
    }

    public void setRegionEntity(RegionEntity regionEntity) {
        this.regionEntity = regionEntity;
    }


}
