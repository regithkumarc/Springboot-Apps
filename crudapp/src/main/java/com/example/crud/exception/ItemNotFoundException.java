package com.example.crud.exception;

public class ItemNotFoundException extends RuntimeException {

	public ItemNotFoundException(String message) {
		super(message);
	}
	
	public ItemNotFoundException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
	public ItemNotFoundException(Throwable throwable) {
		super(throwable);
	}
}
