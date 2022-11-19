package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
