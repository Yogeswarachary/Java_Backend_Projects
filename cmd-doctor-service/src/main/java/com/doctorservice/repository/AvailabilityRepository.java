package com.doctorservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.doctorservice.entites.Availability;
import com.doctorservice.enums.Day;

@Repository
@EnableJpaRepositories
public interface AvailabilityRepository  extends JpaRepository<Availability, Long>{
	
	@Query(value = "select * from Availability a where a.doctor_id =:id",nativeQuery = true)
	List<Availability> findAvailabilityById(long id);

	@Query(value = "select * from Availability a where a.doctor_id = :id and a.day = :day",nativeQuery = true)
	Availability getDoctorAvailabilityByDay(@Param(value = "id")long id, @Param(value = "day")Day day);

}
