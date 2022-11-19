package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.WorkLocation;
import com.jobseekerprofile.exception.DuplicateWorkLocationException;
import com.jobseekerprofile.exception.WorkLocationLimitException;

public interface WorkLocationService {
	
	List<WorkLocation> getWorkLocation();
	
	WorkLocation addWorkLocation(WorkLocation workLocation);
	
	List<WorkLocation> addWorkLocationToProfile(long profileId, List<String> location) throws DuplicateWorkLocationException, WorkLocationLimitException;
	
	String deleteWorkLocation(long profileId, String location);
	
	List<WorkLocation> getLocationByChar(String s);
}