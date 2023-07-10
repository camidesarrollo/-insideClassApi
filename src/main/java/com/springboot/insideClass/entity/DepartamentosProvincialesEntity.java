package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_departamentos_provinciales", uniqueConstraints = {@UniqueConstraint(columnNames =  "departamentos_provinciales_id")})
public class DepartamentosProvincialesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long departamentos_provinciales_id;
    @NotBlank
    @Size(max = 100)
    String departamentos_provinciales_responsable;
    @NotBlank
    @Size(max = 100)
    String departamentos_provinciales_correo;

    @NotBlank
    @Size(max = 300)
    String departamentos_provinciales_direccion;

    public DepartamentosProvincialesEntity() {
    }

    public DepartamentosProvincialesEntity(String departamentos_provinciales_responsable, String departamentos_provinciales_correo, String departamentos_provinciales_direccion) {
        this.departamentos_provinciales_responsable = departamentos_provinciales_responsable;
        this.departamentos_provinciales_correo = departamentos_provinciales_correo;
        this.departamentos_provinciales_direccion = departamentos_provinciales_direccion;
    }

    public Long getDepartamentos_provinciales_id() {
        return departamentos_provinciales_id;
    }

    public void setDepartamentos_provinciales_id(Long departamentos_provinciales_id) {
        this.departamentos_provinciales_id = departamentos_provinciales_id;
    }

    public String getDepartamentos_provinciales_responsable() {
        return departamentos_provinciales_responsable;
    }

    public void setDepartamentos_provinciales_responsable(String departamentos_provinciales_responsable) {
        this.departamentos_provinciales_responsable = departamentos_provinciales_responsable;
    }

    public String getDepartamentos_provinciales_correo() {
        return departamentos_provinciales_correo;
    }

    public void setDepartamentos_provinciales_correo(String departamentos_provinciales_correo) {
        this.departamentos_provinciales_correo = departamentos_provinciales_correo;
    }

    public String getDepartamentos_provinciales_direccion() {
        return departamentos_provinciales_direccion;
    }

    public void setDepartamentos_provinciales_direccion(String departamentos_provinciales_direccion) {
        this.departamentos_provinciales_direccion = departamentos_provinciales_direccion;
    }
}
