package dev.galileu.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.hospital.entity.Department;
import dev.galileu.hospital.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        departmentRepository.deleteById(id);
    }

    public Department update(long id, Department department) {
        Department departmentToUpdate = departmentRepository.findById(id).orElse(null);
        if (departmentToUpdate == null) {
            return null;
        }
        departmentToUpdate.setName(department.getName());
        departmentToUpdate.setLocation(department.getLocation());
        departmentToUpdate.setPhone(department.getPhone());        
        return departmentRepository.save(department);
    }



}
