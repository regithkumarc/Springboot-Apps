package com.example.springbootsplunk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootsplunk.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
