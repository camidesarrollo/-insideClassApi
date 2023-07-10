package com.springboot.insideClass.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_HORARIO", uniqueConstraints = {@UniqueConstraint(columnNames =  "horario_id")})
public class HorarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long horario_id;

    String Dia;

    String Hora_inicio;

    String Hora_fin;

    @ManyToOne(optional = false)
    @JoinColumn(name = "dace_id", nullable = false)
    Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity;

    public HorarioEntity(String dia, String hora_inicio, String hora_fin, Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity) {
        Dia = dia;
        Hora_inicio = hora_inicio;
        Hora_fin = hora_fin;
        this.docente_asignatura_curso_establecimientoEntity = docente_asignatura_curso_establecimientoEntity;
    }

    public Long getHorario_id() {
        return horario_id;
    }

    public void setHorario_id(Long horario_id) {
        this.horario_id = horario_id;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getHora_inicio() {
        return Hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        Hora_inicio = hora_inicio;
    }

    public String getHora_fin() {
        return Hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        Hora_fin = hora_fin;
    }

    public Docente_Asignatura_Curso_EstablecimientoEntity getDocente_asignatura_curso_establecimientoEntity() {
        return docente_asignatura_curso_establecimientoEntity;
    }

    public void setDocente_asignatura_curso_establecimientoEntity(Docente_Asignatura_Curso_EstablecimientoEntity docente_asignatura_curso_establecimientoEntity) {
        this.docente_asignatura_curso_establecimientoEntity = docente_asignatura_curso_establecimientoEntity;
    }
}
