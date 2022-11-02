package com.clinicservice.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.clinicservice.exception.CityNotFoundException;
import com.clinicservice.exception.ClinicAlreadyExistException;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.exception.DoctorAlreadyExistException;
import com.clinicservice.exception.DoctorNotFoundException;
import com.clinicservice.exception.ServiceAlreadyExistException;
import com.clinicservice.exception.ServiceNotFoundException;
import com.clinicservice.exception.StateAlreadyExistException;
import com.clinicservice.exception.StateNotFoundException;

import lombok.extern.log4j.Log4j2;

@ControllerAdvice
@ResponseStatus
@Log4j2
public class GlobalExceptionHandling {
	
	@ExceptionHandler(ClinicNotFoundException.class)
	public ResponseEntity<?> ClinicNotFoundExceptionHandler(ClinicNotFoundException ce) 
	{
		log.error("Entered Wrong ClincId");
		ResponseEntity<?> response=new ResponseEntity<String>("Clinic not found,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		return response;			
	}    
	
	@ExceptionHandler(ClinicAlreadyExistException.class)
	public ResponseEntity<?> ClinicAlreadyExitsExceptionHandler(ClinicAlreadyExistException ce){
		log.error("Duplicate Clinic Entered");
		ResponseEntity<?> response = new ResponseEntity<String>("Clinic Already Exits,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(ServiceAlreadyExistException.class)
	public ResponseEntity<?> ServiceAlreadyPresentExceptionHandler(ServiceAlreadyExistException se){
		log.error("Duplicate services are beign added");
		ResponseEntity<?> response = new ResponseEntity<String>("Service Already Exits,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(ServiceNotFoundException.class)
	public ResponseEntity<?> ServiceNotFoundExceptionHandler(ServiceNotFoundException se){
		log.error("Entered Wrong ServiceId");
		ResponseEntity<?> response = new ResponseEntity<String>("Service Not Found,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(CityNotFoundException.class)
	public ResponseEntity<?> CityNotFoundExceptionHandler(CityNotFoundException ce){
		log.error("Entered wrong City");
		ResponseEntity<?> response = new ResponseEntity<String>("City Not Found,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		return response;
	}
	
	@ExceptionHandler(DoctorAlreadyExistException.class)
	public ResponseEntity<?> DoctorAlreadyExitExceptionHandler(DoctorAlreadyExistException de){
		ResponseEntity<?> response = new ResponseEntity<String>("Doctor Already Exits,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		log.error("Duplicate Doctor being added");
		return response;
	}
	
	@ExceptionHandler(DoctorNotFoundException.class)
	public ResponseEntity<?> DoctorNotFoundExceptionHandler(DoctorNotFoundException de){
		ResponseEntity<?>response = new ResponseEntity<String>("Doctor Not Found,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		log.error("Entered wrong DoctorId");
		return response;
	}
	
	@ExceptionHandler(StateAlreadyExistException.class)
	public ResponseEntity<?> StateAlreadyExistsExceptionHandler(StateAlreadyExistException se){
		ResponseEntity<?> response = new ResponseEntity<String>("State Already Exist, Please Enter the valid Field",HttpStatus.BAD_REQUEST);
		log.error("Duplicate State being added");
		return response;
	}
	
	@ExceptionHandler(StateNotFoundException.class)
	public ResponseEntity<?> StateNotFoundExceptionHandler(StateNotFoundException se){
		ResponseEntity<?> response = new ResponseEntity<String>("State Not Found,Please Enter the Valid Field",HttpStatus.BAD_REQUEST);
		log.error("Entered wrong State");
		return response;
	}
}
