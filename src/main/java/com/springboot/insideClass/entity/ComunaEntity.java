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
    ProvinciaEntity provinciaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comuna_deprov_id", nullable = false)
    DepartamentosProvincialesEntity departamentosProvincialesEntity;

    public ComunaEntity() {
    }

    public ComunaEntity(String comuna_nombre, ProvinciaEntity provinciaEntity, DepartamentosProvincialesEntity departamentosProvincialesEntity) {
        this.comuna_nombre = comuna_nombre;
        this.provinciaEntity = provinciaEntity;
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
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

    public ProvinciaEntity getProvinciaEntity() {
        return provinciaEntity;
    }

    public void setProvinciaEntity(ProvinciaEntity provinciaEntity) {
        this.provinciaEntity = provinciaEntity;
    }

    public DepartamentosProvincialesEntity getDepartamentosProvincialesEntity() {
        return departamentosProvincialesEntity;
    }

    public void setDepartamentosProvincialesEntity(DepartamentosProvincialesEntity departamentosProvincialesEntity) {
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
    }
}
