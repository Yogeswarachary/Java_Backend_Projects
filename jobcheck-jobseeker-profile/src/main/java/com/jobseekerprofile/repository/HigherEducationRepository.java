package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.HigherEducation;

@Repository
public interface HigherEducationRepository extends JpaRepository<HigherEducation, Long>{
	
	@Query("select h from HigherEducation h where h.higherEducationId=:id")
	public HigherEducation getById(@Param(value = "id")long id);

}
