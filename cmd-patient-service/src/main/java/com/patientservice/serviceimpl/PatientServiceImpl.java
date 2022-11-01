package com.patientservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientservice.dto.PatientDTO;
import com.patientservice.entites.Patient;
import com.patientservice.exceptions.PatientAlreadyExistsException;
import com.patientservice.exceptions.PatientNotFoundException;
import com.patientservice.mapper.PatientMapper;
import com.patientservice.repository.PatientRepository;
import com.patientservice.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	public PatientRepository patientRepository;
	
	@Override
	public List<Patient> getPatients() {
		if(patientRepository.findAll().isEmpty()) {
			throw new PatientNotFoundException();
		}
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(long id) {
		if(patientRepository.existsById(id)){
			return patientRepository.getPatientById(id);
		}
		else {
			throw new PatientNotFoundException();
		}
	}

	@Override
	public Patient savePatient(Patient patient) {
		if(patientRepository.existsById(patient.getPatientId())) {
			throw new PatientAlreadyExistsException("Patient already Exists");
		}
		else {
			return patientRepository.save(patient);
		}
	}
	
	@Autowired
	public PatientMapper mapper;

	@Override
	public PatientDTO viewPatientProfileInfo(long id) {
		if(patientRepository.existsById(id)) {
			Patient patient=patientRepository.getPatientById(id);
			PatientDTO patientDto=mapper.converToDto(patient);
			return patientDto;
		}
		else {
			throw new PatientNotFoundException("Patient not foind exception");
		}
	}

	@Override
	public PatientDTO editPatientProfileInfo(long id, PatientDTO patientDto) {
		if(patientRepository.existsById(id)) {
			Patient patient1 = patientRepository.getPatientById(id);
			
			patient1.setPatientName(patientDto.getPatientName());
            patient1.setPatientPhone(patientDto.getPatientPhone());
            patient1.setPatientLocation(patientDto.getPatientLocation());
            patient1.setPatientImageUrl(patientDto.getPatientImageUrl());
            patient1.setPatientAge(patientDto.getPatientAge());
            patient1.setPatientMail(patientDto.getPatientMail());
            patient1.setPatientBloodgroup(patientDto.getPatientBloodgroup());
            patient1.setPatientHeight(patientDto.getPatientHeight());
            patient1.setPatientGender(patientDto.getPatientGender());
            patient1.setTitle(patientDto.getTitle());
            patient1.setPatientDOB(patientDto.getPatientDOB());
            patient1.setAllergie(patientDto.getAllergie());
            patient1.setActiveIssue(patientDto.getActiveIssue());
            patient1.setActiveIssue(patientDto.getActiveIssue());
            patientRepository.save(patient1);
            PatientDTO pDto = mapper.converToDto(patient1);
            return pDto;
		}
		else {
			throw new PatientNotFoundException("Patient not found exception");
		}
	}

	@Override
	public PatientDTO addPatientProfilePicture(long id, String profileImageUrl) {
		if(patientRepository.existsById(id)) {
			Patient patientUpdated=patientRepository.getPatientById(id);
			patientUpdated.setPatientImageUrl(profileImageUrl);
			patientRepository.save(patientUpdated);
			PatientDTO patientdto=mapper.converToDto(patientUpdated);
			return patientdto;
		}
		else {
			throw new PatientNotFoundException("Patient not found");
		}
	}

	@Override
	public PatientDTO deletePatientProfilePicture(long id) {
		if(patientRepository.existsById(id)) {
			Patient patient3=patientRepository.getPatientById(id);
			patient3.setPatientImageUrl(null);
			patientRepository.save(patient3);
			PatientDTO pdto=mapper.converToDto(patient3);
			return pdto;
		}
		else {
			throw new PatientNotFoundException("Patient not found");
		}
	}
	

}
