package com.services.department.DepartmentServicesPrj5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
import com.services.department.DepartmentServicesPrj5.repository.DepartmentRepository;
import com.services.department.DepartmentServicesPrj5.service.DepartmentService;


import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
public class DepartmentController {
	 @Autowired
	  private DepartmentService departmentService;
	  

	  public DepartmentController(DepartmentService departmentService)
	  {
		  super();
	  this.departmentService = departmentService;
	  }
	  
	  @PostMapping("/save")
	  public ResponseEntity<Department> saveDepartment(@RequestBody Department department)
	  {
		  Department  savedDepartment = departmentService.saveDepartment(department);
		  return new  ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	 }
	  
	 	  
	  @GetMapping("{id}") 
	  public ResponseEntity<Department>getDepartmentById(@PathVariable("id") Long departmentId)
	  {
		  Department  department = departmentService.getDepartmentById(departmentId); 
		  return  ResponseEntity.ok(department);
	   }
	
	
	  @GetMapping("/allDepartment")
		public List<Department> listAll(){
			return  departmentService.getAllDept();
		}
	  
    	 
      @PutMapping("/update")
      public ResponseEntity<Department> updateStudentRecord(@RequestBody Department request)
      {
    	  return new ResponseEntity<>(departmentService.updateDepartmentRecord(request), HttpStatus.CREATED);
	  }
      
      @DeleteMapping("/department/{id}")
      public void deleteStudentRecord(@PathVariable("id") Long id){
      
    	  departmentService.delete(id);
      }

	
	@GetMapping("/hello")
	public String HelloWorld()
	{
	return "HelloWorld";
	}
}
