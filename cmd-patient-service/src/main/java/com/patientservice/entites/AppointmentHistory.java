package com.patientservice.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentHistory {
	
	private long appointmentHistoryId;
	
	private int year;
	
	private String doctorname;
	
	private String specialist;
	
	private String appointmentDate;
	
	private String comment;
	
	private String time;
}
