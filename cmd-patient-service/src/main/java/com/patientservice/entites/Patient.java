package com.patientservice.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	
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

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="patient_id")
	@JsonIgnore
	private List<Feedback> feedbacks;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	@JsonIgnore
	private List<Symptom> symptoms;
	
}
