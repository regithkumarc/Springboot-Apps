package com.example.springboothazelcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboothazelcast.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
