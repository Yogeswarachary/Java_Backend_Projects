package com.patientservice.entites;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionHistoryList {
	
	public List<PrescriptionHistory> prescriptionList=new ArrayList<>();
	
}
