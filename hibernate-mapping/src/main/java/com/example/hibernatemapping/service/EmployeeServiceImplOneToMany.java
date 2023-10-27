package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.EmployeeOneToMany;
import com.example.hibernatemapping.repository.EmployeeRepositoryOneToMany;

@Service
public class EmployeeServiceImplOneToMany implements EmployeeServiceOneToMany{

	@Autowired
	EmployeeRepositoryOneToMany employeeRepositoryOneToMany;
	
	@Override
	public List<EmployeeOneToMany> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToMany.findAll();
	}

	@Override
	public EmployeeOneToMany saveEmployee(EmployeeOneToMany employeeOneToMany) {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToMany.save(employeeOneToMany);
	}

	@Override
	public List<EmployeeOneToMany> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepositoryOneToMany.findByName(name);
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<EmployeeOneToMany> optional = employeeRepositoryOneToMany.findById(id);
		if(optional.isPresent()) {
			employeeRepositoryOneToMany.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Data is available for this ID : " + id;
		}
	}

}
