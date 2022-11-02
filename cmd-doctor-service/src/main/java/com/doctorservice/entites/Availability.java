package com.doctorservice.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.doctorservice.enums.AvailabilityStatus;
import com.doctorservice.enums.Day;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Availability id")
	private long availId;
	
	private long doctorId;
	
	@Enumerated(EnumType.STRING)
	private Day day;
	
	@Enumerated(EnumType.STRING)
	private AvailabilityStatus status; 
	
}
