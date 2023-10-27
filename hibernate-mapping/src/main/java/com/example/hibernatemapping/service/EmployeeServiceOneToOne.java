package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.EmployeeOneToOne;

public interface EmployeeServiceOneToOne {
	
	List<EmployeeOneToOne> findAll();
	EmployeeOneToOne saveEmployee(EmployeeOneToOne employeeOneToOne);
	List<EmployeeOneToOne> findByName(String name);
	String deleteEmployeeById(Integer id);

}
