package com.jobseekerprofile.entites;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jobseekerprofile.enums.Board;
import com.jobseekerprofile.enums.SchoolMedium;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BasicEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long basicEducationId;
	
	private String passingOutYear;
	
	private String totalMarks;
	
	@Enumerated(EnumType.STRING)
	private Board board;
	
	@Enumerated(EnumType.STRING)
	private SchoolMedium schoolMedium;
}
