package com.example.springbootcassendra.api;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
	
	@PrimaryKey
	private int id;
	private String name;
	private String address;
	private int age;

}
