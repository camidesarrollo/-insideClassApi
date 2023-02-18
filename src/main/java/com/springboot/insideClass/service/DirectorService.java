package com.springboot.insideClass.service;

import com.springboot.insideClass.payload.response.DireccionResponse;
import com.springboot.insideClass.payload.response.DirectorInfoResponse;
import com.springboot.insideClass.payload.response.EstablecimientoResponse;
import com.springboot.insideClass.payload.response.PersonaResponse;
import com.springboot.insideClass.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class DirectorService {

    @Autowired
    DirectorRepository directorRepository;

    public List<DirectorInfoResponse> findDirectorEstablecimientoByUsuario (Long id_usuario){
        try{
            System.out.println(id_usuario);
            List<Object> listaObjetosNativos =  directorRepository.findDirectorEstablecimientoByUsuario(id_usuario);
            List<DirectorInfoResponse> listaDirector =  new ArrayList<>();
            Object[] fila;
            for (Object item : listaObjetosNativos) {
                fila = (Object[]) item;
                System.out.println("Estamos iterando la lista");
                PersonaResponse personaResponse = new PersonaResponse((String) fila[4],
                        (String) fila[1],
                        (String) fila[2],
                        (Date) fila[3],
                        (Character) fila[7],
                        (String) fila[6],
                        (String) fila[5],
                        (String) fila[0]);

                EstablecimientoResponse establecimientoResponse = new EstablecimientoResponse(((BigInteger) fila[8]).toString(), (String) fila[9],((BigInteger) fila[10]).toString());

                DireccionResponse direccionResponse = new DireccionResponse();
                direccionResponse.setComuna_nombre((String) fila[11]);
                direccionResponse.setTipo_area_nombre((String) fila[12]);
                direccionResponse.setDireccion_calle((String) fila[13]);

                DirectorInfoResponse directorInfoResponse = new DirectorInfoResponse(personaResponse, establecimientoResponse, direccionResponse);
                System.out.println(directorInfoResponse);
                listaDirector.add(directorInfoResponse);

            }
            return listaDirector;


        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
