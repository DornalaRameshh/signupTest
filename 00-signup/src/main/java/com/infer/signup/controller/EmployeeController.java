package com.infer.signup.controller;


import com.infer.signup.UserDto;
import com.infer.signup.entity.Employee;
import com.infer.signup.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




    @RestController
    public class EmployeeController {

        private final EmployeeService employeeService;
        private final BCryptPasswordEncoder bCryptPasswordEncoder;

        @Autowired
        public EmployeeController(EmployeeService employeeService,
                                  BCryptPasswordEncoder bCryptPasswordEncoder
                                 ) {
            this.employeeService = employeeService;
            this.bCryptPasswordEncoder = bCryptPasswordEncoder;

        }

        @PostMapping("/register")
        public Employee save(Employee employee) {
            // Additional logic if needed before saving
            return employeeService.save(employee);
        }
    }







