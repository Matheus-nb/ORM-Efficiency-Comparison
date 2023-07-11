package com.example.tcci.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record EmployeesRecordDto(@NotNull Integer empNo,
                                 @NotNull @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) LocalDate birthDate,
                                 @NotBlank String firstName,
                                 @NotBlank String gLastName,
                                 @NotBlank String gender,
                                 @NotNull @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING) LocalDate hireDate) {
}
