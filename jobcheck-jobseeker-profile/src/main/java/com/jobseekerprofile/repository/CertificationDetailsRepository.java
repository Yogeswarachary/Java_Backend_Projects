package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Certificate;

@Repository
public interface CertificationDetailsRepository extends JpaRepository<Certificate, Long>{
	
	@Query(value = "select from certificate where certificateId=:certificateId")
	Certificate getCertificateById(@Param("certificateId") long certificateId);
	
	@Query(" from Certificate where id = ?1")
	public Certificate getByCertificateId(@Param(value ="id")long id);
}
