package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.repository.DocenteRepository;
import com.springboot.insideClass.repository.EstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstablecimientoService {

    @Autowired
    EstablecimientoRepository establecimientoRepository;

    @Autowired
    DocenteRepository docenteRepository;

    @Autowired
    MatriculaService matriculaService;


    @Autowired
    PerfilService perfilService;

    public EstablecimientoEntity findEstablecimientoById(Long id){

        try{
            return establecimientoRepository.findEstablecimientoById(id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public  List<EstablecimientoEntity> findEstablecimientoByUsuarioPerfil(long establemiento, String run, long curso, String perfil){
        try{
            List<EstablecimientoEntity> establecimientos = new ArrayList<>();
            PerfilEntity perfil1 = perfilService.findByName(perfil);
            System.out.println(perfil1.getPerfil_id());
            if("Docente".equals(perfil1.getPerfil_nombre())){
                var listaObjetosNativos =  docenteRepository.getInfoDocente(establemiento,run, curso);
                System.out.println(listaObjetosNativos.size());
                Object[] fila;
                for (Object item : listaObjetosNativos) {
                    EstablecimientoEntity establecimiento = new EstablecimientoEntity();

                    fila = (Object[]) item;
                  /*  for(var i = 0; i<= fila.length; i++){
                        System.out.println("El indice es " + i + "y el valor es: " + fila[i].toString());
                    }*/

                    establecimiento.setEstabl_id(Long.parseLong(fila[9].toString()));
                    establecimiento.setEstabl_cod_area(Long.parseLong(fila[10].toString()));
                    establecimiento.setEstabl_nombre(fila[11].toString());
                    establecimientos.add(establecimiento);
                }
            }

            if("Apoderado".equals(perfil1.getPerfil_nombre())){
                var listaObjetosNativos =  matriculaService.getInfoAlumno(establemiento,"-1", curso, 1, run);

                Object[] fila;
                for (Object item : listaObjetosNativos) {
                    EstablecimientoEntity establecimiento = new EstablecimientoEntity();
                    fila = (Object[]) item;
                    establecimiento.setEstabl_id(Long.parseLong(fila[14].toString()));
                    establecimiento.setEstabl_cod_area(Long.parseLong(fila[16].toString()));
                    establecimiento.setEstabl_nombre(fila[9].toString());

                    establecimientos.add(establecimiento);

                }
            }

            if("Director".equals(perfil1.getPerfil_nombre())){
                establecimientos =  establecimientoRepository.findEstablecimientoByDirector(run);
            }

            return establecimientos;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
