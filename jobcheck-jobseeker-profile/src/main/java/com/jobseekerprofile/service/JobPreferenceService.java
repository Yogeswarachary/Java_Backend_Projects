package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.JobPreference;
import com.jobseekerprofile.entites.PreferredJobRole;
import com.jobseekerprofile.enums.EmployementType;
import com.jobseekerprofile.enums.JobType;
import com.jobseekerprofile.enums.PreferedShift;
import com.jobseekerprofile.exception.DuplicateJobRolesException;

public interface JobPreferenceService {
	
	JobPreference  postEmploymentType(long profileId, EmployementType empType);
	
	JobPreference postPreferredShift(long profileId,PreferedShift preferedShift);
	
	JobPreference editEmploymentType(long profileId, EmployementType empType);
	
	JobPreference editPreferedShift(long profileId,PreferedShift preferedShift);
	
	List<PreferredJobRole> addJobRolesToJobPreference(long profileId,List<String> jobRole) throws DuplicateJobRolesException;
	
	JobPreference postExpectedSalary( long profileId ,double expectedSalary) ;
	
	JobPreference editExpectedSalary( long profileId ,double expectedSalary);
	
	JobPreference addJobType(long profileId,JobType jobType);
	
	JobPreference editJobType(long profileId,JobType jobType);
	
	String deleteJobRole(long profileId,String jobRole);
}
