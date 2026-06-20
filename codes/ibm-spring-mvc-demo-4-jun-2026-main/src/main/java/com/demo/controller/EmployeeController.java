package com.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employee")
	public String employeeDetails(Model model) {
		List<Employee> empList = empService.getAllEmployees();
		model.addAttribute("employees", empList);
		return "employees";
	}


	
	@GetMapping("/employees/find")
	public String findEmployeeById(@RequestParam("id") int id, Model model) {
		Employee emp = empService.getEmployeeById(id);
		if (emp != null) {
			model.addAttribute("foundEmployee", emp);
		} else {
			model.addAttribute("notFound", "No employee found with ID: " + id);
		}
		model.addAttribute("employees", empService.getAllEmployees());
		return "employees";
	}
	
}
