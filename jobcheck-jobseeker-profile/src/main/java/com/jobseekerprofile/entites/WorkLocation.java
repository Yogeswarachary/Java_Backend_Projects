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

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class WorkLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationId;
	
	private String location;
	
	@ManyToMany(mappedBy = "workLocation")
	@JsonIgnore
	private List<JobPreference> jobPreference=new ArrayList<>();

	@Override
	public String toString() {
		return "WorkLocation [location=" + location + "]";
	}
}
