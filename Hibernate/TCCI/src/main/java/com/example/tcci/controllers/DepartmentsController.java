package com.example.tcci.controllers;

import com.example.tcci.dtos.DepartmentsRecordDto;
import com.example.tcci.models.DepartmentsModel;
import com.example.tcci.repositories.DepartmentsRepository;
import com.example.tcci.repositories.DepartRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DepartmentsController {
    @Autowired
    DepartmentsRepository departmentsRepository;

    @Autowired
    DepartRepository deptRepository;


    @PostMapping("/departments")
    public ResponseEntity<DepartmentsModel> saveDepartments(@RequestBody @Valid DepartmentsRecordDto departmentsRecordDto){
        var departmentsModel = new DepartmentsModel();
        BeanUtils.copyProperties(departmentsRecordDto, departmentsModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentsRepository.save(departmentsModel));
    }

    @PostMapping("/departments/insertAll")
    public void saveAllDepartments() throws IOException {
        deptRepository.salvar();
    }
}
