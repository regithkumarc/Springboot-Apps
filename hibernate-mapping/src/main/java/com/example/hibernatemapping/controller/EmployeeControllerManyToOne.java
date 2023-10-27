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

import com.example.hibernatemapping.entity.EmployeeManyToOne;
import com.example.hibernatemapping.service.EmployeeServiceImplManyToOne;

@RestController
@RequestMapping("/EmployeeControllerManyToOne")
public class EmployeeControllerManyToOne {
	
	@Autowired
	private EmployeeServiceImplManyToOne employeeServiceImplManyToOne;
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeManyToOne> findAll() {
		return employeeServiceImplManyToOne.findAll();
	}
	
	@PostMapping("/addEmployee")
	public EmployeeManyToOne addEmployee(@RequestBody EmployeeManyToOne employeeManyToOne) {
		return employeeServiceImplManyToOne.saveEmployee(employeeManyToOne);
	}
	
	@GetMapping("/findByName/{name}")
	public List<EmployeeManyToOne> findByName(@PathVariable String name) {
		return employeeServiceImplManyToOne.findByName(name);
	}
	
	@DeleteMapping("/deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		return employeeServiceImplManyToOne.deleteEmployeeById(id);
	}

}
