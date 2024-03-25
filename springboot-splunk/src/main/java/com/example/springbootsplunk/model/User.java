package com.example.springbootsplunk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column()
	private String name;
	@Column()
	private String address;
	@Column()
	private int salary;

}