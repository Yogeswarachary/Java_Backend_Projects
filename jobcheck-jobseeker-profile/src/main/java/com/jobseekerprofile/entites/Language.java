package com.jobseekerprofile.entites;

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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long languageId;
	
	private String language;
	
	@ManyToMany(mappedBy = "language")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
}
