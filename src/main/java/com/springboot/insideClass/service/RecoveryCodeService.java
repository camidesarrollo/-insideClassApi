package com.springboot.insideClass.service;

import com.springboot.insideClass.entity.RecoveryCodeEntity;
import com.springboot.insideClass.repository.RecoveryCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecoveryCodeService {

    @Autowired
    private RecoveryCodeRepository recoveryCodeRepository;


    // Crear un nuevo código de recuperación
    public RecoveryCodeEntity crearRecoveryCode(RecoveryCodeEntity recoveryCode) {
        return recoveryCodeRepository.save(recoveryCode);
    }

    // Obtener todos los códigos de recuperación
    public List<RecoveryCodeEntity> obtenerTodosLosRecoveryCodes() {
        return recoveryCodeRepository.findAll();
    }

    // Obtener un código de recuperación por su ID
    public Optional<RecoveryCodeEntity> obtenerRecoveryCodePorId(Long id) {
        return recoveryCodeRepository.findById(id);
    }

    // Actualizar un código de recuperación existente
    public RecoveryCodeEntity actualizarRecoveryCode(Long id, RecoveryCodeEntity nuevoRecoveryCode) {
        // Verificar si el código de recuperación existe
        Optional<RecoveryCodeEntity> recoveryCodeExistente = recoveryCodeRepository.findById(id);

        if (recoveryCodeExistente.isPresent()) {
            RecoveryCodeEntity recoveryCode = recoveryCodeExistente.get();
            recoveryCode.setRecoveryCode(nuevoRecoveryCode.getRecoveryCode());
            recoveryCode.setExpirationDateTime(nuevoRecoveryCode.getExpirationDateTime());
            // Puedes realizar más actualizaciones aquí si es necesario
            return recoveryCodeRepository.save(recoveryCode);
        } else {
            // Manejar el caso en el que el código de recuperación no existe
            throw new RuntimeException("El código de recuperación no encontrado");
        }
    }

    // Eliminar un código de recuperación por su ID
    public void eliminarRecoveryCode(Long id) {
        // Verificar si el código de recuperación existe
        Optional<RecoveryCodeEntity> recoveryCodeExistente = recoveryCodeRepository.findById(id);

        if (recoveryCodeExistente.isPresent()) {
            recoveryCodeRepository.deleteById(id);
        } else {
            // Manejar el caso en el que el código de recuperación no existe
            throw new RuntimeException("El código de recuperación no encontrado");
        }
    }

    public RecoveryCodeEntity obtenerCodigoVerificacionFiltros(Long id,String expiration_date_time,String recovery_code,Long usuario_id){
        return recoveryCodeRepository.findByFilters(id, expiration_date_time, recovery_code, usuario_id);
    }

}
