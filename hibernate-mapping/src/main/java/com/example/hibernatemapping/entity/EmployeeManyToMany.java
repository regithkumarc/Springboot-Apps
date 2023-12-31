package com.example.hibernatemapping.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEE_MANYTOMANY")
@Data
public class EmployeeManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "employee_project",
			joinColumns = @JoinColumn(name="employee_id"),
			inverseJoinColumns = @JoinColumn(name="project_id"))
	private Set<ProjectManyToMany> assignedProjects = new HashSet<>();
	
}
