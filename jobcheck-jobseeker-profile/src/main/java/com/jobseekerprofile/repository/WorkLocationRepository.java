package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.WorkLocation;

@Repository
public interface WorkLocationRepository extends JpaRepository<WorkLocation, Long>{
	
	@Query(value="select wl from WorkLocation wl")
	List<WorkLocation> getAllWorkLocation();
	
	@Query(value="select wl from WorkLocation wl where wl.location=:location")
	WorkLocation getByLocation(@Param("location") String location);

}
