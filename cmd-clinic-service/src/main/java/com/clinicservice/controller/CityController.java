package com.clinicservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clinicservice.entites.City;
import com.clinicservice.exception.StateNotFoundException;
import com.clinicservice.service.CityService;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CityController {
	
	@Autowired
	CityService cityServ;
	
	@PostMapping("/state/{name}/city")
	public ResponseEntity<?> post (@RequestBody City city, @PathVariable String name) throws StateNotFoundException{
		ResponseEntity<?> response=new ResponseEntity<> (cityServ.addCityToState(name, city),HttpStatus.OK);
		log.info("Added city into state successfully");
		return response;
	}
}
