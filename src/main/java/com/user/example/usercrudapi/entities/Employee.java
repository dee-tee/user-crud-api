package com.user.example.usercrudapi.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private EmployeeId employeeId;
    private String name;
    private String city;

    public Employee(EmployeeId employeeId, String name, String city) {
        this.employeeId = employeeId;
        this.name = name;
        this.city = city;
    }

    public Employee() {
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeID(EmployeeId employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
