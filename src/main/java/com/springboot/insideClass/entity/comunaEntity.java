package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_COMUNAS", uniqueConstraints = {@UniqueConstraint(columnNames =  "comunas_id")})
public class comunaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer comunas_id;

    @NotBlank
    @Size(max = 200)
    String comunas_nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comunas_provincia_id", nullable = false)
    provinciaEntity provinciaEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "comunas_deprov_id", nullable = false)
    departamentosProvincialesEntity departamentosProvincialesEntity;


    public comunaEntity() {
    }

    public comunaEntity(String comunas_nombre, com.springboot.insideClass.entity.provinciaEntity provinciaEntity, com.springboot.insideClass.entity.departamentosProvincialesEntity departamentosProvincialesEntity) {
        this.comunas_nombre = comunas_nombre;
        this.provinciaEntity = provinciaEntity;
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
    }

    public Integer getComunas_id() {
        return comunas_id;
    }

    public void setComunas_id(Integer comunas_id) {
        this.comunas_id = comunas_id;
    }

    public String getComunas_nombre() {
        return comunas_nombre;
    }

    public void setComunas_nombre(String comuna_nombre) {
        this.comunas_nombre = comuna_nombre;
    }


    public void setProvinciaEntity(com.springboot.insideClass.entity.provinciaEntity provinciaEntity) {
        this.provinciaEntity = provinciaEntity;
    }

    public void setDepartamentosProvincialesEntity(com.springboot.insideClass.entity.departamentosProvincialesEntity departamentosProvincialesEntity) {
        this.departamentosProvincialesEntity = departamentosProvincialesEntity;
    }
}
