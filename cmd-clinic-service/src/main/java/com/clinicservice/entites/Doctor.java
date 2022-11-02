package com.clinicservice.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long docId;
	
	private String title;
	
	private String name;
	
	private String  email;
	
	private String  phone_no;
	
	private String speciality;
	
	private String npi_no;
	
	private String practice_location;
	
	private String gender;
	
	@ManyToMany(mappedBy = "doctor")
	@JsonIgnore
	private List<Clinic> clinic=new ArrayList<>();
}
