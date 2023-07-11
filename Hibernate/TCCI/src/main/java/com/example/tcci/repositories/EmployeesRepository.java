package com.example.tcci.repositories;

import com.example.tcci.models.DepartmentsModel;
import com.example.tcci.models.EmployeesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesModel, Integer> {

    List<EmployeesModel> findByEmpNoGreaterThan(Integer empNo);

    List<EmployeesModel> findByFirstNameContaining(String FirstName);

    List<EmployeesModel> findAllByDeptEmp_deptNo_deptNo(String deptNo);

    List<EmployeesModel> findAllByDeptEmp_deptNo_deptNoAndEmpNoGreaterThan(String deptNo, Integer empNo);

    List<EmployeesModel> findByFirstNameEquals(String FirstName);
}
