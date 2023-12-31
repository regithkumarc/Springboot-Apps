package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.EmployeeManyToMany;

public interface EmployeeServiceManyToMany {
	
	List<EmployeeManyToMany> findAll();
	EmployeeManyToMany saveBook(EmployeeManyToMany employeeManyToMany);
	List<EmployeeManyToMany> findByName(String name);
	String deleteEmployeeById(Integer id);
	EmployeeManyToMany assignProjectToEmployee(int empId, int projectId);
}
