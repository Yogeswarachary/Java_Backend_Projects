package com.patientservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.patientservice.entites.PrescriptionHistoryList;

@RestController
public class AppointmentHistoryController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="getPrescriptionHistoryFallback")
	@GetMapping("patients/{pid}/appointments/{aId}/prescriptions")
	public ResponseEntity<?> get(@PathVariable long pid  , @PathVariable long aId){
		ResponseEntity<?> response = null;
		PrescriptionHistoryList plist = restTemplate.getForObject("http://appointment-service/appointment/appointments/"+aId+"/prescriptions", PrescriptionHistoryList.class);
		response = new ResponseEntity<>(plist.getPrescriptionList(),HttpStatus.OK);
		return response ;

	}
	
	public ResponseEntity<?> getPrescriptionHistoryFallback(@PathVariable long pid  , @PathVariable long aId){
		ResponseEntity<?> response = null;
		response=new ResponseEntity<>("Couldn't find prescription for this appointment id",HttpStatus.NOT_FOUND);
		return response;

	}
	
}
