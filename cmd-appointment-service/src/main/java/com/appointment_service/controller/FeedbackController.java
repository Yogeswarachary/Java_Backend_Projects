package com.appointment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.FeedbackNotFoundException;
import com.appointment_service.serviceimpl.FeedbackServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	FeedbackServiceImpl service;

	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getfeedback(@PathVariable(value = "id") Long id)
			throws FeedbackNotFoundException, AppointmentNotFoundException {

		ResponseEntity<?> responseEntity = null;

		try {
			responseEntity = new ResponseEntity<>(service.getFeedback(id), HttpStatus.OK);
		} catch (FeedbackNotFoundException e) {
			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

		return responseEntity;
	}
}
