package com.example.tcci.controllers;

import com.example.tcci.dtos.EmployeesRecordDto;
import com.example.tcci.models.EmployeesModel;
import com.example.tcci.repositories.DepartmentsRepository;
import com.example.tcci.repositories.EmpRepository;
import com.example.tcci.repositories.EmployeesRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeesController {

    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    DepartmentsRepository departmentsRepository;

    @Autowired
    EmpRepository empRepository;

    @PostMapping("/employees")
    public ResponseEntity<EmployeesModel> saveEmployee(@RequestBody @Valid EmployeesRecordDto employeesRecordDto){
        var employeeModel = new EmployeesModel();
        BeanUtils.copyProperties(employeesRecordDto, employeeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeesRepository.save(employeeModel));
    }

    @PostMapping("/employees/insertAll")
    public void saveAllEmployees() throws IOException {
        empRepository.salvar();
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Object> getOneEmployee(@PathVariable(value = "id") Integer id){
        Optional<EmployeesModel> employeeFounded = employeesRepository.findById(id);
        if(employeeFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not founded!");
        }

        return ResponseEntity.status(HttpStatus.OK).body(employeeFounded.get());
    }

    @GetMapping("/employeesGreaterThan/{id}")
    public ResponseEntity<List<Object>> getAllEmployeesGreaterThan(@PathVariable(value = "id") Integer id){
        List<EmployeesModel> employeesFounded = employeesRepository.findByEmpNoGreaterThan(id);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }

        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(employeesFounded.toArray()));
    }

    @GetMapping("/employeesOnDepartment")
    public ResponseEntity<List<Object>> getAllEmployeesOnDepartment(@RequestHeader("department") String deptNo){
        List<EmployeesModel> employeesFounded = employeesRepository.findAllByDeptEmp_deptNo_deptNo(deptNo);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }

        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(employeesFounded.toArray()));
    }

    @GetMapping("/employeesOnDepartmentAndGreaterThan/{EmpNo}")
    public ResponseEntity<List<Object>> getAllEmployeesOnDepartmentAndGreaterThan(@RequestHeader("department") String deptNo,
                                                                                  @PathVariable(value = "EmpNo") Integer empNo){
        List<EmployeesModel> employeesFounded = employeesRepository.findAllByDeptEmp_deptNo_deptNoAndEmpNoGreaterThan(deptNo, empNo);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }

        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(employeesFounded.toArray()));
    }

    @GetMapping("/employeesWithName")
    public ResponseEntity<List<Object>> getAllEmployeesWithName(@RequestHeader("name") String name){
        List<EmployeesModel> employeesFounded = employeesRepository.findByFirstNameContaining(name);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }

        return ResponseEntity.status(HttpStatus.OK).body(Arrays.asList(employeesFounded.toArray()));
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Object> updateEmployees(@RequestBody String firstName,
                                                          @PathVariable(value = "id") Integer id){

        List<EmployeesModel> employeesFounded = employeesRepository.findByEmpNoGreaterThan(id);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }

        for (EmployeesModel employee : employeesFounded) {
            employee.setFirstName(firstName);
        }

        return ResponseEntity.status(HttpStatus.OK).body(employeesRepository.saveAll(employeesFounded));
    }

    @DeleteMapping("/employees")
    public ResponseEntity deleteEmployee(@RequestHeader("name") String name){
        List<EmployeesModel> employeesFounded = employeesRepository.findByFirstNameContaining(name);
        if(employeesFounded.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.singletonList("Employees not founded!"));
        }
        employeesRepository.deleteAll(employeesFounded);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted!");
    }
}
