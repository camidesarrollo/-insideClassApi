package com.springboot.insideClass.payload.request.Sostenedor;

public class BuscarSostenedorRequest {



    Long sostenedor_id;

    Long sostenedor_representante_legal_id;

    String sostenedor_nombre;

    public Long getSostenedor_id() {
        return sostenedor_id;
    }

    public void setSostenedor_id(Long sostenedor_id) {
        this.sostenedor_id = sostenedor_id;
    }

    public Long getSostenedor_representante_legal_id() {
        return sostenedor_representante_legal_id;
    }

    public void setSostenedor_representante_legal_id(Long sostenedor_representante_legal_id) {
        this.sostenedor_representante_legal_id = sostenedor_representante_legal_id;
    }

    public String getSostenedor_nombre() {
        return sostenedor_nombre;
    }

    public void setSostenedor_nombre(String sostenedor_nombre) {
        this.sostenedor_nombre = sostenedor_nombre;
    }
}
