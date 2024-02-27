package com.springboot.springbootcrud.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springbootcrud.dto.CourseDto;
import com.springboot.springbootcrud.repository.CourseRepo;

@Component
public class CourseDao {

	@Autowired
	CourseRepo crepo;
	
	public String insertCourse(CourseDto dto) {
		crepo.save(dto);
		return "inserted";
	}
	
	public CourseDto fetchCourse(String Coursename) {
		Optional<CourseDto> cd=crepo.findById(Coursename);
		return cd.get();
	}
	
	
}
