package com.employee.service.entity;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.service.dto.DepartmentDto;
import com.employee.service.dto.EmployeeDto;
import com.employee.service.dto.ResponseDto;
import com.employee.service.repository.EmployeeRepo;
import com.employee.service.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService{
	 
		private EmployeeRepo empRepo;
	    private RestTemplate restTemplate;
	
	@Override
	public Employee saveEmpDetail(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDto getEmpDetail(Long empId) {
		ResponseDto responseDto = new ResponseDto();
        Employee emp = empRepo.findById(empId).get();
        EmployeeDto empDto = mapToEmployee(emp);

        ResponseEntity<DepartmentDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8080/api/departments/" + emp.getDepartmentId(),
                DepartmentDto.class);

        DepartmentDto departmentDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setEmployee(empDto);
        responseDto.setDepartment(departmentDto);

        return responseDto;
	}
	 private EmployeeDto mapToEmployee(Employee emp){
		 EmployeeDto userDto = new EmployeeDto();
	        userDto.setId(user.getId());
	        userDto.setFirstName(user.getFirstName());
	        userDto.setLastName(user.getLastName());
	        userDto.setEmail(user.getEmail());
	        return userDto;
	    }

}
