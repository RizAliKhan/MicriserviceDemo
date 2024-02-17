package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Course;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceImpl implements CourseServices{

	@Override
	public Course addNewCourse() {
		log.info("Course added service ");
		return null;
	}

	@Override
	public Course updateCourseById(int cid) {
		log.info("Course update service");
		return null;
	}

	@Override
	public Course deleteCourseByID(int cid) {
		log.info("Course deleteCourseByID service");
		return null;
	}

	@Override
	public Course findCourseById(int cid) {
		log.info("Course findCourseById service");
		return null;
	}

}
