package com.jobseekerprofile.entites;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CertificationDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long certificationId;
	
	private String issuingOrganization;
	
	private String credentialId;
	
	private String credentialUrl;
	
	@DateTimeFormat(pattern = "dd//MM//yyyy")
	private LocalDate issueDate;
	
	@DateTimeFormat(pattern = "dd//MM//yyyy")
	private LocalDate expirationDate;
}
