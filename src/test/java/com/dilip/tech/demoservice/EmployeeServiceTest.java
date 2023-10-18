package com.dilip.tech.demoservice;

import com.dilip.tech.demoservice.dto.Employee;
import com.dilip.tech.demoservice.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTest {


    @Mock Employee employee;

    @Mock private EmployeeService employeeService;
    @Test
    void TestSaveEmployee(){
        Employee emp =Employee.build(101,"Dilip",35,"dilip.tech@ibm.com",5600000);

        Mockito.when(employeeService.saveEmployee(Mockito.any())).thenReturn(emp);

        Employee actualemp=employeeService.saveEmployee(emp);
        Assertions.assertEquals(emp,actualemp);
       // Mockito.when(employee).then(mockEmp);

    }
}
