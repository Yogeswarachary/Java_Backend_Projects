package com.appointment_service.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String issue;
	
	private String date;
	
	private String time;
	
	private String status;
	
	private String name;
	
	private int age;
	
	private long patientId;
	
	@JsonIgnore
	@OneToOne
	Comment comment;
	
	@JsonIgnore
	@OneToOne
	DoctorDetails doctorDetails;
	
	@JsonIgnore
	private Feedback feedback;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="vitals_id")
	private Vitals vitals;
	
	@JsonIgnore
	@OneToMany
	private List<Prescriptions> prescriptions;
	
	@JsonIgnore
	@ManyToMany
	private List<Recommendation>recommendations=new ArrayList<>();
	
	@JsonIgnore
	@ManyToMany
	private List<Test> tests=new ArrayList<>();
}
