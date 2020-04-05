package com.amitoli.client;

import com.amitoli.controller.EmployeeController;
import com.amitoli.dao.EmployeeDAO;
import com.amitoli.dao.EmployeeDAOImpl;
import com.amitoli.model.Employee;
import com.amitoli.model.Gender;
import com.amitoli.service.EmployeeService;
import com.amitoli.service.EmployeeServiceImpl;

import java.time.LocalDate;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAOImpl();
        EmployeeService service = new EmployeeServiceImpl(dao);
        EmployeeController controller = new EmployeeController(service);

        Employee emp = new Employee("1002");
        emp.setName("Tom Hanks");
        emp.setDob(LocalDate.of(1968, 06, 11));
        emp.setGender("Male");
        emp.setContactNo("080123");
        emp.setEmailId("tom.hanks@oracle.com");
        emp.setManagerId("999");
        emp.setJobGrade("IC4");

        Employee employee = controller.save(emp);
        System.out.println(employee);
    }
}
