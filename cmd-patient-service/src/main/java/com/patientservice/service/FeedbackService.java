package com.patientservice.service;

import com.patientservice.entites.Feedback;

public interface FeedbackService {
	
	public long provideFeedback(long pId, Feedback feedback);
	
	public Feedback viewFeedback(long pId, long id);
	
	public long editFeedback(long pId, long id, Feedback feedback);
}
