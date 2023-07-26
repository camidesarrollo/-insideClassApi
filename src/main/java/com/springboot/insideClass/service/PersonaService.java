package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.PersonaEntity;
import com.springboot.insideClass.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepo;

    public List<PersonaEntity> obtenerPersonasPorFiltro(String persona_run, String persona_nombre,
                                                        String persona_apellido_paterno, String persona_apellido_materno,
                                                        String persona_fecha_nacimiento, String persona_sexo,
                                                        String persona_numero_telefonico, String persona_numero_celular) {

        System.out.println("SELECT p.* FROM t_persona p WHERE " +
                "(:persona_run = '-1' OR p.persona_run = "+persona_run+") " +
                "AND (:persona_apellido_materno  = '-1' OR p.persona_apellido_materno = "+persona_apellido_materno+") " +
                "AND (:persona_apellido_paterno  = '-1' OR p.persona_apellido_paterno = "+persona_apellido_paterno+") " +
                "AND (ISDATE("+persona_fecha_nacimiento+") = 1 AND (p.persona_fecha_nacimiento <= TRY_CONVERT(DATETIME2, "+persona_fecha_nacimiento+") OR :persona_fecha_nacimiento = '-1')) " +
                "AND (:persona_nombre  = '-1'  OR p.persona_nombre = "+persona_nombre+") " +
                "AND (:persona_numero_celular  = '-1'  OR p.persona_numero_celular = "+persona_numero_celular+") " +
                "AND (:persona_numero_telefonico = '-1'  OR p.persona_numero_telefonico ="+persona_numero_telefonico+") " +
                "AND (:persona_sexo  = '-1'  OR p.persona_sexo = "+persona_sexo+")");
        return personaRepo.findByFilters(persona_run, persona_apellido_materno, persona_apellido_paterno, persona_fecha_nacimiento,  persona_nombre,  persona_numero_celular, persona_numero_telefonico, persona_sexo);
    }

    public PersonaEntity guardarPersona(PersonaEntity persona) {
        return personaRepo.save(persona);
    }

    public Optional<PersonaEntity> obtenerPersonaPorId(String id) {
        return personaRepo.findById(id);
    }

    public List<PersonaEntity> obtenerTodasLasPersonas() {
        return personaRepo.findAll();
    }

    public void eliminarPersona(String id) {
        personaRepo.deleteById(id);
    }

    public List<PersonaEntity> buscarAlumnosPorApoderado(String apoderado_run, Boolean matricula_vigencia, String establ_id){

        try{
            return personaRepo.findAlumnosByApoderado(apoderado_run, matricula_vigencia, establ_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public List<PersonaEntity> buscarAlumnosPorCursoEstablecimiento(Boolean matricula_vigencia,Long curso_establecimiento_establecimiento_id,
                                                                    Long curso_establecimiento_curso_id){

        try{
            return personaRepo.findAlumnosByCursoEstablecimiento(matricula_vigencia, curso_establecimiento_establecimiento_id, curso_establecimiento_curso_id);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }


}
