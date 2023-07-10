package com.springboot.insideClass.controllers;
import com.springboot.insideClass.entity.RegionEntity;
import com.springboot.insideClass.payload.request.Region.BuscarRegionRequest;
import com.springboot.insideClass.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/region")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @PostMapping("/obtenerTodos")
    public ResponseEntity<List<RegionEntity>> obtenerTodasLasRegiones() {
        List<RegionEntity> regiones = regionService.obtenerTodasLasRegiones();
        return new ResponseEntity<>(regiones, HttpStatus.OK);
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<RegionEntity> obtenerRegionPorId(@Validated @RequestBody Long id) {
        Optional<RegionEntity> region = regionService.obtenerRegionPorId(id);
        if (region.isPresent()) {
            return new ResponseEntity<>(region.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<RegionEntity>> buscarRegionesPorFiltro(@Validated @RequestBody  BuscarRegionRequest request) {
        List<RegionEntity> regiones = regionService.buscarRegionesPorFiltro(
                request.getRegion_id(),
                request.getRegion_abreviatura(),
                request.getRegion_capital(),
                request.getRegion_nombre()
        );
        return new ResponseEntity<>(regiones, HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<RegionEntity> guardarRegion(@Validated @RequestBody  RegionEntity region) {
        RegionEntity nuevaRegion = regionService.guardarRegion(region);
        return new ResponseEntity<>(nuevaRegion, HttpStatus.CREATED);
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<Void> eliminarRegion(@Validated @RequestBody  Long id) {
        regionService.eliminarRegion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
