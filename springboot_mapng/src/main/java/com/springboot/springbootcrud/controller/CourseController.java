package com.springboot.springbootcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.springbootcrud.dto.CourseDto;
import com.springboot.springbootcrud.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService cservice;
	
	@RequestMapping("/chtml")
	public String courseHtml() {
		return "course";
	}
	
	@PostMapping("/ci")
	@ResponseBody
	public String insertCourse(@ModelAttribute CourseDto dto) {
		//System.out.println(dto);
	  return cservice.insertCourse(dto);
	}
}
