package com.jobseekerprofile.service;

import java.util.List;

import com.jobseekerprofile.entites.Course;

public interface CourseService {
	
	List<Course> getCourse();
	
	Course editCourseById(String courseDesc, long profileId);
	
	Course postCourse(long profileId, String courseDesc);
	
	Course addCourse(Course course);
}
