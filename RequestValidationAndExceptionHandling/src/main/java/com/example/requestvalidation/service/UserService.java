package com.example.requestvalidation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.requestvalidation.exception.UserNotFoundException;
import com.example.requestvalidation.model.User;
import com.example.requestvalidation.model.UserRequest;
import com.example.requestvalidation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User addUser(UserRequest userRequest) {
		int id = (int) System.currentTimeMillis();
		User user = User.build(id,userRequest.getName(),userRequest.getEmail(),userRequest.getMobile(),userRequest.getGender()
				,userRequest.getAge(),userRequest.getNationality());
		System.out.println(user);
		return userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public Optional<User> findById(int id) throws UserNotFoundException {
		Optional<User> user = userRepository.findById(id);
		if(user.isPresent()) {
			System.out.println("User 1 : " + user);
			return user;
		} else {
			System.out.println("User 2 : error ");
			throw new UserNotFoundException("User not found with id : " + id);	
		}
	}
}
