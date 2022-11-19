package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.AreaOfIntrest;
import com.jobseekerprofile.entites.Experience;
import com.jobseekerprofile.exception.DuplicateAreaOfIntrestException;

public interface AreaOfIntrestService {
	
	List<AreaOfIntrest> getAreaOfIntrest();
	
	List<AreaOfIntrest> addAreaOfInterestToProfile(long profileId, List<String> areaOfIntrest) throws DuplicateAreaOfIntrestException;
	
	String deleteAreaOfIntrest(long profileId, String areaOfIntrest);
	
	AreaOfIntrest editAreaOfIntrest(long profileId, String areaOfIntrest);
	
	AreaOfIntrest addAreaOfIntrest(AreaOfIntrest areaOfIntrest);
	
	List<AreaOfIntrest> getAreaOfIntrestByChar(String s);
	
	AreaOfIntrest addExperince(long profileId, long areaIntrestId, Experience experince);
}
