package com.springexample.repository;

import org.springframework.stereotype.Repository;

import com.springexample.entity.Employee;
import com.springexample.entity.Employees;

@Repository
public class EmployeeDao {
	
	private static Employees list= new Employees();
	static {
		list.getEmployeeList().add(new Employee(1, "Nikhil","Siddhardh","Nikhil@gmail.com"));
		list.getEmployeeList().add(new Employee(2, "Shesh","Adavi","adavishesh@gmail.com"));
		list.getEmployeeList().add(new Employee(3, "Siddu","Jonnalagadda","siddujonnalagadda@gmail.com"));
	}
	
	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmpoyee(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}
