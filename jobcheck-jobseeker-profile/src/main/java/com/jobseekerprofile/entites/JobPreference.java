package com.jobseekerprofile.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jobseekerprofile.enums.EmployementType;
import com.jobseekerprofile.enums.JobType;
import com.jobseekerprofile.enums.PreferedShift;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPreference {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobPreferenceId;
	
	private double expectedSalary;
	
	@Enumerated(EnumType.STRING)
	private JobType jobtype;
	
	@Enumerated(EnumType.STRING)
	private EmployementType employementType;
	
	@Enumerated(EnumType.STRING)
	private PreferedShift preferedShift;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="jobPreference_workLocation_mapping",
	joinColumns=@JoinColumn(name="jobPreferenceId"),
	inverseJoinColumns = @JoinColumn(name="workLocationId"))
	@JsonIgnore
	private List<WorkLocation> workLocation=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="jobPreference_JobRole_mapping",
	joinColumns = @JoinColumn(name="jobPreferenceId"),
	inverseJoinColumns = @JoinColumn(name="jobRoleId"))
	@JsonIgnore
	private List<PreferredJobRole> preferredJobRole=new ArrayList<>();
}
