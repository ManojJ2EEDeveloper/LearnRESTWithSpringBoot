package com.example.rest.webservices.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.rest.webservices.exceptions.UserNotFoundException;

@ControllerAdvice
public class ExceptionHandlingController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrId("100");
		exceptionResponse.setErrMsg(ex.getMessage());
		exceptionResponse.setTimeStamp(new Date());
		return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrId("101");
		exceptionResponse.setErrMsg(ex.getMessage());
		exceptionResponse.setTimeStamp(new Date());
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}
