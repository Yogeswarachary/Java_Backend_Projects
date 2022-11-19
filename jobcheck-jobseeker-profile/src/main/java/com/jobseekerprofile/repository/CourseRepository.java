package com.jobseekerprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jobseekerprofile.entites.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	@Query("select c from Course c")
	List<Course> getAllCourses();
	
	@Query("select c from Course c where c.courseDesc=:courseDesc")
	Course getObjectByCourse(@Param("courseDesc") String courseDesc);

}
