package com.clinicservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clinicservice.exception.ServiceAlreadyExistException;
import com.clinicservice.exception.ServiceIdNotFoundException;
import com.clinicservice.pojo.ServiceRequest;
import com.clinicservice.service.ServicesOfferedService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
public class ServicesOfferedController {
	
	@Autowired
	ServicesOfferedService serviceOffService;


	@PostMapping(value="/services")
	public ResponseEntity<?> addServices(@RequestBody ServiceRequest sRq) throws ServiceAlreadyExistException{
		ResponseEntity<?> response =  new ResponseEntity<>(serviceOffService.addService(sRq), HttpStatus.OK);
			log.info("Service was added successfully");
			return response;
	}

	@PostMapping(value="/clinic/{clinicId}/{serviceId}")
	public ResponseEntity<?> put(@PathVariable(value = "clinicId")long clinicId,@PathVariable(value = "serviceId")long serviceId) throws Exception {
		ResponseEntity<?> response=new ResponseEntity<>(serviceOffService.addServicesToClinics(clinicId, serviceId),HttpStatus.OK);
		log.info("Services added to clinics Successfully");	
		return response;
	}
	
	
	@GetMapping(value = "/service/{serviceId}")
    public  ResponseEntity<?>getService(@PathVariable(value="serviceId")long serviceId) throws ServiceIdNotFoundException{
        ResponseEntity<?> response = null;
        response = new ResponseEntity<>(serviceOffService.getServiceById(serviceId),HttpStatus.OK);
        return response;
    }

}
