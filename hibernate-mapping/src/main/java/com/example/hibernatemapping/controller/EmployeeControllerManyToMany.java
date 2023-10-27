package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.entity.EmployeeManyToMany;
import com.example.hibernatemapping.service.EmployeeServiceManyToMany;

@RestController
@RequestMapping("/EmployeeControllerManyToMany")
public class EmployeeControllerManyToMany {
	
	@Autowired
	private EmployeeServiceManyToMany employeeServiceManyToMany;
	
	@GetMapping("/getAllEmployees")
	public List<EmployeeManyToMany> findAll() {
		return employeeServiceManyToMany.findAll();
	}
	
	@PostMapping("/addEmployee")
	public EmployeeManyToMany addEmployee(@RequestBody EmployeeManyToMany employeeManyToMany) {
		return employeeServiceManyToMany.saveBook(employeeManyToMany);
	}
	
	@GetMapping("/findByName/{name}")
	public List<EmployeeManyToMany> findByName(@PathVariable String name) {
		return employeeServiceManyToMany.findByName(name);
	}
	
	@PutMapping("/assignProjectToEmployee/{empId}/project/{projectId}")
	public EmployeeManyToMany assignProjectToEmployee(@PathVariable int empId,@PathVariable int projectId) {
		return employeeServiceManyToMany.assignProjectToEmployee(empId,projectId);
	}
	
	@DeleteMapping("/deleteEmployeeById/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		return employeeServiceManyToMany.deleteEmployeeById(id);
	}

}
