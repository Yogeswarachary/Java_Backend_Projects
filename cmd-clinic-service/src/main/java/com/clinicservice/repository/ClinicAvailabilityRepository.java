package com.clinicservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.clinicservice.entites.ClinicAvailability;
import com.clinicservice.enums.Week;

public interface ClinicAvailabilityRepository extends JpaRepository<ClinicAvailability, Long>{
	
	@Query("Select c from ClinicAvailability c where c.week= :week")
	public List<ClinicAvailability> getClinicByDay(@Param("week") Week week);
}
