package com.clinicservice.service;

import java.util.List;

import com.clinicservice.entites.ServicesOffered;
import com.clinicservice.exception.ClinicAlreadyExistException;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.exception.ServiceAlreadyExistException;
import com.clinicservice.exception.ServiceNotFoundException;
import com.clinicservice.pojo.ServiceRequest;

public interface ServicesOfferedService {
	
	public ServicesOffered addService(ServiceRequest servQ) throws ServiceAlreadyExistException;
	
	public ServicesOffered addServicesToClinics(long clinicId, long serviceId) throws ClinicAlreadyExistException, ServiceAlreadyExistException, ClinicNotFoundException,ServiceNotFoundException;
	
//	public List<ServicesOffered> viewServicesForClinic(long clinicId) throws ClinicNotFoundException;
	
	public ServicesOffered getServiceById(long serviceId);

	List<ServicesOffered> viewServiceForClinic(long clinicId) throws ClinicNotFoundException;
}
