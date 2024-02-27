package com.springboot.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.springbootcrud.dto.CourseDto;
import com.springboot.springbootcrud.dto.StudentDto;
import com.springboot.springbootcrud.service.CourseService;
import com.springboot.springbootcrud.service.StudentService;

@Controller
public class StudentController {
    
	@Autowired
	StudentService sservice;
	
	@Autowired
	CourseService cservice;
	
	@RequestMapping("/shtml")
	public String sHtml() {
		return "student";
	}
	
	@PostMapping("/si")
	@ResponseBody
	public String inserStudent(@ModelAttribute StudentDto dto) {
		System.out.println(dto);
		String cn=dto.getCoursename();
		CourseDto courseDto=cservice.fetchCourse(cn);
		dto.setCourseDto(courseDto);
		System.out.println(dto);
		
		return sservice.insertStudent(dto);
	}
	
	@GetMapping("/fsid")
	public String fetchStudentById(@RequestParam int id,ModelMap map) {
		StudentDto studentDto=sservice.fetchStudentById(id);
		map.put("object", studentDto);
		return "fetchsid.html";
	}
	
	
	@GetMapping("/fall")
	public String fetchAllStudent(ModelMap map) {
		List<StudentDto> list=sservice.fetchAllStudent();
		map.put("objects", list);
		return "fetchallstudent.html";
	}
	
	
}
