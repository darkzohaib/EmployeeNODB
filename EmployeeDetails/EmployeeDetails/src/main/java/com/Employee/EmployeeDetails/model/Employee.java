package com.Employee.EmployeeDetails.model;

public class Employee {

	private int empId;
	
	private String name;
	
	private String project;

	public Employee(int empId, String name, String project) {
		super();
		this.empId = empId;
		this.name = name;
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", project=" + project + "]";
	}
	
	
	
	
	
	
}
