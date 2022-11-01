package com.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patientservice.entites.Symptom;
import com.patientservice.service.SymptomService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class SymptomController {
	
	@Autowired
	SymptomService symptomService;
	
	@GetMapping("patients/{patientId}/symptoms")
	@Operation(summary = "To get all symptoms")
	public ResponseEntity<?> get(@PathVariable long patientId){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(symptomService.viewAllSymptoms(patientId),HttpStatus.OK);
		return response;
	}
	
	@PostMapping("patients/{patientId}/symptoms")
	@Operation(summary = "Adding new symptom details")
	public ResponseEntity<?> saveSymptoms(@PathVariable long patientId, @RequestBody Symptom symptom){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(symptomService.addSymptom(patientId, symptom),HttpStatus.OK);
		return response;
	}
	
	@PutMapping("patients/{patientId}/symptoms/{symptomId}")
	@Operation(summary = "Editing the symptom details with the help of patient id")
	public ResponseEntity<?> edit(@PathVariable long patientId, @PathVariable long symptomId,@RequestBody Symptom symptom){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(symptomService.editSymptom(symptom, patientId, symptomId),HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("patients/{patientId}/symptoms/{symptomsId}")
	@Operation(summary = "Deleting the symptoms using patient id")
	public ResponseEntity<?> deleteSymptom(@PathVariable long patientId, @PathVariable long symptomId){
		ResponseEntity<?> response=null;
		response=new ResponseEntity<>(symptomService.removeSymptom(patientId, symptomId),HttpStatus.OK);
		return response;
	}
}
