package com.example.requestvalidation.model;

import jakarta.validation.constraints.Email;
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
public class UserRequest {
	@NotNull(message = "name should not be null")
	private String name;
	@Email(message = "invalid email address")
	private String email;
	private String gender;
	@Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered" )
	private String mobile;
	@Min(18)
	@Max(50)
	private int age;
	@NotBlank
	private String nationality;
}
