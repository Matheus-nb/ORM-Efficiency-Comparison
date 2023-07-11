package com.example.tcci.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="employees")
public class EmployeesModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "empNo")
    private Integer empNo;
    @Column(nullable = false, name = "birthDate")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate birthDate;
    @Column(nullable = false, length = 14, name = "firstName")
    private String firstName;
    @Column(nullable = false, length = 16, name = "gLastName")
    private String gLastName;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false, name = "hireDate")
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate hireDate;
    @OneToMany(mappedBy = "empNo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<DeptEmpModel> deptEmp;

    public Set<DeptEmpModel> getDeptEmp() {
        return deptEmp;
    }

    public void setDeptEmp(Set<DeptEmpModel> deptEmp) {
        this.deptEmp = deptEmp;
    }

    @Override
    public String toString() {
        return "EmployeesModel{" +
                "empNo=" + empNo +
                ", birthDate=" + birthDate +
                ", firstName='" + firstName + '\'' +
                ", gLastName='" + gLastName + '\'' +
                ", gender='" + gender + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getgLastName() {
        return gLastName;
    }

    public void setgLastName(String gLastName) {
        this.gLastName = gLastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}