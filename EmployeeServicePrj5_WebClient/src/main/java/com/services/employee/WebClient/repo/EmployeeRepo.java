package com.services.employee.WebClient.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.employee.WebClient.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
