package com.example.tcci.repositories;

import com.example.tcci.models.DepartmentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentsRepository extends JpaRepository<DepartmentsModel, String> {
}
