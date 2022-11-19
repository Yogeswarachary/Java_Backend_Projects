package com.jobseekerprofile.service;

import com.jobseekerprofile.entites.BasicEducation;
import com.jobseekerprofile.enums.Board;
import com.jobseekerprofile.exception.BasicEducationNotFoundException;

public interface BasicEducationService {
	
	BasicEducation addTotalMarks(long profileId, String totalMarks);
	
	BasicEducation editTotalMarks(long profileId, String totalMarks) throws BasicEducationNotFoundException;
	
	BasicEducation getTotalMarksById(long basicEducationId) throws BasicEducationNotFoundException;
	
	BasicEducation addBoardToBasicDetail(long profileId, Board board);
	
	BasicEducation editBoard(long profileId, Board board);
}
