package com.example.hibernatemapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernatemapping.entity.AuthorManyToMany;
import com.example.hibernatemapping.service.AuthorServiceImplManyToMany;

@RestController
@RequestMapping("/AuthorControllerManyToMany")
public class AuthorControllerManyToMany {
	
	@Autowired
	AuthorServiceImplManyToMany authorServiceImplManyToMany;
	
	@GetMapping("/getAllAuthor")
	public List<AuthorManyToMany> getAllAuthor() {
		return authorServiceImplManyToMany.findAll();
	}
	
	@PostMapping("/addAuthor")
	public AuthorManyToMany addAuthor(@RequestBody AuthorManyToMany authorManyToMany) {
		return authorServiceImplManyToMany.saveAuthor(authorManyToMany);
	}

}
