package com.example.tcci.models;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="departments")
public class DepartmentsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 4,name = "deptNo")
    private String deptNo;
    @Column(nullable = false,length = 40, unique = true, name = "deptName")
    private String deptName;

    @Override
    public String toString() {
        return "DepartmentsModel{" +
                "deptNo='" + deptNo + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
