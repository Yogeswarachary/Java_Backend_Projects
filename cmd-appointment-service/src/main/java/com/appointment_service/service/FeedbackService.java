package com.appointment_service.service;

import com.appointment_service.entites.Feedback;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.FeedbackNotFoundException;

public interface FeedbackService {
	
	public Feedback getFeedback(long id) throws FeedbackNotFoundException, AppointmentNotFoundException;
}
