package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_REGION", uniqueConstraints = {@UniqueConstraint(columnNames =  "region_id")})
public class RegionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long region_id;

    @NotBlank
    @Size(max = 200)
    String region_nombre;

    @NotBlank
    @Size(max = 100)
    String region_abreviatura;

    @NotBlank
    @Size(max = 200)
    String region_capital;

    public RegionEntity() {
    }

    public RegionEntity(String region_nombre, String region_abreviatura, String region_capital) {
        this.region_nombre = region_nombre;
        this.region_abreviatura = region_abreviatura;
        this.region_capital = region_capital;
    }

    public Long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Long region_id) {
        this.region_id = region_id;
    }

    public String getRegion_nombre() {
        return region_nombre;
    }

    public void setRegion_nombre(String region_nombre) {
        this.region_nombre = region_nombre;
    }

    public String getRegion_abreviatura() {
        return region_abreviatura;
    }

    public void setRegion_abreviatura(String region_abreviatura) {
        this.region_abreviatura = region_abreviatura;
    }

    public String getRegion_capital() {
        return region_capital;
    }

    public void setRegion_capital(String region_capital) {
        this.region_capital = region_capital;
    }
}
