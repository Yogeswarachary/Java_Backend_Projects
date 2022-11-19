package com.jobseekerprofile.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobseekerprofile.entites.AreaOfIntrest;
import com.jobseekerprofile.entites.Experience;
import com.jobseekerprofile.entites.JobSeekerProfile;
import com.jobseekerprofile.exception.DuplicateAreaOfIntrestException;
import com.jobseekerprofile.repository.AreaOfIntrestRepository;
import com.jobseekerprofile.repository.JobSeekerProfileRepository;
import com.jobseekerprofile.repository.WorkExperinceRepository;
import com.jobseekerprofile.service.AreaOfIntrestService;

@Service
public class AreaOfIntrestServiceImpl implements AreaOfIntrestService {
	
	@Autowired
	AreaOfIntrestRepository areaRepo;
	
	@Autowired
	JobSeekerProfileRepository jobSeekerRepo;
	
	@Autowired
	WorkExperinceRepository expRepo;

	@Override
	public List<AreaOfIntrest> getAreaOfIntrest() {
		
		List<AreaOfIntrest> areaIn=null;
		areaIn=areaRepo.getareaOfintrest();
		return areaIn;
	}

	@Override
	public List<AreaOfIntrest> addAreaOfInterestToProfile(long profileId, List<String> areaOfIntrest)
			throws DuplicateAreaOfIntrestException {
		JobSeekerProfile jobSeekerProfile=jobSeekerRepo.getJobSeekerProfileById(profileId);
		List<AreaOfIntrest> ai=jobSeekerProfile.getAreaOfIntrest();
		for(String s: areaOfIntrest) {
			AreaOfIntrest a=areaRepo.getObjectByName(s);
			if(!ai.contains(a)) {
				ai.add(a);
				List<JobSeekerProfile> jp=new ArrayList<>();
				jp.add(jobSeekerProfile);
				a.setJobSeekerProfile(jp);
				jobSeekerProfile.setAreaOfIntrest(ai);
				areaRepo.save(a);
				jobSeekerRepo.save(jobSeekerProfile);
			}
			else {
				throw new DuplicateAreaOfIntrestException();
			}
		}
		return jobSeekerProfile.getAreaOfIntrest();
	}

	@Override
	public String deleteAreaOfIntrest(long profileId, String areaOfIntrest) {
		if(jobSeekerRepo.existsById(profileId)) {
			JobSeekerProfile jp=jobSeekerRepo.getJobSeekerProfileById(profileId);
			AreaOfIntrest ai=areaRepo.getObjectByName(areaOfIntrest);
			jp.getAreaOfIntrest().remove(ai);
			ai.getJobSeekerProfile().remove(jp);
			areaRepo.save(ai);
			jobSeekerRepo.save(jp);
		}
		return "Deleted";
	}

	@Override
	public AreaOfIntrest editAreaOfIntrest(long profileId, String areaOfIntrest) {
		JobSeekerProfile jobSeekerProfile=jobSeekerRepo.getJobSeekerProfileById(profileId);
		if(jobSeekerRepo.existsById(jobSeekerProfile.getProfileId())) {
			jobSeekerProfile=jobSeekerRepo.findById(jobSeekerProfile.getProfileId()).get();
		}		
		return null;
	}

	@Override
	public AreaOfIntrest addAreaOfIntrest(AreaOfIntrest areaOfIntrest) {
		areaRepo.save(areaOfIntrest);
		return areaOfIntrest;
	}

	@Override
	public List<AreaOfIntrest> getAreaOfIntrestByChar(String s) {
		List<AreaOfIntrest> ai=areaRepo.getareaOfintrest();
		List<AreaOfIntrest> intrests=new ArrayList<>();
		List<AreaOfIntrest> a=new ArrayList<>();
		for(AreaOfIntrest areaOfIntrest:ai) {
			if(areaOfIntrest.getAreaOfIntrest().toLowerCase().startsWith(s.toLowerCase())) {
				intrests.add(areaOfIntrest);
			} else if(areaOfIntrest.getAreaOfIntrest().toLowerCase().contains(s.toLowerCase())) {
				a.add(areaOfIntrest);
			}
		} 
		if(intrests.isEmpty()) {
			return a;
		}
		return intrests;
	}

	@Override
	public AreaOfIntrest addExperince(long profileId, long areaIntrestId, Experience experince) {
		JobSeekerProfile jsp=jobSeekerRepo.getJobSeekerProfileById(profileId);
		AreaOfIntrest ai=areaRepo.getObjectById(areaIntrestId);
		if(jsp.getAreaOfIntrest().contains(ai)) {
			//ai.add(experince);
		//}
		//expRepo.save(experince);
		//areaRepo.save(ai);
		//return ai;
		return  ai;
	}
		return ai;	
	
	}	

}
