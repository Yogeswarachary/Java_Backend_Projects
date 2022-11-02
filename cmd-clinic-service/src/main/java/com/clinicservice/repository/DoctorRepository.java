package com.clinicservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicservice.entites.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
