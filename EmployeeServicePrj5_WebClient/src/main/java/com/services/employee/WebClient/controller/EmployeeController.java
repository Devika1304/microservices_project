package com.services.employee.WebClient.controller;

import java.util.List;

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


import com.services.employee.WebClient.dto.ResponseDto;
import com.services.employee.WebClient.entity.Employee;
import com.services.employee.WebClient.servic.EmployeeService;



@RestController

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
		  @GetMapping("/allEmployee")
			public List<Employee> listAll(){
				return  empService.getAllEmp();
			}
		  
	    	 
		  @PutMapping("/update")
	      public ResponseEntity<Employee> updateEmpRecord(@RequestBody Employee request)
	      {
	    	  return new ResponseEntity<>(empService.updateEmpRecord(request), HttpStatus.CREATED);
		  }
	      
	      @DeleteMapping("/employee/{id}")
	      public void deleteStudentRecord(@PathVariable("id") Long id){
	      
	    	  empService.delete(id);
	      }
	    
	   
}
