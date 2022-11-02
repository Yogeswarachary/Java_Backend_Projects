package com.clinicservice.entites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.clinicservice.enums.Week;

import ch.qos.logback.core.status.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClinicAvailability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long availId;
	
	@Enumerated(EnumType.STRING)
	private Week week;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="clinicId")
	private Clinic clinic;

	public long getAvailId() {
		return availId;
	}

	public void setAvailId(long availId) {
		this.availId = availId;
	}

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	
	
	
}
