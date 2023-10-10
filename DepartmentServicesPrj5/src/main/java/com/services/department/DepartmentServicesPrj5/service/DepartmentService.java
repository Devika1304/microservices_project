package com.services.department.DepartmentServicesPrj5.service;

import java.util.List;

import com.services.department.DepartmentServicesPrj5.entity.Department;


public interface DepartmentService {
		Department saveDepartment(Department department);
	
		
		List<Department> getAllDept();

	    Department getDepartmentById(Long departmentId);
	    
	    Department updateDepartmentRecord(Department department);
	    
	     void delete(Long departmentId);
}
