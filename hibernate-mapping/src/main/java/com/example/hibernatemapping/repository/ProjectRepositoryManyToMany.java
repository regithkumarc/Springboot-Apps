package com.example.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernatemapping.entity.ProjectManyToMany;

@Repository
public interface ProjectRepositoryManyToMany extends JpaRepository<ProjectManyToMany, Integer> {

}
