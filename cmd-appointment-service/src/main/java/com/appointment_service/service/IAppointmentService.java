package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Recommendation;
import com.appointment_service.entites.Test;
import com.appointment_service.entites.Vitals;
import com.appointment_service.exception.AppointmentAlreadyExistsException;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.VitalsNotFoundException;

public interface IAppointmentService {
	
	public Appointment addAppointment(Appointment appointment) throws AppointmentAlreadyExistsException;
	
	public List<Appointment> getAllAppointments() throws AppointmentNotFoundException;
	
	public Appointment getAppointmentById(long id) throws AppointmentNotFoundException;
	
	public void deleteTestsfoAppointment(long id, long testId) throws AppointmentNotFoundException;

	public List<Test> getTestsForAppointment(long id) throws AppointmentNotFoundException;

	Appointment updateRecommendationAppo(Recommendation rec[], long id) throws AppointmentNotFoundException;  ///dinesh

	void deleteRecommendationAppointment(long id, long recommendationId) throws AppointmentNotFoundException;

	public Vitals getVitalsbyAppoinmentId(long id) throws AppointmentNotFoundException;

	public Vitals editVitals(Vitals vital, long vitalsId) throws VitalsNotFoundException, AppointmentNotFoundException;

	public Appointment getAllAppointment(long appointmnetId) throws AppointmentNotFoundException;
	
	public int getAcceptedAppointments();

	public int getCancelledAppointments();

	public int gettotalAppointments();

	public List<Appointment> getfilterconfirmedAppointments() throws AppointmentNotFoundException;

	public List<Appointment> getfiltercancelledAppointments() throws AppointmentNotFoundException;

	public List<Appointment> getfilterclosedAppointments() throws AppointmentNotFoundException;

	//List<Appointment> findAll();

	public Appointment updateAppointmnet(long id, String status);

	public void deleteAppointment(long id)throws AppointmentNotFoundException;
	
	public List<Appointment> getpendingAppointments()throws AppointmentNotFoundException;

} 
