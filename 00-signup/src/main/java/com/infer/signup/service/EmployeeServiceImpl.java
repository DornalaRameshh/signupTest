package com.infer.signup.service;

import com.infer.signup.Dao.EmployeeRepository;
import com.infer.signup.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        if (employee.getUniqueRandomId() == null) {
            // Generate a random ID if the ID is not provided
            employee.setUniqueRandomId(generateRandomNumber());
        }
        return employeeRepository.save(employee);
    }

    private String generateRandomNumber() {
        UUID uuid = UUID.randomUUID();
        String s= uuid.toString();

        return s;
    }


    }

