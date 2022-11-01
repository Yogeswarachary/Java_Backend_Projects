package com.appointment_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment_service.entites.Vitals;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.VitalAlreadyPresentException;
import com.appointment_service.exception.VitalsNotFoundException;
import com.appointment_service.service.VitalsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class VitalsController {
	
	@Autowired
	private VitalsService vitalsservice;
	
	@GetMapping("/vitals")
    @Operation(summary = "to get all vitals")
    public ResponseEntity<?> getallvitals() throws VitalsNotFoundException{
        ResponseEntity<?> response = null;
//        try
//        {
            response = new ResponseEntity<>(vitalsservice.getVitals(),HttpStatus.OK);
//        }
//        catch(VitalsNotFoundException e)
//        {
//            response = new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
//        }
        return response;

    }
	
	//get vitals by id
	//@RequestMapping(value="/getvitals/{vitalsId}",method = RequestMethod.GET)
	@GetMapping("vitals/{id}")
	public  ResponseEntity<?> getVitalsById(@PathVariable(value="id") long vitalsId) throws VitalsNotFoundException
			
	{
		ResponseEntity<?> responseEntity = null;
		
		//try {
			responseEntity = new ResponseEntity<>( vitalsservice.getVitalsById(vitalsId), HttpStatus.OK);
//		} catch ( VitalsNotFoundException e) {
//
//			responseEntity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
		return  responseEntity;	
		//return vitalsservice.getVitalsById(Long.parseLong(vitalsId));
	}
	
	
	
	//Add or save vitals by vital id
	
	//@RequestMapping(value="/savevitals" ,method = RequestMethod.POST)
	@PostMapping("/vitals")
	public ResponseEntity<?> saveVital(@RequestBody Vitals vital) throws VitalAlreadyPresentException
			{
		ResponseEntity<?> response = null;
		//try {
			response = new ResponseEntity<>(vitalsservice.saveVital(vital), HttpStatus.OK);
//		} catch (VitalsNotFoundException e) {
//			response = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
		return response;
		
		}
	@PostMapping("/appointments/{id}/vitals")
	public ResponseEntity<?> addVitalsToAppointment(@PathVariable(value="id")long id , @RequestBody Vitals vital) throws AppointmentNotFoundException 
			{
		ResponseEntity<?> response = null;
		
			response = new ResponseEntity<>(vitalsservice.addVitalsToAppointmentId(id,vital), HttpStatus.OK);

		return response;
		
		}
	
	

	//@RequestMapping(value="/updatevitals/{vitalsId}",method = RequestMethod.PUT)
	@PutMapping("/vitals/{id}")
	public ResponseEntity<?> updateVital(@PathVariable(value = "id") long id, @RequestBody Vitals vital) throws VitalsNotFoundException
	 {  
		ResponseEntity<?> response = null;
		//try {
			response =  new ResponseEntity<>(vitalsservice.updateVital(id, vital),HttpStatus.OK);
//		} catch (VitalsNotFoundException e) {
//			response = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//		}
		return response;
	}
}
