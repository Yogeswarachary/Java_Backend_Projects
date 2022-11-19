package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.EducationDetail;

@Repository
public interface EducationDetailRepository extends JpaRepository<EducationDetail, Long>{
	
	@Query("select e from EducationDetail e where e.educationDetailsId=:educationDetailsId")
	public EducationDetail getById(@Param("educationDetailsId")long educationDetailsId);

}
