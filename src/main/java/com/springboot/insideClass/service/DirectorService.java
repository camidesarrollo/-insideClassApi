package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DirectorEntity;
import com.springboot.insideClass.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {

    private final DirectorRepository directorRepo;

    @Autowired
    public DirectorService(DirectorRepository directorRepo) {
        this.directorRepo = directorRepo;
    }

    public DirectorEntity guardarDirector(DirectorEntity director) {
        return directorRepo.save(director);
    }

    public Optional<DirectorEntity> obtenerDirectorPorId(Long id) {
        return directorRepo.findById(id);
    }

    public List<DirectorEntity> obtenerTodosLosDirectores() {
        return directorRepo.findAll();
    }

    public void eliminarDirector(Long id) {
        directorRepo.deleteById(id);
    }

    // Agrega más funciones globales según tus necesidades

}
