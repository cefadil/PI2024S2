package dev.galileu.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.hospital.entity.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
