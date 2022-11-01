package com.appointment_service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.NewAppointment;
import com.appointment_service.repository.NewAppointmentRepository;
import com.appointment_service.service.NewAppointmentService;

@Service
public class NewAppointmentServiceImpl implements NewAppointmentService {
	
	@Autowired
	private NewAppointmentRepository appointmentRepo;

	@Override
	public NewAppointment AddAppointment(NewAppointment appointment) {
		return appointmentRepo.save(appointment);
	}

	@Override
	public List<NewAppointment> getAppointmentAll() {
		return appointmentRepo.getAppointmentAll();
	}

	@Override
	public NewAppointment getAppointmentById(long id) {
		return appointmentRepo.getAppointmentById(id);
	}

}
