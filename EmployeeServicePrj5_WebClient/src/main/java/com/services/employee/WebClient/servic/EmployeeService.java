package com.services.employee.WebClient.servic;


import java.util.List;

import com.services.employee.WebClient.dto.ResponseDto;
import com.services.employee.WebClient.entity.Employee;

public interface EmployeeService {
	Employee saveEmpDetail(Employee emp);

    ResponseDto getEmp(Long empId);
    
    Employee updateEmpRecord(Employee emp);
    
    List<Employee> getAllEmp();
    
         
    void delete(Long empId);
}
