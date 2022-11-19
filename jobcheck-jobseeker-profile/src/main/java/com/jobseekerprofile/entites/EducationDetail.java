package com.jobseekerprofile.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.jobseekerprofile.enums.EnglishFluency;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EducationDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long educationDetailId;
	
	private String highestQualification;
	
	private String schoolName;
	
	@Enumerated(EnumType.STRING)
	private EnglishFluency englishFluency;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="basicEducationId")
	private BasicEducation basicEducation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="higherEducationId")
	private HigherEducation higherEducation;
}
