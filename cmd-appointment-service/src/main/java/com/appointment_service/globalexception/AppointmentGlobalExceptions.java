package com.appointment_service.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.DoctorNameNotFoundException;
import com.appointment_service.exception.FeedbackNotFoundException;
import com.appointment_service.exception.PrescriptionServiceException;
import com.appointment_service.exception.TestAlreadyPresentException;
import com.appointment_service.exception.TestNotFoundException;
import com.appointment_service.exception.VitalAlreadyPresentException;
import com.appointment_service.exception.VitalsNotFoundException;

@Controller
public class AppointmentGlobalExceptions {
	
	@ExceptionHandler(AppointmentNotFoundException.class)
	public ResponseEntity<String> handleAppointmentNotFoundException(AppointmentNotFoundException appointmentNotFoundException) {
		return new ResponseEntity<String>("Appointment not found, Please enter correct field", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(TestNotFoundException.class)
	public ResponseEntity<String> handleTestNotFoundException(TestNotFoundException testNotFound) {
		return new ResponseEntity<String>("Test not found, Please enter correct field", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(TestAlreadyPresentException.class)
	public ResponseEntity<String> handleTestAlreadyPresentException(TestAlreadyPresentException testAlreadyPresent){
		return new ResponseEntity<String>("Test not found, Please enter correct field", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(VitalsNotFoundException.class)
	public ResponseEntity<String> handleVitalAlreadyPresentException(VitalAlreadyPresentException vitalAlreadyPresent){
		return new ResponseEntity<String>("Vitals already present for id, please enter correct field", HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(DoctorNameNotFoundException.class)
	public ResponseEntity<String> handleDoctorNameNotFoundException(DoctorNameNotFoundException doctornameNotFound){
		return new ResponseEntity<String>("Doctor not found", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(PrescriptionServiceException.class)
	public ResponseEntity<String> handlePrescriptionServiceException(PrescriptionServiceException prescriptionNotFound){
		return new ResponseEntity<String>("Rescription list is empty", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(FeedbackNotFoundException.class)
	public ResponseEntity<String> handleFeedbackNotFoundException(FeedbackNotFoundException feedbackNotFound) {
		return new ResponseEntity<String>("Feedback not found",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException illegalArgumentException){
		return new ResponseEntity<String>("Make sure your entity the right information, please enter corrent details", HttpStatus.BAD_REQUEST);
	}
}
