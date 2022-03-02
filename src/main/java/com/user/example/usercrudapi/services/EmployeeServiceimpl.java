package com.user.example.usercrudapi.services;

import com.user.example.usercrudapi.entities.Employee;
import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.ErrorCode;
import com.user.example.usercrudapi.exceptions.MyException;
import com.user.example.usercrudapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) throws MyException {
        if(employee.getCity()==null||employee.getCity().length()==0)
        {
            throw new MyException(ErrorCode.EMPTY_NAME,"Location cannot be empty");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() throws MyException {
        List<Employee> employeeList=employeeRepository.findAll();
        if(employeeList.isEmpty())
            throw new MyException(ErrorCode.EMPTY_RECORDS,"Empty List Of Employees");
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeeByEmpid(String empId) throws MyException {
        List<Employee> employeeList= employeeRepository.findByEmployeeIdId(empId);
        if(employeeList.isEmpty())
        {
            throw new MyException(ErrorCode.DOES_NOT_EXIST,"No employees with given empId");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeeByDept(String dept) throws MyException {
        List<Employee> employeeList= employeeRepository.findByEmployeeIdDept(dept);
        if(employeeList.isEmpty())
        {
            throw new MyException(ErrorCode.DOES_NOT_EXIST,"No users in the given dept");
        }
        return employeeList;
    }


}
