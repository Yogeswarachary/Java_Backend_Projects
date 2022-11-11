package com.springexample.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springexample.entity.Employee;
import com.springexample.entity.Employees;
import com.springexample.repository.EmployeeDao;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/get")
	public Employees getEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
		Integer id=employeeDao.getAllEmployees().getEmployeeList().size()+1;
		employee.setId(id);
		
		employeeDao.addEmpoyee(employee);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
							.path("{id}")
							.buildAndExpand(employee.getId())
							.toUri();
		return ResponseEntity.created(location).build();
	}
	
}
