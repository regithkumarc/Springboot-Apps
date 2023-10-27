package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.EmployeeOneToMany;

public interface EmployeeServiceOneToMany {
	
	List<EmployeeOneToMany> findAll();
	EmployeeOneToMany saveEmployee(EmployeeOneToMany employeeOneToMany);
	List<EmployeeOneToMany> findByName(String name);
	String deleteEmployeeById(Integer id);

}
