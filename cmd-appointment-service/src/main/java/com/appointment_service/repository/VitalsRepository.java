package com.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.Vitals;

@Repository
public interface VitalsRepository extends JpaRepository<Vitals, Long> {
	
	@Query(value="select from Vitals where id=:id")
	Vitals findByvitalId(@Param(value="id") long id);

}
