package com.patientservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientservice.dto.PatientDTO;
import com.patientservice.entites.Patient;
import com.patientservice.service.PatientService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping(value="/patients/{id}")
	@Operation(summary = "To get patient with id")
	public ResponseEntity<?> get(@PathVariable(value="id")long id){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.getPatientById(id),HttpStatus.OK);
		return response;
	}
	
	@GetMapping(value="/patients")
	@Operation(summary = "To get all patients")
	public ResponseEntity<List<?>> get(){
		ResponseEntity<List<?>> response=null;
		response=new ResponseEntity<List<?>>(patientService.getPatients(),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("/patients")
	@Operation(summary = "Adding the new patient")
	public ResponseEntity<?> post(@RequestBody Patient patient){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.savePatient(patient),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("patients/{id}/profile")
	@Operation(summary = "getting patient details with the help of patient id")
	public ResponseEntity<?> getPatientById(@PathVariable long id){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.viewPatientProfileInfo(id),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("patients/{id}/{patient}")
	@Operation(summary = "editing the patient details with the help of id")
	public ResponseEntity<?> editPatientProfile(@PathVariable long id, @RequestBody PatientDTO patient){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.editPatientProfileInfo(id, patient),HttpStatus.OK);
		return response;
	}
	
	@PatchMapping("patients/{id},{image}")
	@Operation(summary = "Editing the picture of a patient by using the patient id")
	public ResponseEntity<?> updateProfileImage(@PathVariable long id, @RequestBody PatientDTO patient){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.editPatientProfileInfo(id, patient),HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("patients/{id}/image")
	@Operation(summary = "deleting the patient profile picture using patient id")
	public ResponseEntity<?> deleteProfileImage(@PathVariable long id){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(patientService.deletePatientProfilePicture(id), HttpStatus.OK);
		return response;
	}
	
}
