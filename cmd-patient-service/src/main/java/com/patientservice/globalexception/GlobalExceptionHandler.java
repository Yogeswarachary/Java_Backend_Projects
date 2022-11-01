package com.patientservice.globalexception;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.patientservice.exceptions.FeedbackNotFoundException;
import com.patientservice.exceptions.PatientAlreadyExistsException;
import com.patientservice.exceptions.PatientNotFoundException;
import com.patientservice.exceptions.SymptomAlreadyPresentException;
import com.patientservice.exceptions.SymptomListIsEmptyException;
import com.patientservice.exceptions.SymptomNotFoundException;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(SymptomListIsEmptyException.class)
	public ResponseEntity<ErrorMessage> symptomListIsEmptyExceptionHandler(Exception ex,WebRequest web){

		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_NO_CONTENT).body(error);
	}
	
	@ExceptionHandler(SymptomNotFoundException.class)
	public ResponseEntity<ErrorMessage> symptomNotFoundExceptionHandler(Exception ex,WebRequest web){
		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_NOT_FOUND).body(error);
	}
	@ExceptionHandler(SymptomAlreadyPresentException.class)
	public ResponseEntity<ErrorMessage> symptomAlreadyPresentException(Exception ex,WebRequest web){
		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_CONFLICT).body(error);
	}
	
	//Patient
	
	@ExceptionHandler(PatientAlreadyExistsException.class)
	public ResponseEntity<ErrorMessage> patientAlreadyExistsException(Exception ex,WebRequest web){
		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_CONFLICT).body(error);
	}
	
	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseEntity<ErrorMessage> patientNotFoundExceptionHandler(Exception ex,WebRequest web){
		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_NOT_FOUND).body(error);
	}
	
	//Feedback
	@ExceptionHandler(FeedbackNotFoundException.class)
	public ResponseEntity<ErrorMessage> feedbackNotFoundExceptionHandler(Exception ex,WebRequest web){
		ErrorMessage error=new ErrorMessage();
		return ResponseEntity.status(HttpStatus.SC_NOT_FOUND).body(error);
	}
}
