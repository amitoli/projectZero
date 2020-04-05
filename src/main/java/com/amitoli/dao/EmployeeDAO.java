package com.amitoli.dao;

import com.amitoli.model.Employee;

import java.sql.SQLException;
import java.util.Set;

public interface EmployeeDAO {
    Employee save(Employee employee);

    Employee delete(String employeeId);

    Employee update(String employeeId, Employee employee);

    Employee find(String employeeId);

    Set<Employee> findAll();
}
