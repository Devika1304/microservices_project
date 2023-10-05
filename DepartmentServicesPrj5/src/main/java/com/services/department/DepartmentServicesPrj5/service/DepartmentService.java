package com.services.department.DepartmentServicesPrj5.service;

import com.services.department.DepartmentServicesPrj5.entity.Department;

public interface DepartmentService {
		Department saveDepartment(Department department);

	    Department getDepartmentById(Long departmentId);
}
