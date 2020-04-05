package com.amitoli.controller;

import com.amitoli.model.Employee;
import com.amitoli.service.EmployeeService;

import java.util.Set;

public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    public Employee save(Employee employee){
        return this.service.save(employee);
    }
    Employee delete (Employee employeeId){
        return null;
    }
    Employee update(String employeId,Employee employee){
        return null;
    }
    Employee find(Employee employeeId){
        return null;
    }
    Set<Employee> findall(){
        return null;
    }
}
