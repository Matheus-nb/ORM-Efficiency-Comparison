package com.example.tcci.controllers;

import com.example.tcci.dtos.DeptEmpRecordDto;
import com.example.tcci.models.DepartmentsModel;
import com.example.tcci.models.DeptEmpModel;
import com.example.tcci.models.EmployeesModel;
import com.example.tcci.repositories.DepartmentsRepository;
import com.example.tcci.repositories.DeptEmpRepository;
import com.example.tcci.repositories.DeptEmpRepositoryV2;
import com.example.tcci.repositories.EmployeesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Optional;

@RestController
public class DeptEmpController {
    @Autowired
    DeptEmpRepository deptEmpRepository;

    @Autowired
    DepartmentsRepository departmentsRepository;

    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    DeptEmpRepositoryV2 deptEmpRepositoryV2;

    @PostMapping("/deptEmp")
    public ResponseEntity<Object> saveDeptEmp(@RequestBody @Valid DeptEmpRecordDto deptEmpRecordDto){
        var deptEmpModel = new DeptEmpModel();

        Optional<EmployeesModel> employeeFounded = employeesRepository.findById(deptEmpRecordDto.empNo());
        if(employeeFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not founded!");
        }

        Optional<DepartmentsModel> departmentFounded = departmentsRepository.findById(deptEmpRecordDto.deptNo());
        if(departmentFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department not founded!");
        }

        BeanUtils.copyProperties(deptEmpRecordDto, deptEmpModel);
        deptEmpModel.setEmpNo(employeeFounded.get());
        deptEmpModel.setDeptNo(departmentFounded.get());

        return ResponseEntity.status(HttpStatus.CREATED).body(deptEmpRepository.save(deptEmpModel));
    }

    @PostMapping("/deptEmp/insertAll")
    public void saveAllDeptEmp() throws IOException {
        deptEmpRepositoryV2.salvar();
    }
}

