package com.appointment_service.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrescriptionHistoryList {
	
	public List<Prescriptions> prescriptionList = new ArrayList<>();
	
}
