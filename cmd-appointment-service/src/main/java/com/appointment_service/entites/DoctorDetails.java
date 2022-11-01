package com.appointment_service.entites;

import javax.persistence.Column;
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
public class DoctorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String mobileNumber;
	
	private String emailId;
	
	@Column(name = "NPI_Number")
	private String npi;
	
	@Column(name = "Practice_Location")
	private String pracLocation;
	
	private String specialist;

	private String imageName;
	
}
