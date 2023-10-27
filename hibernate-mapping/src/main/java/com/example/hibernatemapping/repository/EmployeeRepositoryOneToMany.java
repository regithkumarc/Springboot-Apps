package com.example.hibernatemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.EmployeeOneToMany;

@Repository
public interface EmployeeRepositoryOneToMany extends JpaRepository<EmployeeOneToMany, Integer> {
	
	List<EmployeeOneToMany> findByName(String name);

}
