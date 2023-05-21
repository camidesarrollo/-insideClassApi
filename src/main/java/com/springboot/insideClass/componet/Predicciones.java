package com.springboot.insideClass.componet;


import com.springboot.insideClass.payload.response.AlumnoInfoResponse;
import com.springboot.insideClass.payload.response.AnotacionInfoResponse;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Predicciones {


    //¿Cuál es la frecuencia de anotaciones por fecha en un curso?  -->
    public Map<String, Integer> calcularFrecuenciaPorFecha(List<AnotacionInfoResponse> anotaciones) {
        Map<String, Integer> frecuenciaPorFecha = new HashMap<>();

        for (AnotacionInfoResponse anotacion : anotaciones) {
            String fecha = anotacion.getFecha();

            if (frecuenciaPorFecha.containsKey(fecha)) {
                int frecuencia = frecuenciaPorFecha.get(fecha);
                frecuenciaPorFecha.put(fecha, frecuencia + 1);
            } else {
                frecuenciaPorFecha.put(fecha, 1);
            }
        }

        return frecuenciaPorFecha;
    }
//¿Cuál es la distribución de la gravedad de las anotaciones?
    public Map<String, Integer> calcularDistribucionGravedad(List<AnotacionInfoResponse> anotaciones) {
        Map<String, Integer> frecuenciaGravedad = new HashMap<>();

        // Recorrer las anotaciones y contar las frecuencias
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String gravedad = anotacion.getGravedad();
            if (frecuenciaGravedad.containsKey(gravedad)) {
                int contador = frecuenciaGravedad.get(gravedad);
                frecuenciaGravedad.put(gravedad, contador + 1);
            } else {
                frecuenciaGravedad.put(gravedad, 1);
            }
        }

        return frecuenciaGravedad;
    }
//¿Existe alguna relación entre la gravedad de las anotaciones y el sexo de la persona involucrada?
    public void analizarRelacion(List<AnotacionInfoResponse> anotaciones) {
        // Crear mapas para almacenar la frecuencia de gravedad por sexo
        Map<String, Integer> gravedadMasculino = new HashMap<>();
        Map<String, Integer> gravedadFemenino = new HashMap<>();

        // Inicializar los mapas
        inicializarMapaGravedad(gravedadMasculino);
        inicializarMapaGravedad(gravedadFemenino);

        // Calcular la distribución de gravedad por sexo
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String gravedad = anotacion.getGravedad();
            String sexo = anotacion.getPersonaSexo();

            if (sexo.equalsIgnoreCase("M")) {
                incrementarFrecuencia(gravedadMasculino, gravedad);
            } else if (sexo.equalsIgnoreCase("F")) {
                incrementarFrecuencia(gravedadFemenino, gravedad);
            }
        }

        // Imprimir los resultados
        System.out.println("Distribución de gravedad por sexo (Masculino):");
        imprimirDistribucion(gravedadMasculino);

        System.out.println("\nDistribución de gravedad por sexo (Femenino):");
        imprimirDistribucion(gravedadFemenino);
    }
//¿Cuál es la distribución de anotaciones por curso?
    public void calcularDistribucion(List<AnotacionInfoResponse> anotaciones) {
        // Crear mapa para almacenar la frecuencia de anotaciones por curso
        Map<String, Integer> distribucion = new HashMap<>();

        // Calcular la distribución de anotaciones por curso
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String curso = anotacion.getCursoId();

            if (distribucion.containsKey(curso)) {
                int frecuencia = distribucion.get(curso);
                distribucion.put(curso, frecuencia + 1);
            } else {
                distribucion.put(curso, 1);
            }
        }

        // Imprimir los resultados
        System.out.println("Distribución de anotaciones por curso:");
        for (Map.Entry<String, Integer> entry : distribucion.entrySet()) {
            String curso = entry.getKey();
            int frecuencia = entry.getValue();

            System.out.println(curso + ": " + frecuencia);
        }
    }
//¿Cuál es la proporción de anotaciones realizadas por cada docente?
    public void calcularProporcion(List<AnotacionInfoResponse> anotaciones) {
        // Crear mapa para almacenar la cantidad de anotaciones por docente
        Map<String, Integer> cantidadPorDocente = new HashMap<>();

        // Calcular la cantidad de anotaciones por docente
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String docente = anotacion.getDocenteRun();

            if (cantidadPorDocente.containsKey(docente)) {
                int cantidad = cantidadPorDocente.get(docente);
                cantidadPorDocente.put(docente, cantidad + 1);
            } else {
                cantidadPorDocente.put(docente, 1);
            }
        }

        // Calcular la proporción de anotaciones por docente
        Map<String, Double> proporcionPorDocente = new HashMap<>();
        int totalAnotaciones = anotaciones.size();
        for (Map.Entry<String, Integer> entry : cantidadPorDocente.entrySet()) {
            String docente = entry.getKey();
            int cantidad = entry.getValue();
            double proporcion = (double) cantidad / totalAnotaciones;
            proporcionPorDocente.put(docente, proporcion);
        }

        // Imprimir los resultados
        System.out.println("Proporción de anotaciones por docente:");
        for (Map.Entry<String, Double> entry : proporcionPorDocente.entrySet()) {
            String docente = entry.getKey();
            double proporcion = entry.getValue();

            System.out.println(docente + ": " + proporcion);
        }
    }

//¿Cuáles son las asignaturas más frecuentes en las anotaciones?
    public void calcularFrecuencia(List<AnotacionInfoResponse> anotaciones) {
        // Crear mapa para almacenar la frecuencia de las asignaturas
        Map<String, Integer> frecuenciaAsignaturas = new HashMap<>();

        // Calcular la frecuencia de las asignaturas en las anotaciones
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String asignatura = anotacion.getAsignaturaId();

            if (frecuenciaAsignaturas.containsKey(asignatura)) {
                int frecuencia = frecuenciaAsignaturas.get(asignatura);
                frecuenciaAsignaturas.put(asignatura, frecuencia + 1);
            } else {
                frecuenciaAsignaturas.put(asignatura, 1);
            }
        }

        // Encontrar las asignaturas más frecuentes
        int maxFrecuencia = 0;
        List<String> asignaturasFrecuentes = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frecuenciaAsignaturas.entrySet()) {
            String asignatura = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                asignaturasFrecuentes.clear();
                asignaturasFrecuentes.add(asignatura);
            } else if (frecuencia == maxFrecuencia) {
                asignaturasFrecuentes.add(asignatura);
            }
        }

        // Imprimir los resultados
        System.out.println("Asignaturas más frecuentes en las anotaciones:");
        for (String asignatura : asignaturasFrecuentes) {
            System.out.println(asignatura);
        }
    }

    //¿Cuál es el promedio de anotaciones por alumno en cada colegio?
    public void calcularPromedio(List<AnotacionInfoResponse> anotaciones, List<AlumnoInfoResponse> alumnos) {
        // Crear mapa para almacenar la cantidad de anotaciones por alumno en cada curso
        Map<String, Map<String, Integer>> cantidadPorAlumnoYCurso = new HashMap<>();

        // Calcular la cantidad de anotaciones por alumno en cada curso
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String alumnoId = anotacion.getPersonaRun();
            String cursoId = anotacion.getCursoId();

            if (cantidadPorAlumnoYCurso.containsKey(alumnoId)) {
                Map<String, Integer> cantidadPorCurso = cantidadPorAlumnoYCurso.get(alumnoId);

                if (cantidadPorCurso.containsKey(cursoId)) {
                    int cantidad = cantidadPorCurso.get(cursoId);
                    cantidadPorCurso.put(cursoId, cantidad + 1);
                } else {
                    cantidadPorCurso.put(cursoId, 1);
                }
            } else {
                Map<String, Integer> cantidadPorCurso = new HashMap<>();
                cantidadPorCurso.put(cursoId, 1);
                cantidadPorAlumnoYCurso.put(alumnoId, cantidadPorCurso);
            }
        }

        // Calcular el promedio de anotaciones por alumno en cada curso y mostrar los resultados
        System.out.println("Promedio de anotaciones por alumno en cada curso:");
        for (AlumnoInfoResponse alumno : alumnos) {
            String alumnoId = alumno.getAlumno_rut();
            String nombreAlumno = alumno.getAlumno_nombre();

            if (cantidadPorAlumnoYCurso.containsKey(alumnoId)) {
                Map<String, Integer> cantidadPorCurso = cantidadPorAlumnoYCurso.get(alumnoId);

                for (Map.Entry<String, Integer> entry : cantidadPorCurso.entrySet()) {
                    String cursoId = entry.getKey();
                    int cantidadAnotaciones = entry.getValue();

                    System.out.println("Alumno: " + nombreAlumno + ", Curso: " + cursoId + ", Promedio: " + (double) cantidadAnotaciones / alumnos.size());
                }
            }
        }
    }
//¿Cuál es la distribución de anotaciones por día de la semana?
    public void calcularDistribucionAnotacionesPorDiaSemana (List<AnotacionInfoResponse> anotaciones) {
        // Crear mapa para almacenar la cantidad de anotaciones por día de la semana
        Map<DayOfWeek, Integer> distribucionPorDiaSemana = new HashMap<>();

        // Inicializar el mapa con valores de cero para cada día de la semana
        for (DayOfWeek diaSemana : DayOfWeek.values()) {
            distribucionPorDiaSemana.put(diaSemana, 0);
        }

        // Calcular la distribución de anotaciones por día de la semana
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String fechaStr = anotacion.getFecha();
            LocalDate fecha = LocalDate.parse(fechaStr);
            DayOfWeek diaSemana = fecha.getDayOfWeek();

            // Incrementar la cantidad de anotaciones para el día de la semana correspondiente
            int cantidad = distribucionPorDiaSemana.get(diaSemana);
            distribucionPorDiaSemana.put(diaSemana, cantidad + 1);
        }

        // Mostrar los resultados
        System.out.println("Distribución de anotaciones por día de la semana:");
        for (Map.Entry<DayOfWeek, Integer> entry : distribucionPorDiaSemana.entrySet()) {
            DayOfWeek diaSemana = entry.getKey();
            int cantidadAnotaciones = entry.getValue();

            System.out.println("Día de la semana: " + diaSemana + ", Cantidad de anotaciones: " + cantidadAnotaciones);
        }
    }
//¿Existe alguna relación entre la gravedad de las anotaciones y el docente responsable?
    public void analizarRelacionGravedadDocente (List<AnotacionInfoResponse> anotaciones) {
        Map<String, Integer> gravedadCount = new HashMap<>();
        Map<String, Map<String, Integer>> gravedadByDocenteCount = new HashMap<>();

        // Contar la frecuencia de gravedad por docente
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String gravedad = anotacion.getGravedad();
            String docente = anotacion.getDocenteRun();

            // Contar la frecuencia de gravedad en general
            gravedadCount.put(gravedad, gravedadCount.getOrDefault(gravedad, 0) + 1);

            // Contar la frecuencia de gravedad por docente
            if (gravedadByDocenteCount.containsKey(docente)) {
                Map<String, Integer> gravedadMap = gravedadByDocenteCount.get(docente);
                gravedadMap.put(gravedad, gravedadMap.getOrDefault(gravedad, 0) + 1);
            } else {
                Map<String, Integer> gravedadMap = new HashMap<>();
                gravedadMap.put(gravedad, 1);
                gravedadByDocenteCount.put(docente, gravedadMap);
            }
        }

        // Calcular el test de chi-cuadrado para determinar la relación
        for (String docente : gravedadByDocenteCount.keySet()) {
            System.out.println("Docente: " + docente);

            Map<String, Integer> gravedadMap = gravedadByDocenteCount.get(docente);
            int numGravedades = gravedadCount.size();
            int numDocentes = gravedadByDocenteCount.size();

            double[][] observed = new double[numGravedades][numDocentes];
            double[][] expected = new double[numGravedades][numDocentes];

            int i = 0;
            for (String gravedad : gravedadCount.keySet()) {
                int j = 0;
                for (String doc : gravedadByDocenteCount.keySet()) {
                    observed[i][j] = gravedadMap.getOrDefault(gravedad, 0);
                    expected[i][j] = (double) gravedadCount.get(gravedad) * gravedadByDocenteCount.get(doc).size() / anotaciones.size();
                    j++;
                }
                i++;
            }

            double chiSquare = calculateChiSquare(observed, expected);
            double pValue = calculatePValue(chiSquare, numGravedades - 1, numDocentes - 1);

            System.out.println("Chi-square value: " + chiSquare);
            System.out.println("p-value: " + pValue);

            if (pValue < 0.05) {
                System.out.println("Existe una relación significativa entre la gravedad de las anotaciones y el docente responsable.");
            } else {
                System.out.println("No se encontró evidencia suficiente para afirmar una relación significativa entre la gravedad de las anotaciones y el docente responsable.");
            }
        }
    }

    //¿Cuál es la asignatura con mayor cantidad de anotaciones por docente?
    public void encontrarAsignaturaConMasAnotaciones(List<AnotacionInfoResponse> anotaciones) {
        Map<String, Map<String, Integer>> conteoAnotaciones = new HashMap<>();

        // Realizar conteo de anotaciones por asignatura y docente
        for (AnotacionInfoResponse anotacion : anotaciones) {
            String asignatura = anotacion.getAsignaturaId();
            String docente = anotacion.getDocenteRun();

            if (!conteoAnotaciones.containsKey(asignatura)) {
                conteoAnotaciones.put(asignatura, new HashMap<>());
            }

            Map<String, Integer> conteoDocentes = conteoAnotaciones.get(asignatura);
            conteoDocentes.put(docente, conteoDocentes.getOrDefault(docente, 0) + 1);
        }

        // Encontrar la combinación de asignatura y docente con más anotaciones
        int maxAnotaciones = 0;
        String asignaturaMasAnotaciones = "";
        String docenteMasAnotaciones = "";

        for (String asignatura : conteoAnotaciones.keySet()) {
            Map<String, Integer> conteoDocentes = conteoAnotaciones.get(asignatura);
            for (String docente : conteoDocentes.keySet()) {
                int _anotaciones = conteoDocentes.get(docente);
                if (_anotaciones > maxAnotaciones) {
                    maxAnotaciones = _anotaciones;
                    asignaturaMasAnotaciones = asignatura;
                    docenteMasAnotaciones = docente;
                }
            }
        }

        System.out.println("La asignatura con mayor cantidad de anotaciones por docente es: " + asignaturaMasAnotaciones);
        System.out.println("Docente responsable: " + docenteMasAnotaciones);
        System.out.println("Cantidad de anotaciones: " + maxAnotaciones);
    }


    // Método para calcular el valor del chi-cuadrado
    private double calculateChiSquare(double[][] observed, double[][] expected) {
        double chiSquare = 0.0;
        for (int i = 0; i < observed.length; i++) {
            for (int j = 0; j < observed[i].length; j++) {
                chiSquare += Math.pow(observed[i][j] - expected[i][j], 2) / expected[i][j];
            }
        }
        return chiSquare;
    }

    // Método para calcular el valor p
    private double calculatePValue(double chiSquare, int df1, int df2) {
        // En este ejemplo, no estamos utilizando una tabla de distribución chi-cuadrado,
        // sino que estamos calculando un p-value aproximado utilizando la distribución normal
        double pValue = 1 - Math.exp(-0.5 * chiSquare);

        return pValue;
    }

    private void inicializarMapaGravedad(Map<String, Integer> gravedadMap) {
        gravedadMap.put("Muy Positiva", 0);
        gravedadMap.put("Muy Negativa", 0);
        gravedadMap.put("Positiva", 0);
        gravedadMap.put("Regular", 0);
        gravedadMap.put("Negativa", 0);
    }

    private void incrementarFrecuencia(Map<String, Integer> gravedadMap, String gravedad) {
        int frecuencia = gravedadMap.get(gravedad);
        gravedadMap.put(gravedad, frecuencia + 1);
    }

    private void imprimirDistribucion(Map<String, Integer> gravedadMap) {
        int total = 0;

        for (int frecuencia : gravedadMap.values()) {
            total += frecuencia;
        }

        for (Map.Entry<String, Integer> entry : gravedadMap.entrySet()) {
            String gravedad = entry.getKey();
            int frecuencia = entry.getValue();
            double porcentaje = (frecuencia / (double) total) * 100;

            System.out.println(gravedad + ": " + frecuencia + " (" + porcentaje + "%)");
        }
    }


}
