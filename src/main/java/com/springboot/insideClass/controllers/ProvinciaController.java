package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.ProvinciaEntity;
import com.springboot.insideClass.payload.request.Provincia.BuscarProvinciaRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/provincias")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<ProvinciaEntity>> obtenerTodasLasProvincias() {
        List<ProvinciaEntity> provincias = provinciaService.obtenerTodasLasProvincias();
        if (provincias.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(provincias);
        }
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<ProvinciaEntity> obtenerProvinciaPorId(@Validated @RequestBody  Long id) {
        return provinciaService.obtenerProvinciaPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<ProvinciaEntity>> buscarProvinciasPorFiltro(@Validated @RequestBody BuscarProvinciaRequest request) {
        List<ProvinciaEntity> provincias = provinciaService.obtenerProvinciasPorFiltro(
                request.getProvincia_id(),
                request.getProvincia_nombre(),
                request.getProvincia_region_id()
        );
        if (provincias.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(provincias);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<ProvinciaEntity> guardarProvincia(@Validated @RequestBody ProvinciaEntity provincia) {
        ProvinciaEntity savedProvincia = provinciaService.guardarProvincia(provincia);
        return ResponseEntity.ok(savedProvincia);
    }
    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarProvincia(@Validated @RequestBody  Long id) {
        provinciaService.eliminarProvincia(id);
        return ResponseEntity.ok(new MessageResponse("Provincia eliminada con éxito!"));
    }
}
