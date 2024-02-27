package com.springboot.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.springbootcrud.dto.StudentDto;
import com.springboot.springbootcrud.repository.CourseRepo;
import com.springboot.springbootcrud.repository.StudentRepo;

@Component
public class StudentDao {

	@Autowired
	StudentRepo srepo;
	
	public String insertStudent(StudentDto dto) {
		srepo.save(dto);
		return "data inserted";
	}
	
	public Optional<StudentDto> fetchStudentById(int id) {
		return srepo.findById(id);
	}
	
	public List<StudentDto> fetchAllStudent() {
		List<StudentDto> list=srepo.findAll();
		return list;
	}
}
