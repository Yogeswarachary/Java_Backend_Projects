package com.doctorservice.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DoctorId")
	private long id;
	
	private String title;
	
	private String name;
	
	private String email;
	
	private String phone_no;
	
	private String speciality;
	
	private String npi_no;
	
	private String practice_location;
	
	private String gender;
	
	private String  blood_group;
	
	@Column(name = "Date_Of_Birth")
	private String dob;
	
	private String username;
	
	private String password;
	
	private String profile_picture;
	
	private String role;
}
