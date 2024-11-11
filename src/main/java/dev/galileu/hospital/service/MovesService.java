package dev.galileu.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.hospital.entity.Equipment;
import dev.galileu.hospital.entity.Moves;
import dev.galileu.hospital.repository.EquipmentRepository;
import dev.galileu.hospital.repository.MovesRepository;

@Service
public class MovesService {

    @Autowired private MovesRepository movesRepository;
    @Autowired private EquipmentRepository equipmentRepository;

    public Moves save(Moves moves) {
        Equipment equipmentToMove = equipmentRepository.findById(moves.getEquipment().getId()).orElse(null);    
        if (equipmentToMove == null) {
            return null;
        }
        equipmentToMove.setDepartment(moves.getDepartment());
        return movesRepository.save(moves);
    }

    public List<Moves> findAll() {
        return movesRepository.findAll();
    }

    public Moves findById(Long id) {
        return movesRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        movesRepository.deleteById(id);
    }

}
