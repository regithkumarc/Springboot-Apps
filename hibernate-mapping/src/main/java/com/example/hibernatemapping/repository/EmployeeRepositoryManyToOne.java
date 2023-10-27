package com.example.hibernatemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.EmployeeManyToOne;

@Repository
public interface EmployeeRepositoryManyToOne extends JpaRepository<EmployeeManyToOne, Integer> {
	
	List<EmployeeManyToOne> findByName(String name);

}
