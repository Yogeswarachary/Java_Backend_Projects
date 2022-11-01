package com.appointment_service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.PatientDetails;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.service.PatientDetailsService;

@Service
public class PatientDetailsServiceImpl implements PatientDetailsService{
	
	@Autowired
	IAppointmentRepository appointmentRepo;
	
	@Override
	public Appointment addAppointmentToPatientId(PatientDetails p, Appointment appointment) {
		appointment.setPatientId(p.getPatientId());
		appointmentRepo.save(appointment);
		return appointment;
	}
	
	@Override
	public List<Appointment> getAppointmentsForPatientId(long patientId){
		return appointmentRepo.getAppointmentByPatientId(patientId);
	}
	
	@Override
	public long getPatientIdByAppointmentId(long appointmentId) {
		return appointmentRepo.getAppointmentById(appointmentId).getPatientId();
	}
}
