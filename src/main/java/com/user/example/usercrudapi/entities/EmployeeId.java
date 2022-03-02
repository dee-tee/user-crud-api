package com.user.example.usercrudapi.entities;

import com.sun.istack.NotNull;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeId implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull
    private String id;
    @NotNull
    private String dept;

    public EmployeeId() {
    }

    public EmployeeId(String id, String dept) {
        this.id = id;
        this.dept = dept;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
