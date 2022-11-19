package com.jobseekerprofile.service;

import com.jobseekerprofile.dto.WorkExperienceDto;
import com.jobseekerprofile.entites.WorkExperince;
import com.jobseekerprofile.exception.PersonNotExistException;

public interface WorkExperienceService {
	
	WorkExperince addWorkExperinceByPersonId(long id, WorkExperince workExperince) throws PersonNotExistException;
	
	WorkExperince editWorkExperinceByPersonId(long id, long workExperinceId, WorkExperince workExperince) throws PersonNotExistException;
	
	public WorkExperince chooseWorkExperince(long id, WorkExperienceDto exp) throws PersonNotExistException;
}
