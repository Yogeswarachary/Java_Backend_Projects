package com.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.Prescriptions;

@Repository
public interface IPrescriptionRepository extends JpaRepository<Prescriptions, Long> {
	
	@Query(value="select p from Prescription p where p.prescriptionId=:presId")
	public Prescriptions getByPrescriptionId(@Param(value="presId") long presId);

}
