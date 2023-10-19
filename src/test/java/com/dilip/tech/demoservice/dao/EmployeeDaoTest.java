package com.dilip.tech.demoservice.dao;

import com.dilip.tech.demoservice.dto.Employee;
import com.dilip.tech.demoservice.repository.EmployeeRespository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase
@ActiveProfiles("devtest")
 class EmployeeDaoTest {

    @Autowired
    EmployeeRespository employeeRespository;


@Test
void testSaveEmployee(){
    Employee employee=Employee.build(202,"Dilip Singh",35,"dilip.tech@g.com",35666655);
Employee actualData=employeeRespository.save(employee);
Assertions.assertThat(actualData).isNotNull();
    }
@Test void testGetAllEmployeeTest(){
    Employee employee1=Employee.build(202,"Dilip Singh",35,"dilip.tech@g.com",35666655);
    employeeRespository.save(employee1);
    Employee employee2=Employee.build(203,"sandeep Singh",33,"candy.tech@g.com",35666655);
    employeeRespository.save(employee2);
    List empl=employeeRespository.findAll();
    Assertions.assertThat(empl).isNotNull().hasSize(2);
}

}
