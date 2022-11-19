package com.jobseekerprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.BasicDetail;

@Repository
public interface BasicDetailRepository extends JpaRepository<BasicDetail, Long>{
	

}
