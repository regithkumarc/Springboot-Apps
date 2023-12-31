package com.example.requestvalidation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.requestvalidation.exception.UserNotFoundException;
import com.example.requestvalidation.model.User;
import com.example.requestvalidation.model.UserRequest;
import com.example.requestvalidation.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getTest")
	public String getTest() {
		return "getting test";
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers()) ;
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody @Valid UserRequest userRequest) {
		return new ResponseEntity<>(userService.addUser(userRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<User> findById(@PathVariable int id) throws UserNotFoundException {
		Optional<User> user = userService.findById(id);	
		return ResponseEntity.ok(user.get());	
	}
}
