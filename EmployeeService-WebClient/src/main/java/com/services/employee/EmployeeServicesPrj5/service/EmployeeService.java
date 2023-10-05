package com.services.employee.EmployeeServicesPrj5.service;

import com.services.employee.EmployeeServicesPrj5.dto.ResponseDto;
import com.services.employee.EmployeeServicesPrj5.entity.Employee;

public interface EmployeeService {
	Employee saveEmpDetail(Employee emp);

    ResponseDto getEmp(Long userId);
}
