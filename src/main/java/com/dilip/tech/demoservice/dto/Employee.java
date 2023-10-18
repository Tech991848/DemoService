package com.dilip.tech.demoservice.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Employee {
    @Id
    private Integer id;
    @NotEmpty(message = "name should not be empty")
    private String name;
    @Max(value = 87,message = "Age should not getter then 87")
    private int age;
    @NotNull(message = "Email should not be null")
    private String email;
    private double salary;


}
