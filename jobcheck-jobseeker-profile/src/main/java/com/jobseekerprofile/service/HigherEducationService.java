package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.HigherEducation;
import com.jobseekerprofile.enums.CourseType;
import com.jobseekerprofile.enums.GradingSystem;
import com.jobseekerprofile.exception.HigherEducationNotFoundException;
import com.jobseekerprofile.exception.JobSeekerProfileNotFoundException;
import com.jobseekerprofile.exception.MarksNotFoundException;

public interface HigherEducationService {
	
	HigherEducation getMarksById(long profileId) throws HigherEducationNotFoundException;
	
	HigherEducation editMarksById(long profileId, HigherEducation higherEducation);
	
	HigherEducation addMarksById(long profileId, HigherEducation higherEducation);
	
	HigherEducation deleteMarksById(long profileId) throws MarksNotFoundException, JobSeekerProfileNotFoundException;
	
	GradingSystem addingGradingAndCourse(long profileId, GradingSystem grade, CourseType courseType, HigherEducation higherEducation) throws JobSeekerProfileNotFoundException;
	
	GradingSystem editingGradingAndCourse(long profileId, GradingSystem grade, CourseType courseType, HigherEducation higherEducation) throws JobSeekerProfileNotFoundException;
	
	
}
