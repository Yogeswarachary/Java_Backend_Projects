package com.appointment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
	

}
