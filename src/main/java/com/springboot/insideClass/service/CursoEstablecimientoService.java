package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.CursoEstablecimientoEntity;
import com.springboot.insideClass.payload.request.DocenteCursoRequest;
import com.springboot.insideClass.repository.CursoEstablecimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CursoEstablecimientoService {

    @Autowired
    CursoEstablecimientoRepository cursoEstablecimientoRepository;

    public List<CursoEstablecimientoEntity> findAll() {

        return cursoEstablecimientoRepository.findAll();
    }

    public List<CursoEstablecimientoEntity> findAllFilter(long curso_establ_id, Date curso_establ_fecha_fin,
                                                                 Date curso_establ_fecha_inicio, String dia,
                                                                 String hora_fin, String hora_inicio, boolean vigencia,
                                                                 long curso_establ_curso_id, long curso_establ_establ_id) {

        return cursoEstablecimientoRepository.findAllFilter(curso_establ_id, curso_establ_fecha_fin,
                curso_establ_fecha_inicio, dia, hora_fin, hora_inicio, vigencia, curso_establ_curso_id,
                curso_establ_establ_id);
    }


    public CursoEstablecimientoEntity findCursoEstablecimientoByCursoAndEstablecimiento(long curso,
                                                                                        long id_establecimiento,
                                                                                        Integer fecha_inicio,
                                                                                        Integer fecha_fin){
        System.out.println(curso + " - " + id_establecimiento + " - " + fecha_inicio + " - " + fecha_fin);
        System.out.println("SELECT * FROM t_curso_establ " +
                "WHERE (t_curso_establ.curso_establ_curso_id = "+curso+" or -1 = "+curso+" ) " +
                "AND (t_curso_establ.curso_establ_establ_id = "+id_establecimiento+"  or -1 = "+id_establecimiento+") " +
                "AND t_curso_establ.vigencia =  1"+
                "AND YEAR(curso_establ_fecha_fin) ="+fecha_inicio +
                "AND YEAR(curso_establ_fecha_inicio) = "+fecha_fin );

        List<CursoEstablecimientoEntity> cursoEsta = cursoEstablecimientoRepository.findCursoEstablecimientoByCursoAndEstablecimiento(
                curso,
                id_establecimiento,
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
            return cursoEstablecimientoRepository.findCursoEstablecimientoByCursoAndEstablecimiento(curso, id_establecimiento, fecha_fin);
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

    public static boolean validarCursoEstablecimiento(DocenteCursoRequest docenteCursoRequest) {
        if (docenteCursoRequest != null) {
            System.out.println("docente_curso_fecha_inicio: " + docenteCursoRequest.getDocente_curso_fecha_inicio());
            System.out.println("docente_curso_fecha_fin: " + docenteCursoRequest.getDocente_curso_fecha_fin());
            System.out.println("curso_establ_hora_inicio: " + docenteCursoRequest.getCurso_establ_hora_inicio());
            System.out.println("curso_establ_hora_fin: " + docenteCursoRequest.getCurso_establ_hora_fin());
            System.out.println("dia: " + docenteCursoRequest.getDia());

            return !docenteCursoRequest.getCurso_establ_hora_inicio().isEmpty() ||
                    !docenteCursoRequest.getCurso_establ_hora_fin().isEmpty() ||
                    !docenteCursoRequest.getDia().isEmpty();
        } else {
            System.out.println("docenteCursoRequest es nulo.");
            return false;
        }
    }


}
