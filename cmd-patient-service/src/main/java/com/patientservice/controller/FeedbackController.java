package com.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientservice.entites.Feedback;
import com.patientservice.service.FeedbackService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins="*")
@RestController
public class FeedbackController {
	
	@Autowired
    public FeedbackService feedbackService;

	
	@PostMapping("patients/{pId}/feedbacks/{feedback}")
	public ResponseEntity<?> post(@PathVariable long pId, @RequestBody Feedback feedback){
		long id=feedbackService.provideFeedback(pId, feedback);
		ResponseEntity<?> response=new ResponseEntity<>(id,HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("patients/{pId}/feedbacks/{id}")
	public ResponseEntity<?> get(@PathVariable long pId, @PathVariable long id){
		ResponseEntity<?> response=new ResponseEntity<>(feedbackService.viewFeedback(pId, id),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("patients/{pId}/feedbacks/{id},{feedback}")
	public ResponseEntity<?> get(@PathVariable long pId, @PathVariable long id, @RequestBody Feedback feedback){
		long feedbackObj=feedbackService.editFeedback(pId, id, feedback);
		ResponseEntity<?> response=new ResponseEntity<>(feedbackObj,HttpStatus.OK);
		return response;
	}
}
