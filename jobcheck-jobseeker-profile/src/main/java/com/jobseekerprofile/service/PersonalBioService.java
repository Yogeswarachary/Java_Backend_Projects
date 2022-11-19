package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.PersonalBio;
import com.jobseekerprofile.exception.PersonNotExistException;
import com.jobseekerprofile.exception.PersonalInfoIdNotFoundException;

public interface PersonalBioService {
	
	public PersonalBio addPersonalBioByPersonId(long profile, PersonalBio personalBio) throws PersonalInfoIdNotFoundException;
	
	public PersonalBio editPersonalBioByPersonId(long profileId, long personalBioId, PersonalBio personalBio) throws PersonNotExistException;
	
	public void removePersonalBio(long profileId, long personalBioId) throws PersonNotExistException;
}
