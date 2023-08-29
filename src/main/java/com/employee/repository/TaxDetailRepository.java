package com.employee.repository;

import com.employee.entity.TaxDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxDetailRepository extends JpaRepository<TaxDetail, Long> {
    List<TaxDetail> findByEmployeeId(Long employeeId);
}
