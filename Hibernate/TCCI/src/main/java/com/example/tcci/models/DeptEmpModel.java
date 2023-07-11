package com.example.tcci.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name="dept_emp")
@IdClass(DeptEmpClass.class)
public class DeptEmpModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empNo", referencedColumnName = "empNo")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    private EmployeesModel empNo;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deptNo", referencedColumnName = "deptNo",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private DepartmentsModel deptNo;

    @Column(nullable = false,name = "fromDate")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate fromDate;

    @Column(nullable = false,name = "toDate")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate toDate;

    @Override
    public String toString() {
        return "DeptEmpModel{" +
                "empNo=" + empNo +
                ", deptNo=" + deptNo +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }

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

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
