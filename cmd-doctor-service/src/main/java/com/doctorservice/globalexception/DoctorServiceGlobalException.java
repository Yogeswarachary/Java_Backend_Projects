package com.doctorservice.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.doctorservice.exception.DoctorAlreadyExistException;
import com.doctorservice.exception.DoctorNotFoundException;

@ControllerAdvice
public class DoctorServiceGlobalException {
	
	@ExceptionHandler(DoctorNotFoundException.class)
	private ResponseEntity<?> handleDoctorNotFoundException(DoctorNotFoundException doctorNotFoundException){
		
		return new ResponseEntity<>("Please Enter Valid Doctor Id", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	private ResponseEntity<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException httpMessageNotReadableException){
		return new ResponseEntity<>("Enter Valid Data",HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(DoctorAlreadyExistException.class)
	private ResponseEntity<?> handleDoctorAlreadyExistException(DoctorAlreadyExistException doctorAlreadyExistException){
		return new ResponseEntity<>("This doctor id is already their", HttpStatus.BAD_REQUEST);
	}
	
	
}
