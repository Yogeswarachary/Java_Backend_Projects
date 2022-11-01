package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.PatientDetails;

public interface PatientDetailsService {
	
	public Appointment addAppointmentToPatientId(PatientDetails p, Appointment appointment);

	public List<Appointment> getAppointmentsForPatientId(long patId);

	public long getPatientIdByAppointmentId(long appId);
}
