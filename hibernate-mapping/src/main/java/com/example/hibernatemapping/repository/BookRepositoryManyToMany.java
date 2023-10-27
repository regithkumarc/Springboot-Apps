package com.example.hibernatemapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.BookManyToMany;

@Repository
public interface BookRepositoryManyToMany extends JpaRepository<BookManyToMany, Integer> {

	List<BookManyToMany> findByName(String name);
	
}
