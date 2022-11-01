package com.patientservice.service;

import java.util.List;

import com.patientservice.dto.PatientDTO;
import com.patientservice.entites.Patient;

public interface PatientService {
	
	public List<Patient> getPatients();
	public Patient getPatientById(long id);
	public  Patient savePatient(Patient patient);
	public PatientDTO viewPatientProfileInfo(long id);
    public PatientDTO editPatientProfileInfo(long id,PatientDTO patient);
    public PatientDTO addPatientProfilePicture(long id,String profileImageUrl);
    public PatientDTO deletePatientProfilePicture(long id);
}
