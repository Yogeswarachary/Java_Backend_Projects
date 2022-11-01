package com.appointment_service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.DoctorDetails;
import com.appointment_service.entites.Recommendation;
import com.appointment_service.exception.DoctorNameNotFoundException;
import com.appointment_service.repository.DoctorDetailsRepository;
import com.appointment_service.repository.RecommendationRepository;
import com.appointment_service.service.RecommendationService;

@Service
public class RecommendationServiceImpl implements RecommendationService {
	
	@Autowired
	RecommendationRepository recRepo;
	
	@Autowired
	DoctorDetailsRepository docRepo;
	
	@Override
	public Recommendation addRecommendation(Recommendation rec) throws DoctorNameNotFoundException{
		recRepo.save(rec);
		return rec;
	}
	
	@Override
	public void removeRecommendation(long recommendationId) throws DoctorNameNotFoundException{
		recRepo.deleteById(recommendationId);
	}
	

	@Override
	public List<Recommendation> getAllRecommendation() throws DoctorNameNotFoundException {
		return recRepo.findAll();
	}

	@Override
	public List<DoctorDetails> getAllDoctors() throws DoctorNameNotFoundException {
		List<DoctorDetails> docList=docRepo.findAll();
		return docList;
	}

}
