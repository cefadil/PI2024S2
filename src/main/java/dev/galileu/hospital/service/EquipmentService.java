package dev.galileu.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.hospital.entity.Equipment;
import dev.galileu.hospital.repository.EquipmentRepository;

@Service
public class EquipmentService {

    @Autowired private EquipmentRepository equipmentRepository;

    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }

    public Equipment findById(Long id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        equipmentRepository.deleteById(id);
    }

    public Equipment update(long id, Equipment equipment) {
        Equipment equipmentToUpdate = equipmentRepository.findById(id).orElse(null);
        if (equipmentToUpdate == null) {
            return null;
        }
        equipmentToUpdate.setDescricao(equipment.getDescricao());
        equipmentToUpdate.setFabricante(equipment.getFabricante());
        equipmentToUpdate.setModelo(equipment.getModelo());
        equipmentToUpdate.setNum_serie(equipment.getNum_serie());
        equipmentToUpdate.setTag(equipment.getTag());
        return equipmentRepository.save(equipment);
    }

    



}
