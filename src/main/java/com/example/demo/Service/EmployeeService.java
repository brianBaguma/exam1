package com.example.demo.Service;


import com.example.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;

@Service
@RequiredArgsConstructor

public class EmployeeService {
//    Employee createEmployee(Employee employee);
//    Employee updateEmployee(Employee employee);
//    void deleteEmployee(String employeeid);

    public final EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);

    }

//    public Employee findbyID(Employee employee){
//        return employeeRepository.findBy();
//    }

//    public Employee createEmployee(Employee employee){
//        return employeeRepository.
    }

    }



}
