package com.clinicservice.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stateId;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="stateId")
	@JsonIgnore
	private List<City> city=new ArrayList<>();
	
}
