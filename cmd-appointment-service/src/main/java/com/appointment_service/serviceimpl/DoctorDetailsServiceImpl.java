package com.appointment_service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.appointment_service.entites.DoctorDetails;
import com.appointment_service.repository.DoctorDetailsRepository;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.service.DoctorDetailsService;

public class DoctorDetailsServiceImpl implements DoctorDetailsService{
	
	@Autowired
	DoctorDetailsRepository doctorDetailsRepo;
	
	@Autowired
	IAppointmentRepository appointmentRepo;
	
	@Override
	public DoctorDetails getDoctorDetails(long id) {
		return appointmentRepo.getAppointmentById(id).getDoctorDetails();
	}
	
}
