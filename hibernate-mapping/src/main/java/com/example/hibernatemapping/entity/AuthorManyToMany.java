package com.example.hibernatemapping.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "AUTHOR_MANYTOMANY")
public class AuthorManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "authorManyToManySet")
	private Set<BookManyToMany> bookManyToManySet = new HashSet<>();

	@Override
	public String toString() {
		return "AuthorManyToMany [id=" + id + ", name=" + name + ", bookManyToManySet=" + bookManyToManySet
				+ "]";
	}
}
