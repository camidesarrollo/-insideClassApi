package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.DireccionEntity;
import com.springboot.insideClass.payload.request.Direccion.BuscarDireccionRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/direccion")
public class DireccionController {

    @Autowired
    private DireccionService direccionService;

    @PostMapping("/obtenerTodos")
    public List<DireccionEntity> obtenerTodasLasDirecciones() {
        return direccionService.obtenerTodasLasDirecciones();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<DireccionEntity> obtenerDireccionPorId(@Valid @RequestBody Long id) {
        Optional<DireccionEntity> direccion = direccionService.obtenerDireccionPorId(id);
        if (direccion.isPresent()) {
            return ResponseEntity.ok(direccion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<DireccionEntity>> obtenerDireccionesPorFiltro(@Valid @RequestBody BuscarDireccionRequest buscarDireccionRequest) {
        List<DireccionEntity> direcciones = direccionService.obtenerDireccionesPorFiltro(
                buscarDireccionRequest.getDireccion_id(),
                buscarDireccionRequest.getDireccion_calle(),
                buscarDireccionRequest.getDireccion_info_adicional(),
                buscarDireccionRequest.getDireccion_geo_x(),
                buscarDireccionRequest.getDireccion_geo_y(), buscarDireccionRequest.getDireccion_comuna_id(), buscarDireccionRequest.getDireccion_tipo_area());

        if (direcciones.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(direcciones);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DireccionEntity> guardarDireccion(@Valid @RequestBody DireccionEntity direccion) {
        DireccionEntity nuevaDireccion = direccionService.guardarDireccion(direccion);
        return ResponseEntity.ok(nuevaDireccion);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarDireccion(@PathVariable("id") Long id) {
        direccionService.eliminarDireccion(id);
        return ResponseEntity.ok(new MessageResponse("Dirección eliminada con éxito!"));
    }
}
