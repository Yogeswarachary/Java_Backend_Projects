package com.clinicservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.clinicservice.entites.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	
	@Query("select from City where cityId=:cityId")
	public City getCityById(@Param(value="cityId") long cityId);
}
