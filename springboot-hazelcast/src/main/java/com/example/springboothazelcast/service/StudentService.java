package com.example.springboothazelcast.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboothazelcast.common.EnvironmentData;
import com.example.springboothazelcast.exception.StudentNotFoundException;
import com.example.springboothazelcast.model.Student;
import com.example.springboothazelcast.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceImpl {
	
	@Autowired
	public StudentRepository studentRepository;

	@Autowired
	public EnvironmentData env;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent())
			return student.get();
		else 
			throw new StudentNotFoundException("Invalid Student by Id : " + id);
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> student1 = studentRepository.findById(student.getId());
		if(student1.isPresent()) {
			studentRepository.save(student);
			return student;
		} else 
			throw new StudentNotFoundException("Invalid Student by Id : " + student.getId());
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			studentRepository.deleteById(id);
			String deletMessage = env.getPropertiesValue("deleteMessage");
			return String.valueOf(deletMessage + id);
		} else 
			throw new StudentNotFoundException("Invalid Student Id : " + id);
	}

}
