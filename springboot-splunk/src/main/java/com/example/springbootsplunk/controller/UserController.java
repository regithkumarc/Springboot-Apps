package com.example.springbootsplunk.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsplunk.common.Util;
import com.example.springbootsplunk.model.User;
import com.example.springbootsplunk.repository.UserRepository;

@RestController
@RequestMapping("/splunk/UserController")
public class UserController {
	
	@Autowired
	public UserRepository userRepository;
	
	Logger logger = LogManager.getLogger(UserController.class);
	
	@GetMapping("/getSplunk")
	public String getSplunk() {
		logger.info("UserController:getSplunk loading successfully");
		String returnData = "getting Splunk";
		logger.info("UserController:getSplunk fetched successfully",Util.mapJsonToString(returnData));
		return returnData;
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		logger.info("UserController:getAllUsers loading successfully");
		List<User> fetchData = userRepository.findAll();
		//logger.info("UserController:getAllUsers fetched successfully",Util.mapJsonToString(fetchData));
		return fetchData;
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		logger.info("UserController:addUser loading successfully");
		//logger.info("UserController:addUser added successfully",Util.mapJsonToString(user));
		userRepository.save(user);
	}
	
	@GetMapping("/findById/{id}")
	public User findById(@PathVariable Integer id) throws Exception {
		logger.info("UserController:findById loading successfully");
		Optional<User> finduser =  userRepository.findById(id);
		if(finduser.isPresent()) {
			User getuser = userRepository.findById(id).get();
			logger.info("UserController:addUser fetched successfully",Util.mapJsonToString(getuser));
			return getuser;
		} else {
			logger.info("UserController:findById User Not Found");
			throw new Exception("User Not Found");
		}
	}

}
