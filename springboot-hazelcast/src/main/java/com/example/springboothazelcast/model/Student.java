package com.example.springboothazelcast.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter
@Setter
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "Id should not be a null value")
	private int id;
	@NotNull(message = "Name should not be a null value")
	private String name;
	@NotNull(message = "Dept should not be a null value")
	private String dept;
	@Min(18)
	@Max(50)
	private int age;
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered" )
	private String mobileNumber;
	@NotNull(message = "Gender should not be a null value")
	private String gender;
	@NotBlank
	private String nationality;
}
