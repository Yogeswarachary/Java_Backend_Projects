package com.doctorservice.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDto {
	
	private String name;
	
	private String phone_no;
	
	private String speciality;
	
	private String gender;
	
	private String practice_location;
	
	
}
