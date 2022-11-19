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
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long certificateId;
	
	private String certificateName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="certificationId")
	private CertificationDetail certificationDetails;
	
	@ManyToMany(mappedBy = "certificates")
	@JsonIgnore
	private List<JobSeekerProfile> jobSeekerProfile=new ArrayList<>();
}
