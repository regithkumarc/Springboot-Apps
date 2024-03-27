package com.example.springboothazelcast.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboothazelcast.common.EnvironmentData;
import com.example.springboothazelcast.exception.StudentNotFoundException;
import com.example.springboothazelcast.model.StudentRequest;
import com.example.springboothazelcast.model.StudentRequestTBL;
import com.example.springboothazelcast.repository.StudentRequestRepository;

@Service
public class StudentRequestService implements StudentRequestServiceImpl {
	
	@Autowired
	public StudentRequestRepository studentRequestRepository;

	@Autowired
	public EnvironmentData env;
	
	@Override
	public List<StudentRequestTBL> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRequestRepository.findAll();
	}

	@Override
	public StudentRequestTBL getStudentById(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		Optional<StudentRequestTBL> student = studentRequestRepository.findById(id);
		if(student.isPresent())
			return student.get();
		else 
			throw new StudentNotFoundException("Invalid Student by Id : " + id);
	}

	@Override
	public StudentRequestTBL addStudent(StudentRequest student) {
		// TODO Auto-generated method stub
		int id = (int) System.currentTimeMillis();
		StudentRequestTBL student1= StudentRequestTBL.build(id, student.getName(), student.getDept(), student.getAge(),student.getMobileNumber()
				,student.getGenter(),student.getNationality());
		studentRequestRepository.save(student1);
		return student1;
	}

	@Override
	public StudentRequestTBL updateStudent(StudentRequest student) {
		// TODO Auto-generated method stub
		Optional<StudentRequestTBL> student1 = studentRequestRepository.findById(student.getId());
		if(student1.isPresent()) {
			//int id = (int) System.currentTimeMillis();
			StudentRequestTBL student2 = StudentRequestTBL.build(student.getId(), student.getName(), student.getDept(), student.getAge(),student.getMobileNumber()
					,student.getGenter(),student.getNationality());
			studentRequestRepository.save(student2);
			return student2;
		} else 
			throw new StudentNotFoundException("Invalid Student by Id : " + student.getId());
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<StudentRequestTBL> student = studentRequestRepository.findById(id);
		if(student.isPresent()) {
			studentRequestRepository.deleteById(id);
			String deletMessage = env.getPropertiesValue("deleteMessage");
			return String.valueOf(deletMessage + id);
		} else 
			throw new StudentNotFoundException("Invalid Student Id : " + id);
	}

}
