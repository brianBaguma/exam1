package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.Employee;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	    Employee employee1 = new Employee("brian","baguma",2,1000000);
	    Employee employee2 = new Employee("grace","nakimera",2,500000);
		Employee employee3 = new Employee("london","try",3,9000);
		Employee employee4 = new Employee("whokonws ", "jesus",5,60000000);



}
