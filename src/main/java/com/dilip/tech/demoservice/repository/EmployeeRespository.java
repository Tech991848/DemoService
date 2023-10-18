package com.dilip.tech.demoservice.repository;

import com.dilip.tech.demoservice.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
