package com.appointment_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.NewAppointment;

@Repository
public interface NewAppointmentRepository extends JpaRepository<NewAppointment, Long> {
	
	@Query(value = "select m from NewAppointment m")
	public List<NewAppointment> getAppointmentAll();
	
	@Query("select from NewAppointment where id=:id")
	public NewAppointment getAppointmentById(@Param(value="id") Long id);
}
