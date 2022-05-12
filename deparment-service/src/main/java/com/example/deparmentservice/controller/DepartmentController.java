package com.example.deparmentservice.controller;

import com.example.deparmentservice.entity.Department;
import com.example.deparmentservice.service.DepartmentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Log4j2
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/deparments")
    public Department saveDepartment(@RequestBody Department deparment){
        log.info("Inside saveDepartment method of Departmentcontroller");
        return departmentService.saveDepartment(deparment);
    }

    @GetMapping("/deparments/{id}")
    public Optional<Department> findDepartmentById(@PathVariable("id") Long id){

        return departmentService.findDepartmentById(id);
    }
}
