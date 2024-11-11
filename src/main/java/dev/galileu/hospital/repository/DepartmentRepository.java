package dev.galileu.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.hospital.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
