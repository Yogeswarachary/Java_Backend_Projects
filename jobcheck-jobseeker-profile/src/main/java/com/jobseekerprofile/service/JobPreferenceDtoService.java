package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.JobPreference;

public interface JobPreferenceDtoService {
	
	JobPreference addWorkLocation(long profileId, String location);
}
