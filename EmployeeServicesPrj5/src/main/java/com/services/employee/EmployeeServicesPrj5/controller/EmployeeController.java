package com.services.employee.EmployeeServicesPrj5.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.department.DepartmentServicesPrj5.entity.Department;
import com.services.employee.EmployeeServicesPrj5.dto.ResponseDto;
import com.services.employee.EmployeeServicesPrj5.entity.Employee;
import com.services.employee.EmployeeServicesPrj5.service.EmployeeService;



@RestController
@RequestMapping("api/emps")
public class EmployeeController {
	@Autowired
	 private EmployeeService empService;
	
	    public EmployeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}

		@PostMapping("/saveEmp")
	    public ResponseEntity<Employee> saveEmpDetail(@RequestBody Employee emp){ 		    	
	    	Employee savedEmpDetail = empService.saveEmpDetail(emp);	    	
	        return new ResponseEntity<>(savedEmpDetail, HttpStatus.CREATED);
	    }

//	    @GetMapping("{id}")
//	    public ResponseEntity<ResponseDto> getEmployee(@PathVariable("id") Long empId){
//	        ResponseDto responseDto = empService.getEmp(empId);
//	        return ResponseEntity.ok(responseDto);
//	    }
		
		  @GetMapping("{id}")
		    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId){
		        ResponseDto responseDto = empService.getEmp(userId);
		        return ResponseEntity.ok(responseDto);
		    }
		  @PutMapping("/update")
	      public ResponseEntity<Employee> updateStudentRecord(@RequestBody Employee request)
	      {
	    	  return new ResponseEntity<>(empService.updateEmpRecord(request), HttpStatus.CREATED);
		  }
	      
	      @DeleteMapping("/emp/{id}")
	      public void deleteStudentRecord(@PathVariable("id") Long id){
	      
	    	  empService.delete(id);
	      }
	    
	   
}
