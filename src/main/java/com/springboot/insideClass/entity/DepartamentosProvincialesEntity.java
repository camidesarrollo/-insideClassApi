package com.springboot.insideClass.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "T_DEPROV", uniqueConstraints = {@UniqueConstraint(columnNames =  "deprov_id")})
public class DepartamentosProvincialesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long deprov_id;
    @NotBlank
    @Size(max = 100)
    String deprov_responsable;
    @NotBlank
    @Size(max = 100)
    String deprov_correo;

    @NotBlank
    @Size(max = 300)
    String deprov_direccion;





    public DepartamentosProvincialesEntity() {
    }

    public DepartamentosProvincialesEntity(String deprov_responsable, String deprov_correo, String deprov_direccion) {
        this.deprov_responsable = deprov_responsable;
        this.deprov_correo = deprov_correo;
        this.deprov_direccion = deprov_direccion;
    }

    public String getDeprov_direccion() {
        return deprov_direccion;
    }

    public void setDeprov_direccion(String deprov_direccion) {
        this.deprov_direccion = deprov_direccion;
    }

    public String getDeprov_responsable() {
        return deprov_responsable;
    }

    public void setDeprov_responsable(String deprov_responsable) {
        this.deprov_responsable = deprov_responsable;
    }

    public String getDeprov_correo() {
        return deprov_correo;
    }

    public void setDeprov_correo(String deprov_correo) {
        this.deprov_correo = deprov_correo;
    }


    public Long getDeprov_id() {
        return deprov_id;
    }

    public void setDeprov_id(Long deprov_id) {
        this.deprov_id = deprov_id;
    }
    
}
