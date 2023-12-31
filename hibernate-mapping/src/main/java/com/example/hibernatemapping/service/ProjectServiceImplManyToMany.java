package com.example.hibernatemapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.ProjectManyToMany;
import com.example.hibernatemapping.repository.ProjectRepositoryManyToMany;

@Service
public class ProjectServiceImplManyToMany implements ProjectServiceManyToMany{
	
	@Autowired
	private ProjectRepositoryManyToMany projectRepositoryManyToMany;
	
	@Override
	public List<ProjectManyToMany> findAll() {
		// TODO Auto-generated method stub
		return projectRepositoryManyToMany.findAll();
	}

	@Override
	public ProjectManyToMany addProject(ProjectManyToMany projectManyToMany) {
		// TODO Auto-generated method stub
		return projectRepositoryManyToMany.save(projectManyToMany);
	}
}
