package com.example.springboothazelcast.controller;

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

import com.example.springboothazelcast.common.EnvironmentData;
import com.example.springboothazelcast.common.Util;
import com.example.springboothazelcast.model.StudentRequest;
import com.example.springboothazelcast.model.StudentRequestTBL;
import com.example.springboothazelcast.service.StudentRequestService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/hazelcast/StudentRequestController")
public class StudentRequestController {
	
	@Autowired
	public StudentRequestService studentRequestService;
	
	@Autowired
	public EnvironmentData env;
	
	@GetMapping("/getDummyMessage")
	public String getDummyMessage() {
		String dummyMessage = env.getPropertiesValue("dummyMessage");
		return Util.mapJsonToString(dummyMessage);
	}
	
	@GetMapping("/getAllStudents")
	public List<StudentRequestTBL> getAllStudents() {
		return studentRequestService.getAllStudents();
	}
	
	@GetMapping("/getStudentById/{id}")
	public StudentRequestTBL getStudentById(@PathVariable int id) {
		return studentRequestService.getStudentById(id);
	}
	
	@PostMapping("/addStudent")
	public StudentRequestTBL addStudent(@RequestBody @Valid StudentRequest student) {
		return studentRequestService.addStudent(student);
	}

	@PutMapping("/updateStudent")
	public StudentRequestTBL updateStudent(@RequestBody @Valid StudentRequest student) {
		return studentRequestService.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return studentRequestService.deleteStudentById(id);
	}
	
}
