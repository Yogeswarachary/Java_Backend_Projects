package com.doctorservice.service;

import java.util.List;

import com.doctorservice.entites.Appointment;
import com.doctorservice.entites.Availability;
import com.doctorservice.entites.Doctor;
import com.doctorservice.entites.DoctorDto;
import com.doctorservice.entites.Patient;
import com.doctorservice.enums.Day;
import com.doctorservice.exception.DoctorAlreadyExistException;
import com.doctorservice.exception.DoctorNotFoundException;

public interface DoctorService {

	public Doctor getDoctorInfo(long id) throws DoctorNotFoundException;
	
	public Doctor saveDoctorInfo(Doctor doctor) throws DoctorAlreadyExistException;
	
	public Doctor editDoctor(Doctor doctor) throws DoctorNotFoundException;
	
	public DoctorDto getDoctorDtoById(long id) throws DoctorNotFoundException;
	
	public List<DoctorDto> getAllDoctors() throws DoctorNotFoundException;
	
	public List<Patient> getPatientForDoctor(long id);
	
	public List<Appointment> getAppointmentForDoctor(long id);
	
	public Doctor addDoctorProfilePicture(long id, String profile_picture) throws DoctorNotFoundException;
	
	public Doctor deleteDoctorProfilePicture(long id) throws DoctorNotFoundException;
	
	public List<DoctorDto> getDoctorBySpeciality(String speciality) throws DoctorNotFoundException;
	
	public Availability getDoctorAvailability(long id, Day day);
}
