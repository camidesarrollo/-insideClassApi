package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.ComunicacionesEntity;
import com.springboot.insideClass.payload.response.ComunicacionesInfoResponse;
import com.springboot.insideClass.repository.ComunicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class ComunicacionesService {

    @Autowired
    private ComunicacionesRepository comunicacionesRepository;
    public List<ComunicacionesInfoResponse> obtenerInfoComunicaciones(String personaRun, Long cursoId, Long establecimientoId, String fecha) {
        List<ComunicacionesInfoResponse> listaAnotacion = new ArrayList<>();
        try {
            System.out.println(personaRun);
            System.out.println(cursoId);
            System.out.println(establecimientoId);
            System.out.println(fecha);
            List<Object> listaObjetosNativos = comunicacionesRepository.fn_Comunicaciones(personaRun, cursoId, establecimientoId, fecha);

            Object[] fila;
            System.out.println(listaObjetosNativos.size());
            for (Object item : listaObjetosNativos) {
                ComunicacionesInfoResponse comunicacionesInfoResponse = new ComunicacionesInfoResponse();
                fila = (Object[]) item;

                // Establecer los valores correspondientes en el objeto ComunicacionesInfoResponse
                comunicacionesInfoResponse.setComunicacionesId(fila[0] != null ? ((BigInteger) fila[0]).toString() : "");
                comunicacionesInfoResponse.setDescripcion((String) fila[1]);
                comunicacionesInfoResponse.setFecha(fila[2] != null ? ((Date) fila[2]).toString() : "");
                comunicacionesInfoResponse.setTipo((String) fila[3]);
                comunicacionesInfoResponse.setCursoEstablId(fila[4] != null ? ((BigInteger) fila[4]).toString() : "");
                comunicacionesInfoResponse.setCursoId(fila[5] != null ? ((BigInteger) fila[5]).toString() : "");
                comunicacionesInfoResponse.setCursoNombre((String) fila[6]);
                comunicacionesInfoResponse.setPersonaRun((String) fila[7]);
                comunicacionesInfoResponse.setPersonaApellidoMaterno((String) fila[10]);
                comunicacionesInfoResponse.setPersonaApellidoPaterno((String) fila[9]);
                comunicacionesInfoResponse.setPersonaNombre((String) fila[8]);

                comunicacionesInfoResponse.setEstablNombre((String) fila[12]);


                listaAnotacion.add(comunicacionesInfoResponse);
            }

            System.out.println("obteniendo el count");
            System.out.println(listaAnotacion.stream().count());

            return listaAnotacion;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return listaAnotacion;
        }
    }

    public void save(ComunicacionesEntity comunicaciones){
        try{
            comunicacionesRepository.save(comunicaciones);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void delete(ComunicacionesEntity comunicaciones){
        try{
            comunicacionesRepository.delete(comunicaciones);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public ComunicacionesEntity findById(Long id){
        try{
            return comunicacionesRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;

    }

}
