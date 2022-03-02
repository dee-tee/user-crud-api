package com.user.example.usercrudapi.services;

import com.user.example.usercrudapi.entities.Employee;
import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.MyException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee) throws MyException;

    Employee updateEmployee(Employee employee);

    List<Employee> getAllEmployees() throws MyException;

    List<Employee> getEmployeeByEmpid(String empId) throws MyException;
    List<Employee> getEmployeeByDept(String dept) throws MyException;

}
