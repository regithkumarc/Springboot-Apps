package com.example.requestvalidation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "USER_TBL")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String nationality;
}
