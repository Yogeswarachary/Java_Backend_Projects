package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.Specialization;

public interface SpecializationService {
	
	Specialization editSpecialization(String specialization, long profileId);
	
	Specialization postSpecialization(long profileId, String specialization);
	
	List<Specialization> getSpecialization();
	
	Specialization addSpecialization(Specialization specialization);
}
