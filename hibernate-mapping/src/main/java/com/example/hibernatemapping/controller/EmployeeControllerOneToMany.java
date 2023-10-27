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

import com.example.hibernatemapping.entity.EmployeeOneToMany;
import com.example.hibernatemapping.service.EmployeeServiceImplOneToMany;

@RestController
@RequestMapping("/EmployeeControllerOneToMany")
public class EmployeeControllerOneToMany {
	
	@Autowired
	private EmployeeServiceImplOneToMany employeeServiceImplOneToMany;
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeOneToMany> findAll() {
		return employeeServiceImplOneToMany.findAll();
	}
	
	@PostMapping("/addEmployee")
	public EmployeeOneToMany addEmployee(@RequestBody EmployeeOneToMany employeeOneToMany) {
		return employeeServiceImplOneToMany.saveEmployee(employeeOneToMany);
	}
	
	@GetMapping("/findByName/{name}")
	public List<EmployeeOneToMany> findByName(@PathVariable String name) {
		return employeeServiceImplOneToMany.findByName(name);
	}
	
	@DeleteMapping("/deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		return employeeServiceImplOneToMany.deleteEmployeeById(id);
	}

}
