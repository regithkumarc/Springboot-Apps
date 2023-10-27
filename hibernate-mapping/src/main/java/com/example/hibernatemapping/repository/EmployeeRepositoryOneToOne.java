package com.example.hibernatemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.EmployeeOneToOne;

@Repository
public interface EmployeeRepositoryOneToOne extends JpaRepository<EmployeeOneToOne, Integer> {
	
	List<EmployeeOneToOne> findByName(String name);

}
