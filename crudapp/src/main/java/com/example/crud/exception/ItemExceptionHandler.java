package com.example.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ItemExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ItemErrorResponse> handleException(ItemNotFoundException itemNotFoundException){
		ItemErrorResponse itemErrorResponse = new ItemErrorResponse();
		itemErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		itemErrorResponse.setMessage(itemNotFoundException.getMessage());
		itemErrorResponse.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ItemErrorResponse>(itemErrorResponse,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<ItemErrorResponse> handleException(Exception exception){
		ItemErrorResponse itemErrorResponse = new ItemErrorResponse();
		itemErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		itemErrorResponse.setMessage(exception.getMessage());
		itemErrorResponse.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<ItemErrorResponse>(itemErrorResponse,HttpStatus.BAD_REQUEST);
	}
}
