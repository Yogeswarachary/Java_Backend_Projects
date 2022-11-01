package com.appointment_service.controller;

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

import com.appointment_service.entites.PrescriptionHistoryList;
import com.appointment_service.entites.Prescriptions;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.PrescriptionServiceException;
import com.appointment_service.service.IPrescriptionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class PrescriptionController {
	
	@Autowired
	private IPrescriptionService prescriptionServiceIml;
	
	@PutMapping("/prescriptions/{id}")
	public ResponseEntity<?> editPrescriptionById(@PathVariable(value = "id") long id, @RequestBody Prescriptions pre) throws PrescriptionServiceException {
		
		ResponseEntity<?> responseEntity = null;

	
			responseEntity = new ResponseEntity<>(prescriptionServiceIml.editPrescription(id, pre), HttpStatus.OK);

		return  responseEntity;
		
	}	

	@DeleteMapping("/prescription/{id}")
	public ResponseEntity<?> deleteMedicine(@PathVariable(value = "id") long id)  throws PrescriptionServiceException{
		ResponseEntity<?> responseEntity = null;

	
			prescriptionServiceIml.deletePrescription(id);

		return responseEntity;
	}
	
	
	
	@GetMapping("/prescriptions/{id}")
	public ResponseEntity<?> getOnePrescriprion(@PathVariable(value = "id") long id) throws PrescriptionServiceException
			 {
		
		ResponseEntity<?> responseEntity = null;
			responseEntity = new ResponseEntity<>(prescriptionServiceIml.getOnePrescriprion(id), HttpStatus.OK);

		return  responseEntity;	
		
	}
	
	
	@PostMapping("/appointments/{id}/prescriptions")
	public ResponseEntity<?> addNewPrescription(@PathVariable(value = "id") long id , @RequestBody Prescriptions pre) throws AppointmentNotFoundException{ 
			
		ResponseEntity<?> responseEntity = null;

	
			responseEntity = new ResponseEntity<>(prescriptionServiceIml.addPrescription(pre,id), HttpStatus.OK);
			
		
		return  responseEntity;
	}
	
	

	
	@GetMapping("/appointments/{id}/prescriptions")
	public ResponseEntity<?> viewAllPrescriptions(@PathVariable(value = "id") long id) throws PrescriptionServiceException, AppointmentNotFoundException  {

		ResponseEntity<?> responseEntity = null;
		PrescriptionHistoryList  prescriptionHistory=new PrescriptionHistoryList();
		prescriptionHistory.setPrescriptionList(prescriptionServiceIml.viewPrescriptionbyAppointmentId(id));
	
			responseEntity = new ResponseEntity<>(prescriptionHistory, HttpStatus.OK);
		
		return  responseEntity;
	}
	
	

}
