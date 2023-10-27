package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.entity.EmployeeOneToOne;
import com.example.hibernatemapping.service.EmployeeServiceImplOneToOne;

@RestController
@RequestMapping("/EmployeeControllerOneToOne")
public class EmployeeControllerOneToOne {
	
	@Autowired
	private EmployeeServiceImplOneToOne employeeServiceImplOneToOne;
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeOneToOne> findAll() {
		return employeeServiceImplOneToOne.findAll();
	}
	
	@PostMapping("/addEmployee")
	public EmployeeOneToOne addEmployee(@RequestBody EmployeeOneToOne employeeOneToOne) {
		return employeeServiceImplOneToOne.saveEmployee(employeeOneToOne);
	}
	
	@GetMapping("/findByName/{name}")
	public List<EmployeeOneToOne> findByName(@PathVariable String name) {
		return employeeServiceImplOneToOne.findByName(name);
	}
	
	@DeleteMapping("/deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		return employeeServiceImplOneToOne.deleteEmployeeById(id);
	}

}
