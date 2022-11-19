package com.jobseekerprofile.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PersonalBio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personalbioId;
	
	private String personalDesc;
}
