package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.MensajeEntity;
import com.springboot.insideClass.payload.response.Mensaje.ObtenerMensajeByRemitenteDestinatarioResponse;
import com.springboot.insideClass.payload.response.Mensaje.ObtenerUltimoMensajeGrupoResponse;
import com.springboot.insideClass.payload.response.Persona.PersonaMensaje;
import com.springboot.insideClass.repository.MensajeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
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

    public List<PersonaMensaje> obtenerDocenteByEstablecimientoCursoMensaje(String persona_run,
                                                                    Long establecimiento_id,
                                                                    Long curso_id, Long docente_id) {

        List<PersonaMensaje> listaMensaje = new ArrayList<>();

        List<Object> listaObjetosNativos = mensajeriaRepository.findDocenteByEstablecimientoCursoMensaje(
                persona_run,
                establecimiento_id,
                curso_id,  docente_id);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;
            PersonaMensaje info = new PersonaMensaje(
                    fila[0] != null ? (String) fila[0] : "",
                    fila[1] != null ? (String) fila[1] : "",
                    fila[2] != null ? (String) fila[2] : "",
                    fila[3] != null ? (String) fila[3] : "",
                    fila[4] != null ? (Integer) fila[4] : 0
            );

            listaMensaje.add(info);
        }

        return listaMensaje;
    }

    public List<ObtenerMensajeByRemitenteDestinatarioResponse> ObtenerMensajeByRemitenteDestinatario(String r_persona_run, String d_persona_run) {

        List<ObtenerMensajeByRemitenteDestinatarioResponse> listaMensaje = new ArrayList<>();

        List<Object> listaObjetosNativos = mensajeriaRepository.findGetMensajeByRemitenteDestinatario(r_persona_run, d_persona_run);

        for (Object item : listaObjetosNativos) {
            Object[] fila = (Object[]) item;
            ObtenerMensajeByRemitenteDestinatarioResponse info = new ObtenerMensajeByRemitenteDestinatarioResponse(
                    fila[0] != null ? ((BigInteger) fila[0] ).longValue(): 0L,
                    fila[1] != null ? ((BigInteger) fila[1] ).longValue(): 0L,
                    fila[2] != null ? (String) fila[2] : "",
                    fila[3] != null ? (Date) fila[3] : null,
                    fila[4] != null ? ((BigInteger) fila[4] ).longValue(): 0L,
                    fila[5] != null ? (String) fila[5] : "",
                    fila[6] != null ? ((BigInteger) fila[6] ).longValue(): 0L,
                    fila[7] != null ? (Date) fila[7] : null,
                    fila[8] != null ? (Boolean) fila[8] : false,
                    fila[9] != null ? (String) fila[9] : ""
            );
            listaMensaje.add(info);
        }

        return listaMensaje;
    }
    @Transactional
    public MensajeEntity saveMensaje(MensajeEntity mensaje) {
        return mensajeriaRepository.save(mensaje);
    }

    @Transactional
    public void deleteMensaje(Long mensajeId) {
        mensajeriaRepository.deleteById(mensajeId);
    }

    public MensajeEntity findById(Long mensajeId) {
        return mensajeriaRepository.findById(mensajeId).orElse(null);
    }

}

