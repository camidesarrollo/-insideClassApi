package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PerfilEntity;
import com.springboot.insideClass.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

        public List<PerfilEntity> obtenerTodosLosPerfiles() {
            return perfilRepository.findAll();
        }

        public Optional<PerfilEntity> obtenerPerfilPorId(Long id) {
            return perfilRepository.findById(id);
        }

        public List<PerfilEntity> obtenerPerfilesPorFiltro(Long perfil_id, String perfil_nombre) {
            return perfilRepository.findByFilters(perfil_id, perfil_nombre);
        }

        public PerfilEntity guardarPerfil(PerfilEntity perfil) {
            return perfilRepository.save(perfil);
        }

        public void eliminarPerfil(Long id) {
            perfilRepository.deleteById(id);
        }



}
