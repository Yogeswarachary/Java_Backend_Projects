package com.appointment_service.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prescriptions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long prescriptionId;
	
	private String medicineName;
	
	private long duration;
	
	private String medicineCycle;
	
	private boolean take_with_food;
	
	private String description;
}
