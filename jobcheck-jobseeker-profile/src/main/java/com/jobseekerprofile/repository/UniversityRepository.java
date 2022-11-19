package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long>{
	
	@Query("select u from University u")
	List<University> getAllUniversities();
	
	@Query("select u from University u where u.universityId=:universityId")
	University getObjectById(@Param("universityId")long universityId);
	
	@Query("select u from University u where u.universityName=:universityName")
	University getObjectByName(@Param("universityName") String universityName);

}
