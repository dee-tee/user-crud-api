package com.user.example.usercrudapi.repository;

import com.user.example.usercrudapi.entities.Employee;
import com.user.example.usercrudapi.entities.EmployeeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeId> {
    public List<Employee> findByEmployeeIdId(String empId);
    public List<Employee> findByEmployeeIdDept(String dept);

}
