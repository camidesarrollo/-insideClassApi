package com.springboot.insideClass.service;

import com.springboot.insideClass.payload.response.Mensaje.ObtenerUltimoMensajeGrupoResponse;
import com.springboot.insideClass.repository.MensajeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class MensajeService {

    @Autowired
    private MensajeriaRepository mensajeriaRepository;

    public List<ObtenerUltimoMensajeGrupoResponse> obtenerUltimoMensajeGrupo(String run) {

        List<ObtenerUltimoMensajeGrupoResponse> listaMensaje = new ArrayList<>();

        List<Object> listaObjetosNativos = mensajeriaRepository.findUltimoMensajeGrupoMensaje(run);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;

            ObtenerUltimoMensajeGrupoResponse infoMatricula = new ObtenerUltimoMensajeGrupoResponse();
            infoMatricula.setNombre_grupo(fila[0] != null ? (String) fila[0] : "");
            infoMatricula.setUltimo_mensaje(fila[1] != null ? (String) fila[1] : "");
            infoMatricula.setFecha_envio((Timestamp) fila[2]);

            listaMensaje.add(infoMatricula);
        }

        return listaMensaje;
    }
}
