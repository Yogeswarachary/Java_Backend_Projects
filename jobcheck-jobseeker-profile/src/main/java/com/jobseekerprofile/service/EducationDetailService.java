package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.EducationDetail;
import com.jobseekerprofile.enums.EnglishFluency;

public interface EducationDetailService {
	
	EducationDetail addEnglish(long profileId, EnglishFluency english);
	
	EducationDetail editEnglish(long profileId, EnglishFluency english);
	
	String deleteEnglish(long profileId);
	
	EducationDetail addHighestQualification(long profileId, String highestQualification);
	
	EducationDetail editHighestQualification(long profileId, String highestQualification);
	
	EducationDetail addSchoolMedium(long profileId, String medium);
}
