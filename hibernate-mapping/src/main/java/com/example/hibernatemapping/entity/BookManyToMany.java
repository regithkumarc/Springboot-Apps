package com.example.hibernatemapping.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "BOOK_MANYTOMANY")
public class BookManyToMany {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "book_author",
		joinColumns = @JoinColumn(name="book_id"),
		inverseJoinColumns = @JoinColumn(name="author_id"))
	private Set<AuthorManyToMany> authorManyToManySet = new HashSet<>();

	@Override
	public String toString() {
		return "BookManyToMany [id=" + id + ", name=" + name + ", authorManyToManySet="
				+ authorManyToManySet + "]";
	}
}
