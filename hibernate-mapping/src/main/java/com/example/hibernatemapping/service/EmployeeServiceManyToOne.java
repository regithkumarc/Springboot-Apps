package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.EmployeeManyToOne;

public interface EmployeeServiceManyToOne {
	
	List<EmployeeManyToOne> findAll();
	EmployeeManyToOne saveEmployee(EmployeeManyToOne employeeManyToOne);
	List<EmployeeManyToOne> findByName(String name);
	String deleteEmployeeById(Integer id);

}
