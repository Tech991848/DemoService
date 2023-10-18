package com.dilip.tech.demoservice.service;

import com.dilip.tech.demoservice.dto.Employee;
import com.dilip.tech.demoservice.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRespository employeeRespository;


    public Employee saveEmployee(Employee emp){
        return employeeRespository.save(emp);
    }

    public List getEmployies(){
        return employeeRespository.findAll();

    }
}
