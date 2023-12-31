package com.example.hibernatemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.EmployeeManyToMany;

@Repository
public interface EmployeeRepositoryManyToMany extends JpaRepository<EmployeeManyToMany, Integer> {

	List<EmployeeManyToMany> findByName(String name);
	
}
