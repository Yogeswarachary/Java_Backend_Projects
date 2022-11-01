package com.patientservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
	
	private long patientId;
	
	private String patientName;
	
	private String patientPhone;
	
	private String patientLocation;
	
	private String patientImageUrl;
	
	private int patientAge;
	
	private String patientMail;
	
	private String patientBloodgroup;
	
	private float patientHeight;
	
	private String patientGender;
	
	private String title;
	
	private String patientDOB;
	
	private String allergie;
	
	private String activeIssue;
	
	private String medicalProblem;
}
