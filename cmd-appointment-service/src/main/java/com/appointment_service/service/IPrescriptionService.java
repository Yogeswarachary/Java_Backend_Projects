package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.Prescriptions;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.exception.PrescriptionServiceException;

public interface IPrescriptionService {
	
public Prescriptions editPrescription(long id, Prescriptions pre) throws PrescriptionServiceException;	
	
	void deletePrescription(long prescriptionId) throws PrescriptionServiceException;	
	
	Prescriptions getOnePrescriprion(long id) throws PrescriptionServiceException;
	
	Prescriptions addPrescription(Prescriptions pre, long id) throws AppointmentNotFoundException;
	
	List<Prescriptions> viewPrescriptionbyAppointmentId(long id) throws PrescriptionServiceException, AppointmentNotFoundException;
}
