package com.doctorservice.service;

import java.util.List;

import com.doctorservice.entites.Availability;
import com.doctorservice.enums.AvailabilityStatus;
import com.doctorservice.enums.Day;
import com.doctorservice.exception.DoctorNotFoundException;

public interface AvailabilityService {
	
	public Availability setDoctorAvailability(long id, Day day, AvailabilityStatus status) throws DoctorNotFoundException;
	
	public List<Availability> getDoctorAvailability(long id);
	
	Availability getDoctorAvailability(long id, Day day);
}
