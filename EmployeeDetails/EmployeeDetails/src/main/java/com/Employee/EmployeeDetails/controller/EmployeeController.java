package com.Employee.EmployeeDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.EmployeeDetails.model.Employee;
import com.Employee.EmployeeDetails.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService oEmployeeService;
	
	
	@GetMapping("Hello")
	public String greet() {
		return "Good Morning:)";
		
	}
	
	@GetMapping("getAllEmployee")
	public List<Employee> getAllEmployee(){
		
		return oEmployeeService.getAllEmployee();
	}
	
	@GetMapping("getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		return oEmployeeService.getAllEmployeeById(id);
		
	}
	
	@GetMapping("deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		
		 return oEmployeeService.deleteEmployeeById(id);
		
	}
	
	@PostMapping("addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return oEmployeeService.addEmpolyee(employee);
	}
	
}
