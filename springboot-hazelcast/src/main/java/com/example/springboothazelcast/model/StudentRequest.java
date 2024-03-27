package com.example.springboothazelcast.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StudentRequest {

	@NotNull(message = "Id should not be a null value")
	private int id;
	private String name;
	@NotNull(message = "Dept should not be a null value")
	private String dept;
	@Min(18)
	@Max(50)
	private int age;
	@NotNull(message = "Gender should not be a null value")
	private String genter;
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered" )
	private String mobileNumber;
	@NotBlank
	private String nationality;
}
