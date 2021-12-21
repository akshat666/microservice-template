/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.domain.Employee;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author akshat
 */
@RestController
@RequestMapping("/api/service/employee")
public class EmployeeController {
    
        @PostMapping(value = "/save",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveEmployee(@Validated @RequestBody Employee employee) {
        return null;

    }

    @GetMapping(value = "/fetchall",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> fetchAllEmployee() {
        return null;

    }
    
}
