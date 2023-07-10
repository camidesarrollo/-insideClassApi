package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.EstablecimientoEntity;
import com.springboot.insideClass.payload.request.Establecimiento.BuscarEstablecimientoPorPerfilRequest;
import com.springboot.insideClass.payload.request.Establecimiento.BuscarEstablecimientoRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.EstablecimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/establecimiento")
public class EstablecimientoController {

    @Autowired
    private EstablecimientoService establecimientoService;

    @PostMapping("/obtenerTodos")
    public List<EstablecimientoEntity> obtenerTodosLosEstablecimientos() {
        return establecimientoService.obtenerTodosLosEstablecimientos();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<EstablecimientoEntity> obtenerEstablecimientoPorId(@Valid @RequestBody Long id) {
        Optional<EstablecimientoEntity> establecimiento = establecimientoService.obtenerEstablecimientoPorId(id);
        if (establecimiento.isPresent()) {
            return ResponseEntity.ok(establecimiento.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<EstablecimientoEntity>> obtenerEstablecimientosPorFiltro(@Valid @RequestBody BuscarEstablecimientoRequest buscarEstablecimientoRequest) {
        List<EstablecimientoEntity> establecimientos = establecimientoService.obtenerEstablecimientoPorFiltro(
                buscarEstablecimientoRequest.getEstablecimiento_id(),
                buscarEstablecimientoRequest.getEstablecimiento_codigo_area(),
                buscarEstablecimientoRequest.getEstablecimiento_nombre(),
                buscarEstablecimientoRequest.getEstablecimiento_telefono(),
                buscarEstablecimientoRequest.getEstablecimiento_dependencia_id(),
                buscarEstablecimientoRequest.getEstablecimiento_direccion_id(),
                buscarEstablecimientoRequest.getEstablecimiento_sostenedor_id());

        if (establecimientos.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(establecimientos);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<EstablecimientoEntity> guardarEstablecimiento(@Valid @RequestBody EstablecimientoEntity establecimiento) {
        EstablecimientoEntity nuevoEstablecimiento = establecimientoService.guardarEstablecimiento(establecimiento);
        return ResponseEntity.ok(nuevoEstablecimiento);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarEstablecimiento(@Valid @RequestBody Long id) {
        establecimientoService.eliminarEstablecimiento(id);
        return ResponseEntity.ok(new MessageResponse("Establecimiento eliminado con éxito!"));
    }

    @PostMapping("/GetByPerfil")
    public ResponseEntity<?> obtenerEstablecimientoXPerfil(@Valid @RequestBody BuscarEstablecimientoPorPerfilRequest establecimientoRequest) {

        try {
            System.out.println(establecimientoRequest.getEstablemiento());
            System.out.println(establecimientoRequest.getCurso());
            System.out.println(establecimientoRequest.getPerfil());
            System.out.println(establecimientoRequest.getRun());
            return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE)
                    .body(establecimientoService.findEstablecimientoByUsuarioPerfil(establecimientoRequest.getEstablemiento(), establecimientoRequest.getRun(), establecimientoRequest.getCurso(),establecimientoRequest.getPerfil()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: No se logro obtener la informacion requerida!"));

        }

    }
}

