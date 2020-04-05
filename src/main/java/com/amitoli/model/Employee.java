package com.amitoli.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Employee implements Comparable<Employee>, Serializable {
    private String name;
    private final String employeeId;
    private Gender gender;
    private LocalDate dob;
    private String jobGrade;
    private String managerId;
    private String contactNo;
    private String emailId;

    public Employee(String employeeId){
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(String jobGrade) {
        this.jobGrade = jobGrade;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", employeeId='").append(employeeId).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", dob=").append(dob);
        sb.append(", jobGrade='").append(jobGrade).append('\'');
        sb.append(", managerId='").append(managerId).append('\'');
        sb.append(", contactNo='").append(contactNo).append('\'');
        sb.append(", emailId='").append(emailId).append('\'');
        sb.append("}" + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId.equals(employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public int compareTo(Employee o) {
        return this.employeeId.compareTo(o.employeeId);
    }

/*    public static  void main(String[] args){
        HashMap<Employee,String> map = new HashMap<>();
        Employee e1 = new Employee("100");
        Employee e2 = new Employee("101");
        map.put(e1,"Amit");
        map.put(e2,"Oli");
        System.out.println(map.get(e1));
        System.out.println(e1.equals(e2));

        List<Employee> employees = Arrays.asList(e1, e2);
        employees.sort((emp1, emp2) -> emp2.getEmployeeId().compareTo(emp1.employeeId));
        System.out.println(employees);

        Collections.sort(employees);
    }*/
}
