package com.springboot.insideClass.controllers;

import com.springboot.insideClass.componet.Predicciones;
import com.springboot.insideClass.payload.response.AlumnoInfoResponse;
import com.springboot.insideClass.payload.response.AnotacionInfoResponse;
import com.springboot.insideClass.service.AnotacionesService;
import com.springboot.insideClass.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/predicciones")
public class PrediccionController {


    @Autowired
    private Predicciones predicciones;

    @Autowired
    private AnotacionesService anotacionesService;

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping("/Get")
    public String predecirComportamiento(@RequestParam("alumnoId") String alumnoId) throws Exception {
      /*  try {


            return comportamiento;
        } catch (Exception e) {
            // Manejo de errores
            return "Error en la predicción: " + e.getMessage();
        }*/

        // Obtener los atributos necesarios para la predicción
        double[] atributos = {/* Valores de los atributos */};

        // Llamar al servicio de predicción
       /* String comportamiento = prediccionService.predecirComportamiento(alumnoId, atributos);*/
        List<AnotacionInfoResponse> comportamientos = anotacionesService.obtenerInfoAnotaciones("-1", -1L, -1L, -1L, "-1");
        List<AlumnoInfoResponse> alumnoInfoResponses = matriculaService.getInfoAlumno(-1L, "-1", -1, -1, "-1");
        predicciones.calcularFrecuenciaPorFecha(comportamientos);
        predicciones.calcularDistribucionGravedad(comportamientos);
        predicciones.analizarRelacion(comportamientos);
        predicciones.calcularDistribucion(comportamientos);
        predicciones.calcularProporcion(comportamientos);
        predicciones.calcularFrecuencia(comportamientos);
        predicciones.calcularPromedio(comportamientos, alumnoInfoResponses);
        predicciones.calcularDistribucionAnotacionesPorDiaSemana(comportamientos);
        predicciones.analizarRelacionGravedadDocente(comportamientos);
        predicciones.encontrarAsignaturaConMasAnotaciones(comportamientos);
        return "OK";
    }
}
