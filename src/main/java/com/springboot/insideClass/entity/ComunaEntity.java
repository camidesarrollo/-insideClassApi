package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_COMUNAS", uniqueConstraints = {@UniqueConstraint(columnNames =  "comunas_id")})
public class ComunaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long comunas_id;

    @NotBlank
    @Size(max = 200)
    String comunas_nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comunas_provincia_id", nullable = false)
    ProvinciaEntity provinciaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comunas_deprov_id", nullable = false)
    DepartamentosProvincialesEntity departamentosProvincialesEntity;


    public ComunaEntity() {
    }

    public ComunaEntity(String comunas_nombre, ProvinciaEntity provinciaEntity, DepartamentosProvincialesEntity departamentosProvincialesEntity) {
        this.comunas_nombre = comunas_nombre;
        this.provinciaEntity = provinciaEntity;
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
    }

    public Long getComunas_id() {
        return comunas_id;
    }

    public void setComunas_id(Long comunas_id) {
        this.comunas_id = comunas_id;
    }

    public String getComunas_nombre() {
        return comunas_nombre;
    }

    public void setComunas_nombre(String comuna_nombre) {
        this.comunas_nombre = comuna_nombre;
    }


    public void setProvinciaEntity(ProvinciaEntity provinciaEntity) {
        this.provinciaEntity = provinciaEntity;
    }

    public void setDepartamentosProvincialesEntity(DepartamentosProvincialesEntity departamentosProvincialesEntity) {
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
    }
}
