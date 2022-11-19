package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.PersonalBio;

@Repository
public interface PersonalBioRepository extends JpaRepository<PersonalBio, Long>{
	
	@Query("select p from PersonalBio p where p.personalBioId=:personalBioId")
	public PersonalBio getPersonalBioById(@Param(value="personalBioId")long personalBioId);
	
	
}
