package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_COMUNA", uniqueConstraints = {@UniqueConstraint(columnNames =  "comuna_id")})
public class ComunaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long comuna_id;

    @NotBlank
    @Size(max = 200)
    String comuna_nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comuna_provincia_id", nullable = false)
    ProvinciaEntity provincia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comuna_deprov_id", nullable = false)
    DepartamentosProvincialesEntity departamentosProvinciales;

    public ComunaEntity() {
    }

    public ComunaEntity(String comuna_nombre, ProvinciaEntity provincia, DepartamentosProvincialesEntity departamentosProvinciales) {
        this.comuna_nombre = comuna_nombre;
        this.provincia = provincia;
        this.departamentosProvinciales = departamentosProvinciales;
    }

    public Long getComuna_id() {
        return comuna_id;
    }

    public void setComuna_id(Long comuna_id) {
        this.comuna_id = comuna_id;
    }

    public String getComuna_nombre() {
        return comuna_nombre;
    }

    public void setComuna_nombre(String comuna_nombre) {
        this.comuna_nombre = comuna_nombre;
    }

    public ProvinciaEntity getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaEntity provincia) {
        this.provincia = provincia;
    }

    public DepartamentosProvincialesEntity getDepartamentosProvinciales() {
        return departamentosProvinciales;
    }

    public void setDepartamentosProvinciales(DepartamentosProvincialesEntity departamentosProvinciales) {
        this.departamentosProvinciales = departamentosProvinciales;
    }
}
