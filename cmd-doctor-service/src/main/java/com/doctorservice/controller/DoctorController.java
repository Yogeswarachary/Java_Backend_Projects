package com.doctorservice.controller;

import org.slf4j.Logger;
import org.apache.logging.log4j.LogManager;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctorservice.entites.Doctor;
import com.doctorservice.enums.AvailabilityStatus;
import com.doctorservice.enums.Day;
import com.doctorservice.exception.DoctorAlreadyExistException;
import com.doctorservice.exception.DoctorNotFoundException;
import com.doctorservice.service.AvailabilityService;
import com.doctorservice.service.DoctorService;

@CrossOrigin(origins = "*")
@RestController
public class DoctorController {
	
	@Autowired
	DoctorService docService;
	
	@Autowired
	AvailabilityService availService;
	
	Logger log=(Logger) LogManager.getLogger();
	
	@PostMapping("/doctors")
	public ResponseEntity<?> post(@RequestBody Doctor doctor) throws DoctorAlreadyExistException{
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(docService.saveDoctorInfo(doctor), HttpStatus.OK);
		log.info(" POST DOCTOR ");
		return response;
	}
	
	@PutMapping("/doctor/{id}")
	public ResponseEntity<?> put(@PathVariable("id")long id, @RequestBody Doctor doctor) throws DoctorNotFoundException{
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(docService.editDoctor(doctor), HttpStatus.OK);
		log.info(" UPDATING DOCTOR BY ID ");
		return response;
	}
	
	@GetMapping("/doctors/{id}")
	public ResponseEntity<?> get(@PathVariable long id) throws DoctorNotFoundException{
		ResponseEntity<?> response = new ResponseEntity<>(docService.getDoctorInfo(id), HttpStatus.OK);
		log.info("GETTING DOCTOR BY ID");
		return response;
	}
	
	@GetMapping("/doctors")
	public ResponseEntity<?> get() throws DoctorNotFoundException{
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(docService.getAllDoctors(), HttpStatus.OK);
		log.info("GETTING DOCTORS");
		return response;
	}
	
	@PatchMapping("/profilepicture/{id}/{profile_picture}")
	public ResponseEntity<?> patch(@PathVariable long id,@PathVariable  String profile_picture) throws DoctorNotFoundException{
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(docService.addDoctorProfilePicture(id, profile_picture), HttpStatus.OK);
		log.info("ADDING PICTURE");
		return response;
	}
	
	@DeleteMapping("/profilepicture/{id}")
	public ResponseEntity<?> delete(@PathVariable ("id") long id) throws DoctorNotFoundException{
		ResponseEntity<?> response = new ResponseEntity<>(docService.deleteDoctorProfilePicture(id), HttpStatus.OK);
		log.info("DELETING PICTURE");
		return response;
	}
	
	@GetMapping("/doctor/{id}")
	public ResponseEntity<?> getDoctor(@PathVariable long id) throws DoctorNotFoundException{
		ResponseEntity<?> response = new ResponseEntity<>(docService.getDoctorDtoById(id), HttpStatus.OK);
		log.info("GETTING DOCTOR DTO");
		return response;
	}
	
	@PatchMapping("/availability/{doctorId}/{day}/{status}")
	public ResponseEntity<?> patch(@PathVariable long doctorId, @PathVariable Day day, @PathVariable AvailabilityStatus status) throws DoctorNotFoundException{
		ResponseEntity<?> response = new ResponseEntity<>(availService.setDoctorAvailability(doctorId, day, status), HttpStatus.OK);
		log.info("DOCTOR AVAILABILITY");
		return response;
	}
	@PostMapping("/availability/{doctorId}/{day}/{status}")
	public ResponseEntity<?> post(@PathVariable long doctorId, @PathVariable Day day, @PathVariable AvailabilityStatus status){
		ResponseEntity<?> response = new ResponseEntity<>(availService.setDoctorAvailability(doctorId, day, status), HttpStatus.OK);
		log.info("AVAILABILITY");
		return response;
	}
	@GetMapping("/doctorsspeciality/{speciality}")
	public ResponseEntity<?> get(@PathVariable(value = "speciality")String speciality)
	{
		ResponseEntity<?> response = new ResponseEntity<>(docService.getDoctorBySpeciality(speciality), HttpStatus.OK);
		log.info("SPECIALITY");
		return response;
	}
	@GetMapping("/patients/{id}")
	public ResponseEntity<?> getallpatients(@PathVariable(value = "id")long id)
	{
		ResponseEntity<?> response = new ResponseEntity<>(null, HttpStatus.OK);
		return response;
	}
	@GetMapping("/availability/{doctorId}")
    public ResponseEntity<?> getAvailability(@PathVariable long doctorId){
        ResponseEntity<?> response = new ResponseEntity<>(availService.getDoctorAvailability(doctorId), HttpStatus.OK);
        return response;
    }
}
