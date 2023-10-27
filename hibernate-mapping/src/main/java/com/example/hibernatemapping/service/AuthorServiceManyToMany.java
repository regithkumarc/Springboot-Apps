package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.AuthorManyToMany;

public interface AuthorServiceManyToMany {
	
	List<AuthorManyToMany> findAll();
	AuthorManyToMany saveAuthor(AuthorManyToMany authorManyToMany);
	List<AuthorManyToMany> findByName(String name);
	String deleteBookById(Integer id);
}
