package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.Test;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.TestAlreadyPresentException;
import com.appointment_service.exception.TestNotFoundException;

public interface TestService {
	
	public Test addTest(Test test) throws TestAlreadyPresentException;
	
	public Test getTestByName(String testName) throws TestNotFoundException;
	
	public Test getTestById(long testId) throws TestNotFoundException;
	
	public List<Test> getAllTest();
	
	public void removeTest(long testId) throws TestNotFoundException  ;
	
	public Test updateTest(Long id, Test test) throws TestNotFoundException;
	
	public Test addTestByAppointmentsId(long id, Test test) throws AppointmentNotFoundException;
	
	public Test updateTestForAppointment(long id, long testId, Test test) throws AppointmentNotFoundException;
}
