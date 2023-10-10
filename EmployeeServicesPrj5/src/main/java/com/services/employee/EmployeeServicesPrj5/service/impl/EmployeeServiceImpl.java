package com.services.employee.EmployeeServicesPrj5.service.impl;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.services.employee.EmployeeServicesPrj5.dto.DepartmentDto;
import com.services.employee.EmployeeServicesPrj5.dto.EmployeeDto;
import com.services.employee.EmployeeServicesPrj5.dto.ResponseDto;
import com.services.employee.EmployeeServicesPrj5.entity.Employee;
import com.services.employee.EmployeeServicesPrj5.repository.EmployeeRepo;
import com.services.employee.EmployeeServicesPrj5.service.EmployeeService;

@Service

public class EmployeeServiceImpl  implements EmployeeService{
	 
		public EmployeeServiceImpl(EmployeeRepo empRepo, RestTemplate restTemplate) {
		super();
		this.empRepo = empRepo;
		this.restTemplate = restTemplate;
	}

		private EmployeeRepo empRepo;
	    private RestTemplate restTemplate;
	
	

	@Override
	public ResponseDto getEmp(Long empId) {
		ResponseDto responseDto = new ResponseDto();
        Employee emp = empRepo.findById(empId).get();
        EmployeeDto empDto = mapToEmployee(emp);

        ResponseEntity<DepartmentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8080/" + emp.getDepartmentId(),
                DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();

        System.out.println("Emplyee"+responseEntity.getStatusCode());

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
	@Override
	public Employee updateEmpRecord(Employee emp) {
		return empRepo.save(emp);
	}
	@Override
	public void delete(Long empId) {
		empRepo.deleteById(empId);
		
	}

}
