package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.ProjectManyToMany;

public interface ProjectServiceManyToMany {
	List<ProjectManyToMany> findAll();
	ProjectManyToMany addProject(ProjectManyToMany projectManyToMany);
}
