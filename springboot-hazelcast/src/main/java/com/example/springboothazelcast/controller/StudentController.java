package com.example.springboothazelcast.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
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
import com.example.springboothazelcast.model.Student;
import com.example.springboothazelcast.service.StudentService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/hazelcast/StudentController")
@CacheConfig(cacheNames = "students")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@Autowired
	public EnvironmentData env;
	
	@GetMapping("/getDummyMessage")
	public String getDummyMessage() {
		String dummyMessage = env.getPropertiesValue("dummyMessage");
		return Util.mapJsonToString(dummyMessage);
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getStudentById/{id}")
	@Cacheable(key = "#id")
	public Student getStudentById(@PathVariable int id) {
		System.out.println("Getting the data from DB");
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody @Valid Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping("/updateStudent/{id}")
	@CachePut(key = "#id")
	public Student updateStudent(@RequestBody @Valid Student student,@PathVariable int id) {
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	@CacheEvict(key = "#id")
	public String deleteStudentById(@PathVariable int id) {
		return studentService.deleteStudentById(id);
	}
	
}
