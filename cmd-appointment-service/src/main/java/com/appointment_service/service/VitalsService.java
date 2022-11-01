package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.Vitals;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.VitalAlreadyPresentException;
import com.appointment_service.exception.VitalsNotFoundException;

public interface VitalsService {
	
	public List<Vitals>getVitals() throws VitalsNotFoundException;

	public Vitals getVitalsById(long vitalsId) throws VitalsNotFoundException;
	
	public Vitals saveVital(Vitals vital) throws VitalAlreadyPresentException;
	
	public Vitals updateVital( long vitalsID ,Vitals vital) throws VitalsNotFoundException;

	public Vitals addVitalsToAppointmentId(long id,Vitals vital) throws AppointmentNotFoundException;

}
