package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.University;

public interface UniversityService {
	
	University getUniversityById(long jobSeekerId);
	
	University editUniversity(String universityName, long jobSeekerId);
	
	List<University> getAllUniversites();
	
	University addUniversity(long profileId, String UniversityName);
	
	University postUniversity(University university);
}
