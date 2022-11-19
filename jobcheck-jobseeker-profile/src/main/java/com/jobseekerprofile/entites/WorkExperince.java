package com.jobseekerprofile.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WorkExperince {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long workExperienceId;
	
	private int years;
	
	private String jobTitle;
	
	private String company;
	
	private double salary;
	
	private String jobDesc;
	
	private boolean currentlyWorking;
	
	private String noticePeriod;
	
	private LocalDate joiningDate;
	
	private LocalDate leavingDate;
}
