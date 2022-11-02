package com.clinicservice.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClinicRequest {
	
	private long clinicId;
	
	private String clinicName;
	
	private String businessName;
	
	private String streetAddr;
	
	private String clinicCountry;
	
	private String longitude;
	
	private String latitude;
	
	private Date dateCreated;
	
	private String zipcode;
	
	
	
}
