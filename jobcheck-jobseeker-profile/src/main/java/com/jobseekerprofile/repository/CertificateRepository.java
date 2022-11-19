package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long>{
	
	@Query(value="select c from Certificate c where c.certificateId=:certificateId")
	Certificate getCertificateById(@Param("certificateId") long certificateId);
	
	@Query("select c from Certificate c where c.certificateName=:certificateName")
	Certificate getCertificateByName(@Param("certificateName")String certificateName);

}
