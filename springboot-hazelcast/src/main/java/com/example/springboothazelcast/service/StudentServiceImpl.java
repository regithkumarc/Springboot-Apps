package com.example.springboothazelcast.service;

import java.util.List;

import com.example.springboothazelcast.model.Student;

public interface StudentServiceImpl {

	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudentById(int id);
}
