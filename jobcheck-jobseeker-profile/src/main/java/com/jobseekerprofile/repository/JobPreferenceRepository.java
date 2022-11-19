package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.JobPreference;

@Repository
public interface JobPreferenceRepository extends JpaRepository<JobPreference, Long>{
	
	@Query("select jp from JobPreference jb where jp.jobPreferenceId=:jobPreferenceId")
	JobPreference getPreferenceById(@Param("jobPreferenceId") long jobPreferenceId);

}
