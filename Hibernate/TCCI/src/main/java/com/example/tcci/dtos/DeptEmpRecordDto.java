package com.example.tcci.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DeptEmpRecordDto(@NotNull Integer empNo,
                               @NotBlank String deptNo,
                               @NotNull LocalDate fromDate,
                               @NotNull LocalDate toDate) {
}
