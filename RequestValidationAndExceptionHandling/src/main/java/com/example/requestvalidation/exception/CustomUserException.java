package com.example.requestvalidation.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomUserException {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidException(MethodArgumentNotValidException ex) {
		Map<String,String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error ->  {
			errorMap.put(error.getField(),error.getDefaultMessage());
		});
		return errorMap;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(UserNotFoundException.class)
	public Map<String,String> handleUserNotFoundException(UserNotFoundException userNotFoundException){
		Map<String,String> errorMap = new HashMap<>();
		errorMap.put("errorMessage", userNotFoundException.getMessage());
		return errorMap;
	}

}
