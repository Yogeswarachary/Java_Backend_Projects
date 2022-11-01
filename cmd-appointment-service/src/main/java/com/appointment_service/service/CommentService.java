package com.appointment_service.service;

import com.appointment_service.entites.Comment;
import com.appointment_service.exception.AppointmentNotFoundException;

public interface CommentService {
	
	public Comment addComment(Comment comment, long id) throws AppointmentNotFoundException;
	
	public Comment getComment(long id);
	
	public Comment editComment(String comment, long id);
}
