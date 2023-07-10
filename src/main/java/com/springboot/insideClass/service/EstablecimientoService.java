package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.repository.EstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstablecimientoService {

    @Autowired
    EstablecimientoRepository establecimientoRepository;

    @Autowired
    PerfilService perfilService;

    @Autowired
    DirectorService directorService;

    public List<EstablecimientoEntity> obtenerTodosLosEstablecimientos() {
        return establecimientoRepository.findAll();
    }

    public Optional<EstablecimientoEntity> obtenerEstablecimientoPorId(Long id) {
        return establecimientoRepository.findById(id);
    }

    public List<EstablecimientoEntity> obtenerEstablecimientoPorFiltro(Long establecimiento_id,
                                                                       Long establecimiento_codigo_area,
                                                                       String establecimiento_nombre,
                                                                       Long establecimiento_telefono,
                                                                       Long establecimiento_dependencia_id,
                                                                       Long establecimiento_direccion_id,
                                                                       Long establecimiento_sostenedor_id) {
        return establecimientoRepository.findByFilters(establecimiento_id, establecimiento_codigo_area,
                establecimiento_nombre, establecimiento_telefono, establecimiento_dependencia_id,
                establecimiento_direccion_id, establecimiento_sostenedor_id);
    }

    public EstablecimientoEntity guardarEstablecimiento(EstablecimientoEntity establecimiento) {
        return establecimientoRepository.save(establecimiento);
    }

    public void eliminarEstablecimiento(Long id) {
        establecimientoRepository.deleteById(id);
    }

    public  List<EstablecimientoEntity> findEstablecimientoByUsuarioPerfil(long establemiento, String run, long curso, String perfil){
        try{
            List<EstablecimientoEntity> establecimientos = new ArrayList<>();
            System.out.println(establemiento);
            System.out.println(run);
            System.out.println(curso);
            System.out.println(perfil);
            List<PerfilEntity> perfil1 = perfilService.obtenerPerfilesPorFiltro(-1L, perfil);
            if(perfil1.size() == 0){
                return establecimientos;
            }

            if("Docente".equals(perfil1.get(0).getPerfil_nombre())){
                return establecimientoRepository.findByDocente(run);
            }

            if("Apoderado".equals(perfil1.get(0).getPerfil_nombre())){

                return establecimientoRepository.findByApoderado(run, true);

            }

            if("Director".equals(perfil1.get(0).getPerfil_nombre())){
                return establecimientoRepository.findByDirector(-1L, run);
            }

            return establecimientos;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
