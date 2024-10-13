package com.Employee.EmployeeDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.EmployeeDetails.model.Employee;

@Service
public class EmployeeService {
	public static List<Employee> empList = new ArrayList<Employee>();

	static {

		empList.add(new Employee(1, "Zohaib", "snb"));
		empList.add(new Employee(2, "Sarath", "snb"));
		empList.add(new Employee(3, "Jafer", "snb"));
		empList.add(new Employee(4, "Rahul", "snb"));
		empList.add(new Employee(5, "Pranav", "snb"));
		empList.add(new Employee(6, "Mirza", "snb"));
		empList.add(new Employee(7, "Rameez", "snb"));
		empList.add(new Employee(8, "Rupesh", "snb"));
		empList.add(new Employee(9, "Srinivas", "snb"));

	}

	public List<Employee> getAllEmployee() {

		return empList;
	}

	public Employee getAllEmployeeById(int Id) {

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == Id)
				return empList.get(i);
		}

		return null;
	}

	public String deleteEmployeeById(int Id) {

		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == Id)
				empList.remove(i);
		}
		
		return "record removed SucessFully:)";
	}
	
	public String addEmpolyee(Employee oEmployee) {
		empList.add(oEmployee);
		
		return "record Added SucessFully:)";
	}

}
