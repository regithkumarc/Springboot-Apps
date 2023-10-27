package com.example.hibernatemapping.service;

import java.util.List;

import com.example.hibernatemapping.entity.BookManyToMany;

public interface BookServiceManyToMany {
	
	public List<BookManyToMany> findAll();
	public BookManyToMany saveBook(BookManyToMany employeeManyToMany);
	public List<BookManyToMany> findByName(String name);
	public String deleteBookById(Integer id);
	public BookManyToMany assignAuthorToBook(int bookId, int authorId);
}
