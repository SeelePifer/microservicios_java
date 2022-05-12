package com.example.deparmentservice.service;

import com.example.deparmentservice.entity.Department;
import com.example.deparmentservice.repository.DepartmentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department deparment){

        log.info("Inside saveDeparment of DeparmentService");
        return (Department) departmentRepository.save(deparment);
    }

    public Optional<Department> findDepartmentById(Long deparmentId) {
        return departmentRepository.findById(deparmentId);
    }
}
