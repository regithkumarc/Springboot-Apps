package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.entity.ProjectManyToMany;
import com.example.hibernatemapping.service.ProjectServiceImplManyToMany;

@RestController
@RequestMapping("/ProjectControllerManyToMany")
public class ProjectControllerManyToMany {
	
	@Autowired
	private ProjectServiceImplManyToMany projectServiceImplManyToMany;
	
	@GetMapping("/getAllProjects")
	public List<ProjectManyToMany> getAllProjects() {
		return projectServiceImplManyToMany.findAll();
	}
	
	@PostMapping("/addProject")
	public ProjectManyToMany addProject(@RequestBody ProjectManyToMany projectManyToMany) {
		return projectServiceImplManyToMany.addProject(projectManyToMany);
	}

}
