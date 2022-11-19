package com.jobseekerprofile.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
public class AreaOfIntrest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long areaIntrestId;
	
	private String areaOfIntrest;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="areaInstrestId")
	private List<Experience> experience=new ArrayList<>();
	
	@ManyToMany(mappedBy = "areaOfIntrest")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
}
