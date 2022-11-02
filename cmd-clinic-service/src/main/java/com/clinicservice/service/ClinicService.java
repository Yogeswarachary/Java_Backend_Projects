package com.clinicservice.service;

import java.util.List;

import com.clinicservice.entites.Clinic;
import com.clinicservice.entites.Doctor;
import com.clinicservice.exception.CityNotFoundException;
import com.clinicservice.exception.ClinicAlreadyExistException;
import com.clinicservice.exception.ClinicNotFoundException;
import com.clinicservice.exception.DoctorAlreadyExistException;
import com.clinicservice.exception.DoctorNotFoundException;
import com.clinicservice.pojo.ClinicRequest;
import com.clinicservice.pojo.DoctorRequest;

public interface ClinicService {
	
	public Clinic addClinic(ClinicRequest clinicReq) throws ClinicAlreadyExistException;

	public Clinic addClinicToCity(long cityId, ClinicRequest clinicReq) throws CityNotFoundException;

	public Clinic editClinicDetails(Clinic clinic)throws ClinicNotFoundException;

	public String deleteClinic(long clinicId) throws ClinicNotFoundException;
	
	public List<Clinic> getViewAllClinic() throws ClinicNotFoundException;
	
	public Doctor addDoctorsToClinic(DoctorRequest doctor,long clinicId) throws DoctorAlreadyExistException, ClinicAlreadyExistException, DoctorNotFoundException;

	public Clinic getClinicById(long clinicId);
}
