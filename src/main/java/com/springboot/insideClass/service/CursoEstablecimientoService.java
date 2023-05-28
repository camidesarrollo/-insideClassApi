package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoEstablecimientoService {

    @Autowired
    CursoEstablecimientoRepository cursoEstablecimientoRepository;
    public CursoEstablecimientoEntity findCursoEstablecimientoByCursoAndEstablecimiento(long curso,
                                                                                        long id_establecimiento,
                                                                                        Integer matricula,
                                                                                        Integer fecha_inicio,
                                                                                        Integer fecha_fin){
        System.out.println(curso + " - " + id_establecimiento + " - " + matricula + " - " + fecha_inicio + " - " + fecha_fin);
        System.out.println("SELECT * FROM t_curso_establ WHERE t_curso_establ.curso_establ_curso_id = " + curso +
                "         AND t_curso_establ.curso_establ_establ_id =  " + id_establecimiento +
                "          AND t_curso_establ.vigencia = 1 " +
                "            AND (t_curso_establ.curso_establ_matricula_id = "+ matricula+" OR "+ matricula+"   = -1) "  +
                "            AND YEAR(curso_establ_fecha_fin) = "  + fecha_fin +
                "         AND YEAR(curso_establ_fecha_inicio) = "  + fecha_inicio );

        List<CursoEstablecimientoEntity> cursoEsta = cursoEstablecimientoRepository.findCursoEstablecimientoByCursoAndEstablecimiento(
                curso,
                id_establecimiento,
                matricula, fecha_inicio,
                fecha_fin);
        System.out.println("oBTENIENDO LA CANTIDAD");
        System.out.println(cursoEsta.size());
        if(cursoEsta.size() > 0){
            return cursoEsta.get(0);
        }
        /*try{


        }catch (Exception e){
            System.out.println(e);
        }*/
        return null;
    }
    public List<CursoEstablecimientoEntity> findCursoEstablecimientosByCursoAndEstablecimientos(long curso, long id_establecimiento, Integer matricula,Integer fecha_inicio, Integer fecha_fin){

        try{
            return cursoEstablecimientoRepository.findCursoEstablecimientoByCursoAndEstablecimiento(curso, id_establecimiento, matricula, fecha_inicio, fecha_fin);
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public CursoEstablecimientoEntity findById(long id){
        try{
            return cursoEstablecimientoRepository.findById(id).get();
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

    public void save(CursoEstablecimientoEntity cursoEstablecimientoEntity){
        try{
            cursoEstablecimientoRepository.save(cursoEstablecimientoEntity);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
