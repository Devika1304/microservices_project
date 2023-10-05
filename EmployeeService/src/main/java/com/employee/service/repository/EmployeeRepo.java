package com.employee.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.service.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
