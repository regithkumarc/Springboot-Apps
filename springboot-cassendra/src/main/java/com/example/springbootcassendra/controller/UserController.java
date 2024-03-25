package com.example.springbootcassendra.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcassendra.api.Users;
import com.example.springbootcassendra.respository.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	public UserRepository userRepository;
	
	@GetMapping("/getCassendra")
	public String getCassendra() {
		return "Getting Cassandra";
	}
	
	//@PostMapping("/saveUser")
	public void saveUser() {
		List<Users> userList = new ArrayList<>();
		userList.add(new Users(1,"regith","Nagercoil",31));
		userList.add(new Users(2,"vijith","Nagercoil",35));
		userList.add(new Users(3,"bharath","Chennai",33));
		userList.add(new Users(4,"vinod","Chennai",37));
		
		userRepository.saveAll(userList);
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/getUsersFilterByAge/{age}")
	public List<Users> getUsersFilterByAge(@PathVariable int age) {
		return userRepository.getUsersFilterByAge(age);
	}

}
