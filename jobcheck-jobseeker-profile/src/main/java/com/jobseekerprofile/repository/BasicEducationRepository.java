package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.BasicEducation;

@Repository
public interface BasicEducationRepository extends JpaRepository<BasicEducation, Long>{
	
	@Query("select b from BasicEducation b where b.basicEducationId=:basicEducationId")
	public BasicEducation getByBasicEducationId(@Param(value = "basicEducationId") long basicEducationId);

}
