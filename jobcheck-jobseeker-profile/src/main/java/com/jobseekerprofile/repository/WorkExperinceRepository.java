package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.JobSeekerProfile;
import com.jobseekerprofile.entites.WorkExperince;

@Repository
public interface WorkExperinceRepository extends JpaRepository<WorkExperince, Long>{
	
	@Query("select w from WorkExperince w where w .workExperinceId=:workExperinceId")
	public JobSeekerProfile getJobSeekerProfile(@Param(value="workExperinceId") long workExperince);

}
