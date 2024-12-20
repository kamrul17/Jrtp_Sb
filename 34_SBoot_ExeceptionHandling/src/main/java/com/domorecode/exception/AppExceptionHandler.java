package com.domorecode.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=CustomerNotFoundException.class)
	public ResponseEntity<ExceptionInfo>handleCnfe(CustomerNotFoundException cnfe){
		ExceptionInfo ef=new ExceptionInfo();
		ef.setCode("EX01");
		ef.setMessage(cnfe.getMessage());
		ef.setDate(LocalDateTime.now());
		return new ResponseEntity<>(ef, HttpStatus.BAD_REQUEST);
	}
}
