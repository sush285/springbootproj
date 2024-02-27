package com.springboot.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootcrud.dao.CourseDao;
import com.springboot.springbootcrud.dto.CourseDto;

@Service
public class CourseService {

	@Autowired
	CourseDao cdao;
	
	public String insertCourse(CourseDto dto) {
		return cdao.insertCourse(dto);
	}
	
	public CourseDto fetchCourse(String Coursename) {
		return cdao.fetchCourse(Coursename);
	}
}
