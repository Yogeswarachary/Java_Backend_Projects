package com.appointment_service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Feedback;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.FeedbackNotFoundException;
import com.appointment_service.repository.FeedbackRepository;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.service.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackRepository repo;
	
	@Autowired
	IAppointmentRepository iappRepo;
	
	@Override
	public Feedback getFeedback(long id) throws FeedbackNotFoundException, AppointmentNotFoundException{
		System.out.println("appointment id:"+id);
		Appointment oldAppointment=iappRepo.findById(id)
				.orElseThrow(()-> new AppointmentNotFoundException("Appointment not found exception"));
		System.out.println("Patient feedback: "+oldAppointment.getFeedback().getComment());
		return oldAppointment.getFeedback();
	}
}
