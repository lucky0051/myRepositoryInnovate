package com.employee.service;

import com.employee.repository.TaxDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxDetailService {
    @Autowired
    private TaxDetailRepository taxDetailRepository;

    // Service methods to retrieve tax details for an employee
}
