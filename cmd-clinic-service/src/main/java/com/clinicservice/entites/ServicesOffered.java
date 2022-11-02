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
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ServicesOffered {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long serviceId;
	
	private String serviceName;
	
	private String serviceCode;
	
	private String serviceDesc;
	
	private double avgPrice;
	
	private boolean active;
	
	@ManyToMany(mappedBy = "service")
	@JsonIgnore
	private List<Clinic> clinic=new ArrayList<>();
}
