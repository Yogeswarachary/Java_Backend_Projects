package com.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long>{
	
	@Query("select Test where testId=:id")
	public Test getTestById(@Param(value="id") long id);
	
	@Query("select from Test where testName=:name")
	public Test getTestName(@Param(value="name") String name);
}
