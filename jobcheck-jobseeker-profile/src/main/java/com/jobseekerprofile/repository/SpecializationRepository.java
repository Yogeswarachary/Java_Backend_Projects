package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long>{
	
	@Query("select s from Specialization s")
	List<Specialization> getAllSpecialization();
	
	@Query("select s from Specialization s where s.specializationDesc=:specialization")
	Specialization getObjectByName(@Param("specialization")String specialization);

}
