package com.clinicservice.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clinic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clinicId;
	
	private String clinicName;
	
	private String businessName;
	
	private String streetAddr;
	
	private String clinicCountry;
	
	private String longitude;
	
	private String latitude;
	
	private Date dateCreated;
	
	private String zipcode;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="clinic_doctor_mapping",
	joinColumns=@JoinColumn(name="clinicId"),
	inverseJoinColumns=@JoinColumn(name="docId"))
	@JsonIgnore
	private List<Doctor> doctor=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="clinic_service_mapping",
	joinColumns=@JoinColumn(name="clinicId"),
	inverseJoinColumns=@JoinColumn(name="serviceId"))
	@JsonIgnore
	private List<ServicesOffered> service=new ArrayList<>();
}
