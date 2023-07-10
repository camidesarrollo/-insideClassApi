package com.springboot.insideClass.payload.request.Horario;

public class CrearHorarioRequest {

    String Dia;
    String Hora_inicio;
    String Hora_fin;

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
}
