package com.amitoli.service;

import com.amitoli.model.Employee;

import java.util.Set;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee delete(String employeeId);
    Employee update(String employeeId, Employee employee);
    Employee find(String employeeId);
    Set<Employee> findAll();
}
