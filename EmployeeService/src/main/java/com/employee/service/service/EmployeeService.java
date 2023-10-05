package com.employee.service.service;

import com.employee.service.dto.ResponseDto;
import com.employee.service.entity.Employee;

public interface EmployeeService {
	Employee saveEmpDetail(Employee emp);

    ResponseDto getEmpDetail(Long userId);
}
