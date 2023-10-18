package com.dilip.tech.demoservice;

import com.dilip.tech.demoservice.dto.Employee;
import com.dilip.tech.demoservice.service.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

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
    @Test
    void TestGetEmployies(){
       List employies= Arrays.asList(Employee.build(101,"Dilip",35,"dilip.tech@ibm.com",5600000),Employee.build(102,"Dilip",35,"dilip.tech@ibm.com",56000003));
        Mockito.when(employeeService.getEmployies()).thenReturn(employies);

        List actualemp=employeeService.getEmployies();
        org.assertj.core.api.Assertions.assertThat(actualemp).isNotNull();
        org.assertj.core.api.Assertions.assertThat(actualemp.size()).isEqualTo(2);
        //Assertions.assertEquals(employies,actualemp);
        Assertions.assertArrayEquals(actualemp.toArray(),employies.toArray());

        // Mockito.when(employee).then(mockEmp);

    }

}
