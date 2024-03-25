package com.infer.signup.service;

import com.infer.signup.entity.Employee;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public interface EmployeeService {
    public Employee save(Employee employee);


}


