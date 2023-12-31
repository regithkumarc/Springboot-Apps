package com.example.hibernatemapping.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernatemapping.entity.AuthorManyToMany;
import com.example.hibernatemapping.entity.BookManyToMany;
import com.example.hibernatemapping.repository.AuthorRepositoryManyToMany;
import com.example.hibernatemapping.repository.BookRepositoryManyToMany;

@Service
public class BookServiceImplManyToMany implements BookServiceManyToMany{

	@Autowired
	private BookRepositoryManyToMany bookRepositoryManyToMany;
	
	@Autowired
	private AuthorRepositoryManyToMany authorRepositoryManyToMany;
	
	@Override
	public List<BookManyToMany> findAll() {
		// TODO Auto-generated method stub
		return bookRepositoryManyToMany.findAll();
	}

	@Override
	public BookManyToMany saveBook(BookManyToMany employeeManyToMany) {
		// TODO Auto-generated method stub
		return bookRepositoryManyToMany.save(employeeManyToMany);
	}

	@Override
	public List<BookManyToMany> findByName(String name) {
		// TODO Auto-generated method stub
		return bookRepositoryManyToMany.findByName(name);
	}

	@Override
	public String deleteBookById(Integer id) {
		// TODO Auto-generated method stub
		Optional<BookManyToMany> optional = bookRepositoryManyToMany.findById(id);
		if(optional.isPresent()) {
			bookRepositoryManyToMany.deleteById(id);
			return "Deleted Successfully : " + id;
		} else {
			return "No Book is available for this ID : " + id;
		}
	}

	@Override
	public BookManyToMany assignAuthorToBook(int bookId, int authorId) {
		// TODO Auto-generated method stub
		Set<AuthorManyToMany> authorManyToManySet = null;
		BookManyToMany bookManyToMany = bookRepositoryManyToMany.findById(bookId).get();
		AuthorManyToMany authorManyToMany = authorRepositoryManyToMany.findById(authorId).get();
		
		authorManyToManySet = bookManyToMany.getAuthorManyToManySet();
		authorManyToManySet.add(authorManyToMany);
		bookManyToMany.setAuthorManyToManySet(authorManyToManySet);
		
		return bookRepositoryManyToMany.save(bookManyToMany);
	}

}
