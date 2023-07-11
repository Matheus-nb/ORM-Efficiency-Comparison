package com.example.tcci.repositories;

import com.example.tcci.models.DeptEmpClass;
import com.example.tcci.models.DeptEmpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeptEmpRepository extends JpaRepository<DeptEmpModel, DeptEmpClass> {
}
