package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.AuthorManyToMany;
import com.example.hibernatemapping.repository.AuthorRepositoryManyToMany;

@Service
public class AuthorServiceImplManyToMany implements AuthorServiceManyToMany{

	@Autowired
	private AuthorRepositoryManyToMany authorRepositoryManyToMany;
	
	@Override
	public List<AuthorManyToMany> findAll() {
		// TODO Auto-generated method stub
		return authorRepositoryManyToMany.findAll();
	}

	@Override
	public AuthorManyToMany saveAuthor(AuthorManyToMany employeeManyToMany) {
		// TODO Auto-generated method stub
		return authorRepositoryManyToMany.save(employeeManyToMany);
	}

	@Override
	public List<AuthorManyToMany> findByName(String name) {
		// TODO Auto-generated method stub
		return authorRepositoryManyToMany.findByName(name);
	}

	@Override
	public String deleteBookById(Integer id) {
		// TODO Auto-generated method stub
		Optional<AuthorManyToMany> optional = authorRepositoryManyToMany.findById(id);
		if(optional.isPresent()) {
			authorRepositoryManyToMany.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Author is available for this ID : " + id;
		}
	}

}
