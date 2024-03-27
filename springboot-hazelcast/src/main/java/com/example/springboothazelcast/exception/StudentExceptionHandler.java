package com.example.springboothazelcast.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler()
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exception) {
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatusCode(HttpStatus.NOT_FOUND.value());
		response.setMessage(exception.getMessage());
		response.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(response,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler()
	public ResponseEntity<StudentErrorResponse> handleException(Exception exception) {
		StudentErrorResponse response = new StudentErrorResponse();
		response.setStatusCode(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exception.getMessage());
		response.setTimestamp(System.currentTimeMillis());

		return new ResponseEntity<StudentErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleException(MethodArgumentNotValidException exception) {
		Map<String,String> map = new HashMap<>();
		exception.getBindingResult().getFieldErrors().forEach(err -> {
			map.put(err.getField(), err.getDefaultMessage());	
		});
		return map;
	}

}
