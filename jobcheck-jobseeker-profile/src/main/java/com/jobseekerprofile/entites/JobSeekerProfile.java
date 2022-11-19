package com.jobseekerprofile.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekerProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long profileId;
	
	private String currentLocation;
	
	@OneToOne
	@JoinColumn(name="basicDetailsId")
	@JsonIgnore
	private BasicDetail basicDetail;
	
	@OneToOne
	@JoinColumn(name="educationDetailId")
	@JsonIgnore
	private EducationDetail educationDetail;
	
	@OneToOne
	@JoinColumn(name="personalBioId")
	@JsonIgnore
	private PersonalBio personalBio;
	
	@OneToMany
	@JoinColumn(name="profileId")
	@JsonIgnore
	private List<WorkExperince> workExperince=new ArrayList<>();
	
	@OneToMany
	@JoinColumn(name="profileId")
	@JsonIgnore
	private List<JobPreference> jobPreference = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_skill_mapping",
	joinColumns = @JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="skillId"))
	@JsonIgnore
	private List<Skill> skill=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_skills_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="languageId"))
	@JsonIgnore
	private List<Language> language=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "profile_certificate_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="certificateId"))
	@JsonIgnore
	private List<Certificate> certificates=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="profile_AreaofIntrest_mapping",
	joinColumns=@JoinColumn(name="profileId"),
	inverseJoinColumns = @JoinColumn(name="areadOfIntrestId"))
	@JsonIgnore
	private List<AreaOfIntrest> areaOfIntrest=new ArrayList<>();
}