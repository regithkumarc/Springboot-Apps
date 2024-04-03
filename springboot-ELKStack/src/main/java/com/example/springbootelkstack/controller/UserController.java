package com.example.springbootelkstack.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootelkstack.model.UserData;

@RestController
@RequestMapping("/api/ELK/UserController")
public class UserController {
	
	Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/getELK")
	public String getELK() {
		return "Getting ELK";
	}
	
	@GetMapping("/getAllUsers")
	public List<UserData> getAllUsers() {
		return getAllUsersData();
	}
	
	@GetMapping("/getUserById/{id}")
	public UserData getUserById(@PathVariable int id) {
		
		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
        
		List<UserData> userList =  getAllUsersData();
		UserData user = userList.stream().filter(u -> u.getId() == id).findAny().orElse(null);
		
		if(user != null) {
			logger.info("user found : {}",user);
			return user;
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				logger.error("User Not Found with ID : {}",id);
			}
			return new UserData();
		}
	}
	
	private List<UserData> getAllUsersData() {
		return Stream.of(
				new UserData(1,"regith"),
				new UserData(2,"vijith"),
				new UserData(3,"vinod"),
				new UserData(4,"bharath")
				).collect(Collectors.toList());
	}

}
