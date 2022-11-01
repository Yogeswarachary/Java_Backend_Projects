package com.appointment_service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.Comment;
import com.appointment_service.exception.AppointmentNotFoundException;
import com.appointment_service.repository.CommentRepo;
import com.appointment_service.repository.IAppointmentRepository;
import com.appointment_service.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	IAppointmentRepository appointmentRepo;
	
	@Override
	public Comment getComment(long id) {
		Comment cmt=appointmentRepo.getAppointmentById(id).getComment();
		return cmt;
	}
	
	@Override
	public Comment addComment(Comment comment, long id) throws AppointmentNotFoundException {
		if(appointmentRepo.existsById(id)) {
			Appointment appointment=appointmentRepo.getAppointmentById(id);
			appointment.setComment(comment);
			commentRepo.save(comment);
			return comment;
		}
		else {
			throw new AppointmentNotFoundException();
		}
	}
	
	@Override
	public Comment editComment(String comment, long id) {
		Comment cmt=commentRepo.getCommentById(id);
		cmt.setCommentName(comment);
		return commentRepo.save(cmt);
	}
}
