package com.jobseekerprofile.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobseekerprofile.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicDetailDto {
	
	private long detailsId;
	
	private String fullName;
	
	private String email;
	
	private String phonenumber;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob;
	
	@Enumerated(EnumType.STRING)
	@JsonIgnore
	private Gender gender;
}
