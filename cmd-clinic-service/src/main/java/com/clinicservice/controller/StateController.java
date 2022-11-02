package com.clinicservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clinicservice.entites.State;
import com.clinicservice.exception.StateAlreadyExistException;
import com.clinicservice.service.StateService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class StateController {
	
	@Autowired
	StateService stateServ;
	
	@PostMapping("/state")
	public ResponseEntity<?> post(@RequestBody State state) throws StateAlreadyExistException{
		ResponseEntity<?> response=new ResponseEntity<>(stateServ.addState(state),HttpStatus.OK);
		log.info("State added successfully");
		return response;
	}
}
