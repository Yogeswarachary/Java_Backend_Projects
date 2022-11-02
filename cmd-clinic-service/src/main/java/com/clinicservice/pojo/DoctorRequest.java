package com.clinicservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorRequest {
	
	private String title;
	
	private String name;
	
	private String email;
	
	private String phone_no;
	
	private String speciality;
	
	private String npi_no;
	
	private String practice_location;
	
	private String gender;
	
	private String blood_group;
	
	private String dob;
	
	private String username;
	
	private String password;
	
	private String profile_picture;
	
	private String role;
}
