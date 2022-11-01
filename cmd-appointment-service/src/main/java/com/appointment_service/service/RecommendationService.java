package com.appointment_service.service;

import java.util.List;

import com.appointment_service.entites.DoctorDetails;
import com.appointment_service.entites.Recommendation;
import com.appointment_service.exception.DoctorNameNotFoundException;

public interface RecommendationService {
	
	Recommendation addRecommendation(Recommendation rec) throws DoctorNameNotFoundException;

	void removeRecommendation(long recommendationId) throws DoctorNameNotFoundException;

	List<Recommendation> getAllRecommendation() throws DoctorNameNotFoundException;

	List<DoctorDetails> getAllDoctors() throws DoctorNameNotFoundException;
}
