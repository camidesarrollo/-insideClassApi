package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DepartamentosProvincialesEntity;
import com.springboot.insideClass.repository.DepartamentoProvincialesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoProvincialesService {

    @Autowired
    DepartamentoProvincialesRepository departamentoProvincialesRepository;

    public List<DepartamentosProvincialesEntity> obtenerTodosLosDepartamentosProvinciales() {
        return departamentoProvincialesRepository.findAll();
    }

    public Optional<DepartamentosProvincialesEntity> obtenerDepartamentoProvincialPorId(Long id) {
        return departamentoProvincialesRepository.findById(id);
    }

    public List<DepartamentosProvincialesEntity> obtenerDepartamentosProvincialesPorFiltro(Long departamentos_provinciales_id, String departamentos_provinciales_correo,
                                                                                           String departamentos_provinciales_direccion, String departamentos_provinciales_responsable) {
        return departamentoProvincialesRepository.findByFilters(departamentos_provinciales_id, departamentos_provinciales_correo,
                departamentos_provinciales_direccion, departamentos_provinciales_responsable);
    }

    public DepartamentosProvincialesEntity guardarDepartamentoProvincial(DepartamentosProvincialesEntity departamentoProvincial) {
        return departamentoProvincialesRepository.save(departamentoProvincial);
    }

    public void eliminarDepartamentoProvincial(Long id) {
        departamentoProvincialesRepository.deleteById(id);
    }
}
