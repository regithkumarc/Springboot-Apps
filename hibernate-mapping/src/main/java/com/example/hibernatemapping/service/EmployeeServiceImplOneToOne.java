package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.EmployeeOneToOne;
import com.example.hibernatemapping.repository.EmployeeRepositoryOneToOne;

@Service
public class EmployeeServiceImplOneToOne implements EmployeeServiceOneToOne{

	@Autowired
	EmployeeRepositoryOneToOne employeeRepositoryOneToOne;
	
	@Override
	public List<EmployeeOneToOne> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToOne.findAll();
	}

	@Override
	public EmployeeOneToOne saveEmployee(EmployeeOneToOne employeeOneToOne) {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToOne.save(employeeOneToOne);
	}

	@Override
	public List<EmployeeOneToOne> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToOne.findByName(name);
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<EmployeeOneToOne> optional = employeeRepositoryOneToOne.findById(id);
		if(optional.isPresent()) {
			employeeRepositoryOneToOne.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Data is available for this ID : " + id;
		}
	}

}
