package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.BasicDetail;
import com.jobseekerprofile.enums.WorkStatus;
import com.jobseekerprofile.exception.JobSeekerProfileNotFoundException;

public interface BasicDetailService {
	
	String addBasicDetailPhoto(long profileId, String imageUrl) throws JobSeekerProfileNotFoundException;
	
	BasicDetail editBasicDetailPhoto(long profileId, BasicDetail basicDetails) throws JobSeekerProfileNotFoundException;
	
	String deleteBasicDetailsPhoto(long profileId) throws JobSeekerProfileNotFoundException;
	
	BasicDetail addWorkStatus(long profileId, WorkStatus workStatus);
	
	BasicDetail editWorkStatus(long profileId, WorkStatus workStatus);
}
