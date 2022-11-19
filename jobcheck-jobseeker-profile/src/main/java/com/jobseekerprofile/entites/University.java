package com.jobseekerprofile.entites;

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
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long universityId;
	
	private String universityName;
}
