package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.NewAppointment;

public interface NewAppointmentService {
	
	public NewAppointment AddAppointment(NewAppointment appointment) ;
	
	public List<NewAppointment> getAppointmentAll();
	
	public NewAppointment getAppointmentById(long id);
}
