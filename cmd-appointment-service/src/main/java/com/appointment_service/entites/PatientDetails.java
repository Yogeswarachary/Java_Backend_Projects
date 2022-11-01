package com.appointment_service.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
