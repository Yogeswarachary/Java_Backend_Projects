package com.patientservice.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionHistory {
	
	private long prescriptionId;
	
	private long medicineName;
	
	private long duration;
	
	private String medicineCycle;
	
	private boolean take_With_Food;
	
	private String description;
	
}
