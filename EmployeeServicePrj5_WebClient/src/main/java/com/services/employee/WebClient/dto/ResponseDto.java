package com.services.employee.WebClient.dto;


public class ResponseDto {
    private DepartmentDto department;
    private EmployeeDto emp;
    
    
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public EmployeeDto getEmp() {
		return emp;
	}
	public void setEmp(EmployeeDto emp) {
		this.emp = emp;
	}
	
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseDto(DepartmentDto department, EmployeeDto emp) {
		super();
		this.department = department;
		this.emp = emp;
	}
    
    
}
