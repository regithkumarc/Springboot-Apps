package com.example.springboothazelcast.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboothazelcast.model.StudentRequestTBL;

@Repository
public interface StudentRequestRepository extends JpaRepository<StudentRequestTBL, Integer> {

}
