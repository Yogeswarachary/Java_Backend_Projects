package com.patientservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientservice.entites.Feedback;
import com.patientservice.entites.Patient;
import com.patientservice.exceptions.FeedbackNotFoundException;
import com.patientservice.exceptions.PatientNotFoundException;
import com.patientservice.repository.FeedbackRepository;
import com.patientservice.repository.PatientRepository;
import com.patientservice.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	public FeedbackRepository feedbackRepository;
	
	@Autowired
	public PatientRepository patientRepository;

	@Override
	public long provideFeedback(long pId, Feedback feedback) {
		if(patientRepository.existsById(pId)) {
			Patient patient =patientRepository.getPatientById(pId);
			Feedback feedBackObj = feedbackRepository.save(feedback);
			patient.getFeedbacks().add(feedBackObj);
			patientRepository.save(patient);
			return feedBackObj.getFeedbackId();
		}
		else {
			throw new PatientNotFoundException("Patient Not Found");
		}
	}

	@Override
	public Feedback viewFeedback(long pId, long id) {
		if(patientRepository.existsById(pId)) {
			if(feedbackRepository.existsById(id)) {
				Feedback feedback=feedbackRepository.getById(id);
				return feedback;
			}
			else {
				throw new FeedbackNotFoundException("Feedback does not exists");
			}
		}
		else {
			throw new PatientNotFoundException("Patient not found exception");
		}
		
	}

	@Override
	public long editFeedback(long pId, long id, Feedback feedback) {
		if(patientRepository.existsById(pId)) {
			Patient patient=patientRepository.getPatientById(pId);
			Feedback feedBackObj=feedbackRepository.save(feedback);
			patient.getFeedbacks().add(feedBackObj);
			patientRepository.save(patient);
			return feedBackObj.getFeedbackId();
		}
		else {
			throw new PatientNotFoundException("Patient Not Found");
		}
	}

}
