package com.appointment_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.appointment_service.entites.Appointment;
import com.appointment_service.entites.DoctorDetails;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Long>{
	
	@Query("select from Appointment where id=:id")
	public Appointment getTestsForAppointment(@Param(value="id") long id);
	
	@Query("select Appointment where id=:id")
	public Appointment getAppointmentByIdForRecommendation(@Param(value="id") long id);
	
	@Query("select from Appointment where id=:id")
	public Appointment getAppointmentById(@Param(value="id") long id);
	
	@Query("select from DoctorDetails where id=:id")
	public DoctorDetails getDoctorDetailsById(@Param(value = "id") long id);
	
	@Query("select from Appointment where id=:id")
	public List<Appointment> getAppointmentByPatientId(@Param(value="id") long id);
}
