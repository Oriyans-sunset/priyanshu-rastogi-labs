package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

import com.demo.model.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> employeeList = new ArrayList<Employee>(
			Arrays.asList(new Employee(1, "Son", 15000), 
					new Employee(2, "Mbappe", 2000), 
					new Employee(3, "Haaland", 45000)));
	
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	public Employee getEmployeeById(int id) {
		for (Employee emp : employeeList) {
			if (emp.getId() == id) { 
				return emp;
			}  
		}
		Employee employee = new Employee(0, "", 0);
		return employee ;
	}

	public Employee addEmployee() {
		return null;
	}

}
