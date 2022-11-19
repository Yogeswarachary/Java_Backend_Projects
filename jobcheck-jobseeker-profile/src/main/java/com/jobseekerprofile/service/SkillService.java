package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.Skill;
import com.jobseekerprofile.exception.DuplicateSkillsException;

public interface SkillService {
	
	Skill postSkills(Skill skill);
	
	List<Skill> getSkills();
	
	List<Skill> addSkillByProfileId(long profileId, List<String> skill) throws DuplicateSkillsException;
	
	String deleteSkillInProfile(long profileId, String skill);
	
	List<Skill> getSkillByChar(String s);
}
