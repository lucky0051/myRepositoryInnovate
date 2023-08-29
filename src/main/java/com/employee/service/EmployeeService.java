package com.employee.service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.repository.TaxDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TaxDetailRepository taxDetailRepository;

    public Employee saveEmployee(Employee employee){
        Employee save = employeeRepository.save(employee);
        return save;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
