package com.appointment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.PatientDetails;
import com.appointment_service.service.PatientDetailsService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientDetailsController {
	
	@Autowired
	PatientDetailsService patientDetailService;
	
	@Autowired
	RestTemplate restTemplate;
	

	@HystrixCommand(fallbackMethod="getPatientByAppointmentIdFallback")
	@GetMapping("appointments/{id}/patients")
	public ResponseEntity<?> getPatientByAppointmentId(@PathVariable(value="id")long appId) {
		ResponseEntity<?> response=null;
		long patientId=patientDetailService.getPatientIdByAppointmentId(appId);
		PatientDetails patient=restTemplate.getForObject("http://patient-service/patient/patients/"+patientId, PatientDetails.class);
		response=new ResponseEntity<>(patient,HttpStatus.OK);
		return response;
		}
	
	public ResponseEntity<?> getPatientByAppointmentIdFallback(@PathVariable(value="id")long appId){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>("Field entered may be wrong or Error in establishig connection",HttpStatus.BAD_GATEWAY );
		return response;
	}

	@HystrixCommand(fallbackMethod="addAppointmenttoPatientFallback")
	@PostMapping("/patients/{id}/appointments")
	public ResponseEntity<?>  addAppointmentToPatient(@PathVariable(value="id") long patId, @RequestBody Appointment appointment ){
		PatientDetails p=restTemplate.getForObject("http://patient-service/patient/patients/"+patId, PatientDetails.class);
		ResponseEntity<?> response=null;
		
		response=new ResponseEntity<>(patientDetailService.addAppointmentToPatientId(p,appointment),HttpStatus.OK);
		return response;
		
	}
	
	public ResponseEntity<?> addAppointmenttoPatientFallback (@PathVariable(value="id") long patId, @RequestBody Appointment appointment ){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>("Patient doesn't exist for id or Error in establishig connection",HttpStatus.BAD_GATEWAY );
		return response;
		
	}
	
	
	
	@HystrixCommand(fallbackMethod="getAppointmentforPatientFallback")
	@GetMapping("/patient/{id}/appointments")
	public ResponseEntity<?>  getAppointmentforPatient(@PathVariable(value="id") long patId ){
		ResponseEntity<?> response=null;
	PatientDetails p=restTemplate.getForObject("http://patient-service/patient/patients/"+patId, PatientDetails.class);
	if(p!=null) {
	response=new ResponseEntity<>(patientDetailService.getAppointmentsForPatientId(patId),HttpStatus.OK);
	return response;
		}
	else {
		response=new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	return response;
	}
	
	public ResponseEntity<?>  getAppointmentforPatientFallback(@PathVariable(value="id") long patId ){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>("Patient doesn't exist for id Error in establishig connection",HttpStatus.BAD_GATEWAY );
		return response;
	}
}
