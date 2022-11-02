package com.clinicservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {
	
	private long serviceId;
	
	private String serviceName;
	
	private String serviceCode;
	
	private String serviceDesc;
	
	private double avgPrice;
	
	private boolean active;
}
