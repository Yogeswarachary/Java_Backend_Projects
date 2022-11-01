package com.patientservice.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long feedbackId;
	
	@Column(name="q1")
	private String q1;
	
	@Column(name="q2")
	private String q2;
	
	@Column(name="q3")
	private String q3;
	
	@Column(name="q4")
	private String q4;
	
	@Column(name="comment")
	private String comment;
}
