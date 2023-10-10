package com.services.employee.EmployeeServicesPrj5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.employee.EmployeeServicesPrj5.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
