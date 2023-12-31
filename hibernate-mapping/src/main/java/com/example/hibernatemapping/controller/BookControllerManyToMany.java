package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.entity.BookManyToMany;
import com.example.hibernatemapping.service.BookServiceImplManyToMany;

@RestController
@RequestMapping("/BookControllerManyToMany")
public class BookControllerManyToMany {
	
	@Autowired
	private BookServiceImplManyToMany bookServiceImplManyToMany;
	
	@GetMapping("/getAllBooks")
	public List<BookManyToMany> findAll() {
		return bookServiceImplManyToMany.findAll();
	}
	
	@PostMapping("/addBook")
	public BookManyToMany addEmployee(@RequestBody BookManyToMany employeeManyToMany) {
		return bookServiceImplManyToMany.saveBook(employeeManyToMany);
	}
	
	@GetMapping("/findByName/{name}")
	public List<BookManyToMany> findByName(@PathVariable String name) {
		return bookServiceImplManyToMany.findByName(name);
	}
	
	@PutMapping("/assignAuthorToBook/{bookId}/author/{authorId}")
	public BookManyToMany assignAuthorToBook(@PathVariable int bookId,@PathVariable int authorId) {
		return bookServiceImplManyToMany.assignAuthorToBook(bookId,authorId);
	}
	
	@DeleteMapping("/deleteBookById/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		return bookServiceImplManyToMany.deleteBookById(id);
	}

}
