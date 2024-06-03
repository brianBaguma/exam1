package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
    private String firstname;
    private String lastname;
    private int id;
    private int salary;

}
