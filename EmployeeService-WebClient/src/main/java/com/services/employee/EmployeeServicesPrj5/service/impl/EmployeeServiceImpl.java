package com.services.employee.EmployeeServicesPrj5.service.impl;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.services.employee.EmployeeServicesPrj5.dto.DepartmentDto;
import com.services.employee.EmployeeServicesPrj5.dto.EmployeeDto;
import com.services.employee.EmployeeServicesPrj5.dto.ResponseDto;
import com.services.employee.EmployeeServicesPrj5.entity.Employee;
import com.services.employee.EmployeeServicesPrj5.repository.EmployeeRepo;
import com.services.employee.EmployeeServicesPrj5.service.EmployeeService;

@Service

public class EmployeeServiceImpl  implements EmployeeService{
	 
		public EmployeeServiceImpl(EmployeeRepo empRepo, WebClient webClient) {
		super();
		this.empRepo = empRepo;
		this.webClient = webClient;
	}

		private EmployeeRepo empRepo;
		private WebClient webClient;

	@Override
	public ResponseDto getEmp(Long empId) {
		ResponseDto responseDto = new ResponseDto();
        Employee emp = empRepo.findById(empId).get();
        EmployeeDto empDto = mapToEmployee(emp);

        DepartmentDto departmentDto = webClient.get()
                .uri("http://localhost:8080/" + emp.getDepartmentId())
                        .retrieve()
                                .bodyToMono(DepartmentDto.class)
                                        .block();
        responseDto.setEmp(empDto);
        responseDto.setDepartment(departmentDto);

       return responseDto;
	}
	 private EmployeeDto mapToEmployee(Employee emp){
		 EmployeeDto empDto = new EmployeeDto();
		 empDto.setId(emp.getId());
		 empDto.setFirstName(emp.getFirstName());
		 empDto.setLastName(emp.getLastName());
		 empDto.setEmail(emp.getEmail());
	        return empDto;
	    }

	@Override
	public Employee saveEmpDetail(Employee emp) {
		return empRepo.save(emp);
	}

}
