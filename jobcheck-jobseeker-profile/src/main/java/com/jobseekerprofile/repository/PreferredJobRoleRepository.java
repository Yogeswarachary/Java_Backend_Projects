package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jobseekerprofile.entites.PreferredJobRole;

public interface PreferredJobRoleRepository extends JpaRepository<PreferredJobRole, Long>{
	
	@Query(value="select j from PreferredJobRole j")
	List<PreferredJobRole> getAll();
	
	@Query(value="select j from PreferredJobRole j where j.jobRole=:jobRole")
	PreferredJobRole getObjectByRole(@Param("jobRole")String jobRole);

}
