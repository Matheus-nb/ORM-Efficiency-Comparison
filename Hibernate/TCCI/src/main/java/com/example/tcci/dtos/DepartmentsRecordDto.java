package com.example.tcci.dtos;

import jakarta.validation.constraints.NotBlank;

public record DepartmentsRecordDto(@NotBlank String deptNo,@NotBlank String deptName) {
}
