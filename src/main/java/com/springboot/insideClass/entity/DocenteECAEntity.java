package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_DocenteECA", uniqueConstraints = {@UniqueConstraint(columnNames =  "DocenteECA_id")})
public class DocenteECAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long DocenteECA_id;


    @ManyToOne(optional = false)
    @JoinColumn(name = "docenteECA_curso_establ_id", nullable = false)
    CursoEstablecimientoEntity cursoEstablecimientoEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "docenteECA_asignaturaDocente_id", nullable = false)
    AsignaturaDocenteEntity asignaturaDocenteEntity;

    Boolean docente_jefe;

    public DocenteECAEntity(){

    }

    public DocenteECAEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity, AsignaturaDocenteEntity asignaturaDocenteEntity, Boolean docente_jefe) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
        this.docente_jefe = docente_jefe;
    }

    public CursoEstablecimientoEntity getCursoEstablecimientoEntity() {
        return cursoEstablecimientoEntity;
    }

    public void setCursoEstablecimientoEntity(CursoEstablecimientoEntity cursoEstablecimientoEntity) {
        this.cursoEstablecimientoEntity = cursoEstablecimientoEntity;
    }

    public AsignaturaDocenteEntity getAsignaturaDocenteEntity() {
        return asignaturaDocenteEntity;
    }

    public void setAsignaturaDocenteEntity(AsignaturaDocenteEntity asignaturaDocenteEntity) {
        this.asignaturaDocenteEntity = asignaturaDocenteEntity;
    }

    public Long getDocenteECA_id() {
        return DocenteECA_id;
    }

    public void setDocenteECA_id(Long docenteECA_id) {
        DocenteECA_id = docenteECA_id;
    }

    public Boolean getDocente_jefe() {
        return docente_jefe;
    }

    public void setDocente_jefe(Boolean docente_jefe) {
        this.docente_jefe = docente_jefe;
    }
}
