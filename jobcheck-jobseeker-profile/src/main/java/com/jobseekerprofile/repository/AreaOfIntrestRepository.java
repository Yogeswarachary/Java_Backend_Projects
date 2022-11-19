package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.AreaOfIntrest;

@Repository
public interface AreaOfIntrestRepository extends JpaRepository<AreaOfIntrest, Long>{
	
	@Query(value = "select a from AreaOfIntrest a")
	List<AreaOfIntrest> getareaOfintrest();
	
	@Query(value="select a from AreaOfIntrest a where a.areaOfIntrest=:areaOfIntrest")
	AreaOfIntrest getObjectByName(@Param("areaOfIntrest") String areaOfIntrest);
	
	@Query(value="select a from AreaOfIntrest a where a.areaIntrestId=:areaIntrestId")
	AreaOfIntrest getObjectById(@Param("areaIntrestId") long areaIntrestId);

}
