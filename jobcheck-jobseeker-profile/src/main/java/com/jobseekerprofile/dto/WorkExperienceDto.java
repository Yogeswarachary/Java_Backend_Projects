package com.jobseekerprofile.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperienceDto {
	
	private long workExperience;
	
	private int years;
	
	private boolean currentlyWorking;
	
	private String jobTitle;
	
	private String company;
	
	private long salary;
}
