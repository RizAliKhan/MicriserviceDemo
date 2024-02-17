package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CourseServices;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MainController {

	@Autowired
	CourseServices service;

	@GetMapping("/")
	public void test() {
		log.info("hi : "+service);
		service.addNewCourse();
	}
	
}
