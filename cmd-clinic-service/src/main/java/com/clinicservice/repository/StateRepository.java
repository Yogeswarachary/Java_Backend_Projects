package com.clinicservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.clinicservice.entites.State;

public interface StateRepository extends JpaRepository<State, Long>{
	
	@Query(value="select s from State s where s.name= :name")
	public State getStateObj(@Param("name") String name);
}
