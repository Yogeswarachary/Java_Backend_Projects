package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.AreaOfIntrest;
import com.jobseekerprofile.entites.Certificate;
import com.jobseekerprofile.entites.EducationDetail;
import com.jobseekerprofile.entites.JobPreference;
import com.jobseekerprofile.entites.Language;
import com.jobseekerprofile.entites.PersonalBio;
import com.jobseekerprofile.entites.PreferredJobRole;
import com.jobseekerprofile.entites.Skill;
import com.jobseekerprofile.entites.WorkExperince;
import com.jobseekerprofile.entites.WorkLocation;

public interface JobSeekerProfileService {
	
	long getProfileId();
	
	List<AreaOfIntrest> getAreaOfIntrestOfProfile(long profileId);
	
	List<Skill> getSkillOfProfile(long profileId);
	
	List<WorkExperince> getWorkExperinceOfProfile(long profileId);
	
	List<Language> getLanguageOfProfile(long profileId);
	
	List<Certificate> getCertificateOfProfile(long profileId);
	
	List<WorkLocation> getWorkLocationOfProfile(long profileId);
	
	List<PreferredJobRole> getPreferredJobRoleOfProfile(long profileId);
	
	JobPreference getJobPreferenceOfProfile(long profileId);
	
	PersonalBio getPersonalBio(long profileId);
	
	EducationDetail getEducationDetail(long profileId);
}
