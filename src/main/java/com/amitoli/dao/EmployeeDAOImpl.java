package com.amitoli.dao;

import com.amitoli.model.Employee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public Employee save(Employee employee) {
        System.out.println("Employee save is successful: " + employee);
        String name = employee.getName();
        String employeeId = employee.getEmployeeId();
        String gender = employee.getGender();
        Date dob = Date.valueOf(employee.getDob());
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String dobString = dateFormat.format(dob);
        String jobGrade = employee.getJobGrade();
        String managerId = employee.getManagerId();
        String contactNo = employee.getContactNo();
        String emailId = employee.getEmailId();

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //Connection connection = JDBCUtils.getConnection();
            //PreparedStatement preparedStatement = null;
            connection = JDBCUtils.getConnection();
            String insert = "INSERT INTO EMPLOYEE(name,employeeid,gender,dob,jobgrade,managerid,contactno,emailid) " +
                    "VALUES(" + "'" + name + "'" + "," + "'" + employeeId + "'" + "," + "'" + gender + "'" + "," + "'" + dobString + "'" + "," + "'" + jobGrade + "'" + "," + "'" + managerId + "'" + "," + "'" + contactNo + "'" + "," + "'" + emailId + "'" + ")";
            System.out.println("insert statement is " + insert);
            preparedStatement = connection.prepareStatement(insert);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (preparedStatement != null){
                    preparedStatement.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        return employee;
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
