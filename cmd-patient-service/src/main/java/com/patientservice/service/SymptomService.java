package com.patientservice.service;

import java.util.List;

import com.patientservice.entites.Symptom;

public interface SymptomService {
	
	public List<Symptom> viewAllSymptoms(long id); 
	public Symptom addSymptom(long id,Symptom symptom);
	public Symptom editSymptom(Symptom symptom,long patientId,long symptomId);
	public int removeSymptom(long patientId,long symptomId);	
}
