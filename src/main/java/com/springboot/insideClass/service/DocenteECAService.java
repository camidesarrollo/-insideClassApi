package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.DocenteECAEntity;
import com.springboot.insideClass.repository.DocenteECARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteECAService {
    @Autowired
    DocenteECARepository docenteECARepository;

    public DocenteECAEntity findAllFilter(long docenteeca_asignatura_docente_id,  long docenteeca_curso_establ_id){
        return docenteECARepository.findAllFilter(docenteeca_asignatura_docente_id, docenteeca_curso_establ_id);
    }


    public DocenteECAEntity save(DocenteECAEntity cursoMatriculaEntity) {
        return docenteECARepository.save(cursoMatriculaEntity);
    }
    public List<DocenteECAEntity> findByAsignaturaDocenteIdAndEstablId(long asignaturaDocenteId, long curso_establ_id) {
      return docenteECARepository.findByAsignaturaDocenteIdAndEstablId(asignaturaDocenteId, curso_establ_id);
    }
}
