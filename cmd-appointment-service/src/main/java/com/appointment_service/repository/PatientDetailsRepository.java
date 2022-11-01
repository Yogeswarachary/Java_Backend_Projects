package com.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.PatientDetails;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long>{

}
