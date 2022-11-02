package com.clinicservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.clinicservice.entites.ServicesOffered;

public interface ServicesRepository extends JpaRepository<ServicesOffered, Long>{
	
	@Query(value="select s from ServicesOffered s where s.serviceId= :serviceId")
	public ServicesOffered getServiceObject(@Param("serviceId") long serviceId);

}
