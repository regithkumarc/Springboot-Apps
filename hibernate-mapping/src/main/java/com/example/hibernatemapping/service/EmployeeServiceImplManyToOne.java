package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.EmployeeManyToOne;
import com.example.hibernatemapping.repository.EmployeeRepositoryManyToOne;

@Service
public class EmployeeServiceImplManyToOne implements EmployeeServiceManyToOne{

	@Autowired
	EmployeeRepositoryManyToOne employeeRepositoryManyToOne;
	
	@Override
	public List<EmployeeManyToOne> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToOne.findAll();
	}

	@Override
	public EmployeeManyToOne saveEmployee(EmployeeManyToOne employeeManyToOne) {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToOne.save(employeeManyToOne);
	}

	@Override
	public List<EmployeeManyToOne> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToOne.findByName(name);
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<EmployeeManyToOne> optional = employeeRepositoryManyToOne.findById(id);
		if(optional.isPresent()) {
			employeeRepositoryManyToOne.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Data is available for this ID : " + id;
		}
	}

}
