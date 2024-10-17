package com.codeprophet.EmployeeDirectory.controller;

import com.codeprophet.EmployeeDirectory.entity.Employee;
import com.codeprophet.EmployeeDirectory.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/v1")
@RequiredArgsConstructor
@Validated
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id)
    {
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }
    @PutMapping("/")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        return ResponseEntity.ok().body(employeeService.updateEmployee(employee));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer id)
    {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok().body("Deleted employee successfully");
    }

}
