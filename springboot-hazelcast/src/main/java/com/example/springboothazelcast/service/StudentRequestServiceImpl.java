package com.example.springboothazelcast.service;

import java.util.List;

import com.example.springboothazelcast.model.StudentRequest;
import com.example.springboothazelcast.model.StudentRequestTBL;

public interface StudentRequestServiceImpl {

	public List<StudentRequestTBL> getAllStudents();
	public StudentRequestTBL getStudentById(int id);
	public StudentRequestTBL addStudent(StudentRequest student);
	public StudentRequestTBL updateStudent(StudentRequest student);
	public String deleteStudentById(int id);
}
