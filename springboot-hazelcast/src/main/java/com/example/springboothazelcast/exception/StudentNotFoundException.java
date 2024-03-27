package com.example.springboothazelcast.exception;

public class StudentNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentNotFoundException(String exception) {
		super(exception);
	}
	
	public StudentNotFoundException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public StudentNotFoundException(Throwable throwable) {
		super(throwable);
	}
}
