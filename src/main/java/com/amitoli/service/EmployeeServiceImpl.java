package com.amitoli.service;

import com.amitoli.controller.EmployeeController;
import com.amitoli.dao.EmployeeDAO;
import com.amitoli.model.Employee;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO dao;

    public EmployeeServiceImpl(EmployeeDAO dao) {
        this.dao = dao;
    }

    @Override
    public Employee save(Employee employee) {
        return this.dao.save(employee);
    }

    @Override
    public Employee delete(String employeeId) {
        return null;
    }

    @Override
    public Employee update(String employeeId, Employee employee) {
        return null;
    }

    @Override
    public Employee find(String employeeId) {
        return null;
    }

    @Override
    public Set<Employee> findAll() {
        return null;
    }
}
