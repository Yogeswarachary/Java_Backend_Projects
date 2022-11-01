package com.appointment_service.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment_service.entites.NewAppointment;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.service.NewAppointmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NewAppointmentController {
	
	private static Logger logger=LoggerFactory.getLogger(NewAppointmentController.class);
	
	@Autowired 
	private NewAppointmentService appointmentService;
	
	@GetMapping("/get/{id}")
	@Operation(summary = "To find Appointment by using id")
	public NewAppointment getById(@PathVariable (value = "id") long id) {
		return appointmentService.getAppointmentById(id);
	}


	@PostMapping("/appointment")
	@Operation(summary = "To add appointment for patient")
	public NewAppointment AddAppointment(@Valid @RequestBody NewAppointment appointment) throws AppointmentNotFoundException
	{
	
		return appointmentService.AddAppointment(appointment);
		
	}
/*	@GetMapping("/get/{id}")
	@Operation(summary = "To find Appointment by using id")
	public Appointment getById(@PathVariable (value = "id") long id) {
		return appointmentService.getAppointmentById(id);
	} */
	
	@GetMapping("/get/")
	@Operation(summary = "To find  all appointment")
	public List<NewAppointment>  getAll() { 
		List<NewAppointment> result = appointmentService.getAppointmentAll();
		 
	
		return result;
	}
	
}
