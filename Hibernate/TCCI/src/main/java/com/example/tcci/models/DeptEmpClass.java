package com.example.tcci.models;

import java.io.Serializable;

public class DeptEmpClass implements Serializable {
    private EmployeesModel empNo;
    private DepartmentsModel deptNo;

    public EmployeesModel getEmpNo() {
        return empNo;
    }

    public void setEmpNo(EmployeesModel empNo) {
        this.empNo = empNo;
    }

    public DepartmentsModel getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(DepartmentsModel deptNo) {
        this.deptNo = deptNo;
    }
}