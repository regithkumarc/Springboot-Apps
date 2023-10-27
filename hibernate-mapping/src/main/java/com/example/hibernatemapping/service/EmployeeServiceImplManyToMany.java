package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.EmployeeManyToMany;
import com.example.hibernatemapping.entity.ProjectManyToMany;
import com.example.hibernatemapping.repository.EmployeeRepositoryManyToMany;
import com.example.hibernatemapping.repository.ProjectRepositoryManyToMany;

@Service
public class EmployeeServiceImplManyToMany implements EmployeeServiceManyToMany{

	@Autowired
	private EmployeeRepositoryManyToMany employeeRepositoryManyToMany;
	
	@Autowired
	private ProjectRepositoryManyToMany projectRepositoryManyToMany;
	
	@Override
	public List<EmployeeManyToMany> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToMany.findAll();
	}

	@Override
	public EmployeeManyToMany saveBook(EmployeeManyToMany employeeManyToMany) {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToMany.save(employeeManyToMany);
	}

	@Override
	public List<EmployeeManyToMany> findByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepositoryManyToMany.findByName(name);
	}
	
	@Override
	public EmployeeManyToMany assignProjectToEmployee(int empId, int projectId) {
		// TODO Auto-generated method stub
		Set<ProjectManyToMany> projectSet = null;
		EmployeeManyToMany employeeManyToMany =  employeeRepositoryManyToMany.findById(empId).get();
		ProjectManyToMany projectManyToMany =  projectRepositoryManyToMany.findById(projectId).get();
		
		projectSet = employeeManyToMany.getAssignedProjects();
		projectSet.add(projectManyToMany);
		employeeManyToMany.setAssignedProjects(projectSet);
		return employeeRepositoryManyToMany.save(employeeManyToMany);
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<EmployeeManyToMany> optional = employeeRepositoryManyToMany.findById(id);
		if(optional.isPresent()) {
			employeeRepositoryManyToMany.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Book is available for this ID : " + id;
		}
	}
}
