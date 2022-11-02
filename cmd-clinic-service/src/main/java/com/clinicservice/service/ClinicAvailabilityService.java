package com.clinicservice.service;

import java.util.List;

import com.clinicservice.entites.Clinic;
import com.clinicservice.entites.ClinicAvailability;
import com.clinicservice.enums.Status;
import com.clinicservice.enums.Week;

public interface ClinicAvailabilityService {
	
	public ClinicAvailability setClinicAvailability(long id, Week week, Status status);
	
	public List<Clinic> getClinicAvailability(Week week);
}
