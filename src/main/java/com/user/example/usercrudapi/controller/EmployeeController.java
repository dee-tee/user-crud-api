package com.user.example.usercrudapi.controller;

import com.user.example.usercrudapi.entities.Employee;
import com.user.example.usercrudapi.entities.User;
import com.user.example.usercrudapi.exceptions.MyException;
import com.user.example.usercrudapi.services.EmployeeService;
import com.user.example.usercrudapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

        @Autowired
        private EmployeeService employeeService;

        @GetMapping("/employees")
        public List<Employee> getEmployees() throws MyException {
            return this.employeeService.getAllEmployees();
        }

        @GetMapping("/employees/{empId}")
        public List<Employee> getEmployeesByEmpId(@PathVariable String empId) throws MyException {
            return this.employeeService.getEmployeeByEmpid(empId);
        }
        @GetMapping("/employee/{dept}")
        public List<Employee> getEmployeesByDept(@PathVariable String dept) throws MyException {
        return this.employeeService.getEmployeeByDept(dept);
        }

        @PostMapping("/employees")
        public Employee addEmployee(@RequestBody Employee employee) throws MyException {
            return this.employeeService.createEmployee(employee);
        }

        @PutMapping("/employees")
        public Employee updateEmployee(@RequestBody Employee employee) throws MyException {
            return this.employeeService.updateEmployee(employee);
        }

    }


