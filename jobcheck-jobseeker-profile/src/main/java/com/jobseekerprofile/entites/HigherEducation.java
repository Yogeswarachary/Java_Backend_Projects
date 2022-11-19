package com.jobseekerprofile.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.jobseekerprofile.enums.CourseType;
import com.jobseekerprofile.enums.GradingSystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HigherEducation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long higherEducationId;
	
	private double marks;
	
	private LocalDate passedOutYear;
	
	@Enumerated(EnumType.STRING)
	private GradingSystem gradingSystem;
	
	@Enumerated(EnumType.STRING)
	private CourseType courseType;
	
	@OneToOne
	@JoinColumn(name="UniversityId")
	private University university;
	
	@OneToOne
	@JoinColumn(name="courseId")
	private Course course;
	
}
