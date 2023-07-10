package com.springboot.insideClass.controllers;

import com.springboot.insideClass.entity.DepartamentosProvincialesEntity;
import com.springboot.insideClass.payload.request.DepartamentoProvinciales.BuscarDepartamentoProvincialesRequest;
import com.springboot.insideClass.payload.response.MessageResponse;
import com.springboot.insideClass.service.DepartamentoProvincialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/departamentosProvinciales")
public class DepartamentosProvincialesController {

    @Autowired
    private DepartamentoProvincialesService departamentoProvincialesService;

    @PostMapping("/obtenerTodos")
    public List<DepartamentosProvincialesEntity> obtenerTodosLosDepartamentosProvinciales() {
        return departamentoProvincialesService.obtenerTodosLosDepartamentosProvinciales();
    }

    @PostMapping("/obtenerPorId")
    public ResponseEntity<DepartamentosProvincialesEntity> obtenerDepartamentoProvincialPorId(@Valid @RequestBody  Long id) {
        Optional<DepartamentosProvincialesEntity> departamentoProvincial = departamentoProvincialesService.obtenerDepartamentoProvincialPorId(id);
        if (departamentoProvincial.isPresent()) {
            return ResponseEntity.ok(departamentoProvincial.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/obtenerPorFiltro")
    public ResponseEntity<List<DepartamentosProvincialesEntity>> obtenerDepartamentosProvincialesPorFiltro(@Valid @RequestBody BuscarDepartamentoProvincialesRequest buscarDepartamentoProvincialesRequest) {
        List<DepartamentosProvincialesEntity> departamentosProvinciales = departamentoProvincialesService.obtenerDepartamentosProvincialesPorFiltro(
                buscarDepartamentoProvincialesRequest.getDepartamentos_provinciales_id(),
                buscarDepartamentoProvincialesRequest.getDepartamentos_provinciales_responsable(),
                buscarDepartamentoProvincialesRequest.getDepartamentos_provinciales_correo(),
                buscarDepartamentoProvincialesRequest.getDepartamentos_provinciales_direccion());

        if (departamentosProvinciales.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(departamentosProvinciales);
        }
    }

    @PostMapping("/guardar")
    public ResponseEntity<DepartamentosProvincialesEntity> guardarDepartamentoProvincial(@Valid @RequestBody DepartamentosProvincialesEntity departamentoProvincial) {
        DepartamentosProvincialesEntity nuevoDepartamentoProvincial = departamentoProvincialesService.guardarDepartamentoProvincial(departamentoProvincial);
        return ResponseEntity.ok(nuevoDepartamentoProvincial);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<MessageResponse> eliminarDepartamentoProvincial(@Valid @RequestBody  Long id) {
        departamentoProvincialesService.eliminarDepartamentoProvincial(id);
        return ResponseEntity.ok(new MessageResponse("Departamento provincial eliminado con éxito!"));
    }
}
