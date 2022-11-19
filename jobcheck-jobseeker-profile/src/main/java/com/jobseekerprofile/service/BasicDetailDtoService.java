package com.jobseekerprofile.service;

import com.jobseekerprofile.dto.BasicDetailDto;
import com.jobseekerprofile.entites.BasicDetail;
import com.jobseekerprofile.enums.Gender;

public interface BasicDetailDtoService {
	
	BasicDetail addBasicDetail(BasicDetailDto basicDetailDto, Gender gender);
	
	BasicDetail getBasicDetail(long profileId);
	
	BasicDetail editBasicDetail(long profileId, BasicDetailDto basicDetailDto, Gender gender);
}
