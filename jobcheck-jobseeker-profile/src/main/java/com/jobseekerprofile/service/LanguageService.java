package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.Language;
import com.jobseekerprofile.exception.DuplicateLanguagesException;

public interface LanguageService {
	
	Language addLanguage(Language language);
	
	String deleteLanguage(long id);
	
	List<Language> getLanguage();
	
	List<Language> addlanguageToProfile(long profileId, List<String> language) throws DuplicateLanguagesException;
	
	String deleteLanguageFromProfile(long profileId, String language);
}
