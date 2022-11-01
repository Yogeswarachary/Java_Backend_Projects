package com.appointment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.appointment_service.entites.DoctorDetails;
import com.appointment_service.service.DoctorDetailsService;

@RestController
public class DoctorDetailsController {
	
	@Autowired
	DoctorDetailsService doctordetailsservice;
	
	@GetMapping("/doctor/{id}")
	public DoctorDetails getById(@PathVariable(value="id")long id)
	{
		return doctordetailsservice.getDoctorDetails(id);
	}

}
