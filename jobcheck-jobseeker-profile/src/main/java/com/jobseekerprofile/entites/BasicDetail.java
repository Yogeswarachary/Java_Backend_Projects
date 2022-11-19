package com.jobseekerprofile.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.jobseekerprofile.enums.Gender;
import com.jobseekerprofile.enums.WorkStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BasicDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long detailsId;
	
	private String fullName;
	
	private String email;
	
	private long phoneNumber;
	
	private String imageUrl;
	
	@DateTimeFormat(pattern = "dd//MM//yyyy")
	private LocalDate dob;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Enumerated(EnumType.STRING)
	private WorkStatus workStatus;
}
