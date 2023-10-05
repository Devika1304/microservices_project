package com.services.department.DepartmentServicesPrj5.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.department.DepartmentServicesPrj5.entity.Department;
import com.services.department.DepartmentServicesPrj5.repository.DepartmentRepository;
import com.services.department.DepartmentServicesPrj5.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	 @Autowired
	private DepartmentRepository departmentRepository;

	

	@Override
	public Department saveDepartment(Department department) {
				 return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

	

   
}
