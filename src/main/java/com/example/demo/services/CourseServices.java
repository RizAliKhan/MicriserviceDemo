package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Course;

@Service
public interface CourseServices {

	public Course addNewCourse();
	public Course updateCourseById(int cid);
	public Course deleteCourseByID(int cid);
	public Course findCourseById(int cid);
	
}
