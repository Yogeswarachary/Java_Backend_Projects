package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.PreferredJobRole;

public interface PreferredJobRoleService {
	
	PreferredJobRole addJobRole(PreferredJobRole jobRole);
	
	List<PreferredJobRole> getAllJobRoles();
	
	List<PreferredJobRole> getJobs(String s);
}
