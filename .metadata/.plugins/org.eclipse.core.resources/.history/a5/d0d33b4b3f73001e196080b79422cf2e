package com.example.hibernatemapping.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PROJECT_MANYTOMANY")
public class ProjectManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "assignedProjects")
	private Set<EmployeeManyToMany> employeeManyToManySet = new HashSet<>();
	

}
