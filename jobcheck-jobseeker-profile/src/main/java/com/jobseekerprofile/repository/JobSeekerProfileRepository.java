package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.JobSeekerProfile;

@Repository
public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Long>{
	
	@Query(value="select j from JobSeekerProfile j where j.profileId=:profileId")
	JobSeekerProfile getJobSeekerProfileById(@Param(value = "profileId")long profileId);
	
	@Query("select j from JobSeekerProfile j")
	List<JobSeekerProfile> getProfileId();

}
