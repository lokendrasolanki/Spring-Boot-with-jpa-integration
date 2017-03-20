package com.loki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loki.model.Employee;
import com.loki.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/api/v1/fetch")
	public List<Employee> addEmployee() {
		return employeeRepository.findAll();

	}
}
