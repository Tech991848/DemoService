package com.dilip.tech.demoservice.controller;

import com.dilip.tech.demoservice.dto.Employee;
import com.dilip.tech.demoservice.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return employeeService.getEmployies();
    }

@PostMapping("/employee")
public Employee saveEmployee(@RequestBody @Valid Employee emp) {
    return employeeService.saveEmployee(emp);
    }



}
